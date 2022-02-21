interface Person {
    name: string
    age: number
}

type PersonKeys = keyof Person

let key: PersonKeys
key = 'age'

type User = {
    _id: number
    name: string
    email: string
    createdAt: Date
}

type UserKeysNoMeta = Exclude<keyof User, '_id' | 'createdAt'> // name | email
type UserKeysNoMeta2 = Pick<User, 'name' | 'email'>

const u1: UserKeysNoMeta = 'name'
console.log(u1)
