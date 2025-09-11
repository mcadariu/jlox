# jlox
A basic tree-walking interpreter developed by following the excellent book [Crafting Interpreters](https://craftinginterpreters.com/) by R. Nystrom

At the moment, it can run programs like:

```
fun fib(n) {
    if (n <= 1) return n;
    return fib(n - 2) + fib(n - 1);
}

for (var i = 0; i < 20; i = i + 1) {
    print fib(i);
}
```
