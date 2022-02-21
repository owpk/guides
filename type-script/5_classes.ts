class Typescript {
    version: string

    constructor(version: string) {
        this.version = version
    }

    info(name: string) {
        return `${name} : version is ${this.version}`
    }
}

class Car {
    readonly model: string
    readonly numberOfWheels: number = 4

    constructor(theModel: string, readonly someField: string) {
        this.model = theModel
    }
}

class Animal {

    protected voice: string = ''
    public color: string = 'black'
    private name: string

    constructor(voice: string, color: string) {
        this.voice = voice
        this.color = color
    }

    protected go() {
        console.log('Go')
    }
}

class Cat extends Animal {

    // no super constructors

    public meow() {
        this.go()
    }
}

abstract class Gim {
    abstract go(): void
}

const car = new Car('asd', 's')
console.log(car.someField) // s

const cat = new Cat('meow', 'green')
