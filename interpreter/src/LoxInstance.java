import java.util.HashMap;

public class LoxInstance {
    private final LoxClass klass;
    private HashMap<String, Object> fields = new HashMap<>();

    LoxInstance(LoxClass loxClass) {
        this.klass = loxClass;
    }

    @Override
    public String toString() {
        return klass.name + " instance";
    }

    public Object get(Token name) {
        if (fields.containsKey(name.lexeme)) {
            return fields.get(name.lexeme);
        }

        LoxFunction method = klass.findMethod(name.lexeme);
        if(method != null) return method;

        throw new RuntimeException("Undefined property.");
    }

    public void set(Token name, Object value) {
        fields.put(name.lexeme, value);
    }
}
