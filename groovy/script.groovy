
def hello(Closure<GString> cl) {
    cl.call()
}

print hello({
    h: 'asd'
})