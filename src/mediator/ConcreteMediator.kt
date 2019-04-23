package mediator

class ConcreteMediator: Mediator {

    var checkBox: CheckBox? = null
    var textBox: TextBox? = null
    var button: Button? = null

    override fun buttonPress(): Boolean {
        return checkBox?.sex != null && textBox?.value?.isNotEmpty() ?: false
    }

    override fun inputTextBox(): Boolean {
        return checkBox?.sex != null
    }

}