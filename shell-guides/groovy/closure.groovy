#!/bin/groovy

// declaration
def cls = { println "A" }
// explicit call
cls.call()
// implicit call
cls()
cls

def cls0 = { name -> println name }
cls0 "closure 0 "

// return
// def cls1 = { x -> return x }
// def var1 = csl1 3
// println var1.class // integer

def cls2 = { String x -> return x }
def var2 = cls2 "Aboba"
println var2.class // string

def cls3 = { x -> x }
def var3 = cls3({ })
println var3.class // closure

def cls4 = { String x -> x }
def var4 = cls4("S")
println var4.class // string

String method(Closure cls) {
   cls.call()
}

def returnedFromClosure = method {
    cls2 "Hello world"
}

println returnedFromClosure + ' !!!'


def arr = [ "Mary", "Igor", "123" ]
arr.each { x -> print "$x.class | "}
println ""
println arr.findAll { x -> x ==~ "//d" }
