package mediator

interface Colleague {
    enum class Type {
        CheckBox,
        TextBox,
        Button
    }

    val type: Type
    val mediator: Mediator
}