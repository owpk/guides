var Names;
(function (Names) {
    Names[Names["LOG"] = 0] = "LOG";
    Names[Names["SOME_NAME"] = 1] = "SOME_NAME";
    Names[Names["VOID"] = 2] = "VOID";
})(Names || (Names = {}));
var nm = Names.SOME_NAME;
var reverse = Names[0];
(function keys() {
    var ob = Object.keys(Names)
        .filter(function (i) { return isNaN(Number(i)); })
        .length;
    console.log(ob);
})();
