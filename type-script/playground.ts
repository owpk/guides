function foo(bar: (n: number) => number, s: number) {
    let x:number = bar(s)
    console.log(x)
    console.log(s)
}

foo((x) => ++x, 4)