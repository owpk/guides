var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Typescript = /** @class */ (function () {
    function Typescript(version) {
        this.version = version;
    }
    Typescript.prototype.info = function (name) {
        return "".concat(name, " : version is ").concat(this.version);
    };
    return Typescript;
}());
var Car = /** @class */ (function () {
    function Car(theModel, someField) {
        this.someField = someField;
        this.numberOfWheels = 4;
        this.model = theModel;
    }
    return Car;
}());
var Animal = /** @class */ (function () {
    function Animal(voice, color) {
        this.voice = '';
        this.color = 'black';
        this.voice = voice;
        this.color = color;
    }
    Animal.prototype.go = function () {
        console.log('Go');
    };
    return Animal;
}());
var Cat = /** @class */ (function (_super) {
    __extends(Cat, _super);
    function Cat() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    // no super constructors
    Cat.prototype.meow = function () {
        this.go();
    };
    return Cat;
}(Animal));
var Gim = /** @class */ (function () {
    function Gim() {
    }
    return Gim;
}());
var car = new Car('asd', 's');
console.log(car.someField); // s
var cat = new Cat('meow', 'green');
