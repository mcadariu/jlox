import java.util.HashMap;
import java.util.Map;

public class Environment {

    private final Map<String, Object> values = new HashMap<>();
    final Environment enclosing;

    Environment() {
        enclosing = null;
    }

    Environment(Environment environment) {
        enclosing = environment;
    }

    void define(String name, Object value) {
        values.put(name, value);
    }

    Object get(Token name) {
        if (values.containsKey(name.lexeme))
            return values.get(name.lexeme);

        if (enclosing != null) return enclosing.get(name);

        throw new RuntimeException();
    }

    public void assign(Token name, Object value) {
        if (values.containsKey(name.lexeme)) {
            values.put(name.lexeme, value);
            return;
        }

        if (enclosing != null) {
            enclosing.assign(name, value);
        }

        throw new RuntimeException("Undefined variable '" + name.lexeme + "'.");
    }
}
