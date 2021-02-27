package cn.inrhor.meet

class Person(var person: String, var emotion: Emotion) {
    constructor(person: String): this(person, Emotion.NULL)

    fun sayTo(toPerson: String, content: String) {
        println("["+this.person+"] to ["+toPerson+"] : $content")
    }

    fun doActionTo(toPerson: String, action: Action) {
        println("["+this.person+"] action to ["+toPerson+"] : $action")
    }
}