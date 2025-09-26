# jlox
A tree-walking interpreter for Lox, a general-purpose object-oriented language. Developed by following along the excellent book [Crafting Interpreters](https://craftinginterpreters.com/) by R. Nystrom.

At the moment, it can run programs like:

```
class Greeting {
  sayHello() {
    print "Hello superclass";
  }
}

class Sub < Greeting {
  sayHello() {
    super.sayHello();
    print "Hello subclass";
  }
}

Sub().sayHello();
```
