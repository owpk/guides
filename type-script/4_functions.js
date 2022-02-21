function add(a, b) {
    return a + b;
}
function toUpperCase(str) {
    return str.toLocaleUpperCase(
    // locale
    );
}
console.log(toUpperCase('hello'));
function position(a, b) {
    if (!a && !b)
        return { x: undefined, y: undefined };
    if (a && !b)
        return { x: a, y: undefined, "default": a.toString() };
    return { x: a, y: b };
}
console.log(position(42));
console.log(position(42, 2));
console.log(position());
