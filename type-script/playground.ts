const w = (data: [], num: string): string => {
    return '';
}

interface A {
    go(): void
}

const arr = [1, 2, 3]
    .slice(0, 1)
    .map(i => `j => ${i}`)
    .join()

console.log(arr)

console.log(4 / 3)

const floored = Math.floor(4 / 3)

console.log(floored)



const page: number = 1;
const onPage: number = 10;
const modulo: number = 100 % 5;

const sum = Array.from({length: page}).map(
    (_, idx) => onPage + Number(idx < modulo)
);

console.log(sum)

const getDataPart = <T>(data: T[], pages: number, page: number) => {
    const modulo = data.length % pages;
    const onPage = Math.floor(data.length / pages);
    const sum = Array.from({ length: page }).map(
        (_, idx) => onPage + Number(idx < modulo)
    );
    const from = sum.slice(0, -1)
        .reduce((acc, i) => acc + i, 0);
    console.log(from)
    const to = sum.reduce((acc, i) => acc + i, 0);
    return data.slice(from, to);
};

const data: string[] = []

for (let i = 0; i < 100; i++) {
    data.push(`${i}`)
}

console.log(getDataPart(data, 5, 4))

