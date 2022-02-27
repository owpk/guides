enum Names {
    LOG,
    SOME_NAME,
    VOID
}

const nm = Names.SOME_NAME
const reverse = Names[0];

// enum length
(function keys(): void {
    const ob = Object.keys(Names)
        .filter(i => isNaN(Number(i)))
        .length
    console.log(ob)
})()
