const bool: boolean = true
const msg: string = 'test'
const num: number = 3
const fl: number = 3.2

// tuple
const tuple: [string, number] = ['hello', 3]

// any
let variable: any = 42
variable = 'hello';
// ...

// func
(function sayMyName(name: string): void{
    console.log(`hello ${name}`)
})('tom')

// type
type Login = string
const login: Login = 'Week'

type ID = number | string
const id1: ID = 'adsad'
const id2: ID = 123

