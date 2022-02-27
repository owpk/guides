interface Rect {
    readonly id: string
    color?: string

    size: {
        width: number
        height: number
    }
}

const rect1: Rect = {
    id: '123',
    size: {
        width: 3,
        height: 4
    }
}

const rect2: Rect = {
    id: '123',
    size: {
        width: 10,
        height: 3
    },
    color: 'black'
}

const rect3 = {} as Rect
const rect4 = <Rect>{}

// inheritance
interface RectWithArea extends Rect {
    getArea: () => number
}

const rect5: RectWithArea = {
    id: '123',
    size: {
        width: 3,
        height: 4
    },

    getArea(): number {
        return this.size
    }
}

console.log(rect5.getArea)

// class
class RectImpl implements Rect {
    readonly id: string;
    size: {
        width: number;
        height: number
    };
}

const rect6: RectImpl = {
    id: '21',
    size: {
        width: 3, height: 4
    }
}

// ============

interface Styles {
    [key: string]: string
}

const styles: Styles = {
    border: '123px',
    color: 'black',
    size: '5'
}
