const arr: Array<number> = [11, 12, 13]

function reverse<T>(array: T[]): T[] {
    return array.reverse()
}

console.log(reverse([1, 2, 3, '4', '0']))
console.log(reverse(arr))
