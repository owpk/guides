#!groovy

// [ identifiers ]
println '[ identifiers ]'

def map = [:] // map
map."some identifier" = "ALLOWED"
map.'some-identifier' = "ALLOWED"
println map

// [ arrays ]
println '[ arrays ]'

// all arrays are List implementations
arr = 1..10  // IntRange
arr2 = [1, 2, 3] // ArrayList
linked = [1, 2, 3] as LinkedList
map_ = [ "A":3, "B":4 ] as LinkedHashMap
println arr.class
println arr2.class
println linked.class
println map_

// add element to List
arr3 = [1, 2, 3]
arr3 << 4
println arr3

// [ strings ]
println '[ strings ]'

s = """
A
B
C
"""
println(s)

s = "St"
println s*2 // StSt

// triple quoted strings - series of charaters
chars = '''Hello world!'''
chars = '''Hello world!
line two
'''
string = "a"
println string.class

// [ closure ]
println '[ closure ]'

// closure may have 'owner' and delegate
def clousre0 = { String x, int y -> println "some valid closure ${x} : ${y}" }
clousre0 "aboba", 3

def item = 2
def closure1 = { item++ }
println  closure1() //2

closure3 = { -> ++item }
println closure3() //4
println item //4

closure4 = { x,a -> x.endsWith(a) }
println closure4("aboba", "b") //false
println closure4("aboba", "a") //true

// implicit
greeting = { "Hello $it!" } // equals { it -> "Hello $it" }
println greeting('Patric') // Hello Patric!

// var args
joins = { String... args -> args.join(' ') }
println joins("a", "b", "c") // a b c

multiConcat = { int n, String... args ->
    args.join('')*n
}
println multiConcat(2, "A", "B", "C") // ABCABC

// delegations
class Person {
    String name
    int age
    String toString() { "$name is $age years old" }
    // closure as Person field
    def cl = {
            String a,
            x -> {
               String msg = this.toString()
               println "some variable $x and $a"
               msg // return statement
            }
         }

    // method
    String dump() {
        println cl // Person$closure
        cl("SS", 2) // return statement
    }

    def gOwner() {
       def wIsOwner = { getOwner() }
       def wOwner = { owner }
       def wDelegate = { {delegate}.call() }
       println "Delegate: ${wDelegate() == wDelegate }" // true
       println "This: ${this.class}"
       println "Owner of closure: ${wOwner().class}"
       println wIsOwner() == this // true
       println wOwner() == this // true
    }
}

def p = new Person(name:'Janice', age:74)
println p.dump()
println "------------"

def clApp = {
      String main = "SomeString",
      int y -> "$main" * y
}

println clApp(2)

// [ gradle build example ]
println '[ gradle build example ]'

public class MyClass {
   void doSomething(String a, x, Closure cl) {
      println 3 + x
      println a
      cl.call()
      println cl.getDirective()
      println cl.getDelegate().getClass().getName()
   }

   String getBuildScript(Closure cl) {
      cl.call()
   }
}

def cl = new MyClass()

cl.doSomething("A", 3, {
   println "Hello world"
})

// [ dynamic invocation ]
println '[ dynamic invocation ]'

def opts
opts = [
   aboba: 3,
   bebra: 'gstring',
   de_la: { x -> x.take opts['aboba'] }
]

def val = opts['de_la'] 'STRING'
println val

