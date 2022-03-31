function foo(bar, s) {
    var x = bar(s);
    console.log(x);
    console.log(s);
}
foo(function (x) { return ++x; }, 4);
