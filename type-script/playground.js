var w = function (data, num) {
    return '';
};
var arr = [1, 2, 3]
    .slice(0, 1)
    .map(function (i) { return "j => ".concat(i); })
    .join();
console.log(arr);
console.log(4 / 3);
var floored = Math.floor(4 / 3);
console.log(floored);
var page = 1;
var onPage = 10;
var modulo = 100 % 5;
var sum = Array.from({ length: page }).map(function (_, idx) { return onPage + Number(idx < modulo); });
console.log(sum);
var getDataPart = function (data, pages, page) {
    var modulo = data.length % pages;
    var onPage = Math.floor(data.length / pages);
    var sum = Array.from({ length: page }).map(function (_, idx) { return onPage + Number(idx < modulo); });
    var from = sum.slice(0, -1)
        .reduce(function (acc, i) { return acc + i; }, 0);
    console.log(from);
    var to = sum.reduce(function (acc, i) { return acc + i; }, 0);
    return data.slice(from, to);
};
var data = [];
for (var i = 0; i < 100; i++) {
    data.push("".concat(i));
}
console.log(getDataPart(data, 5, 4));
console.log(19 % 2);
