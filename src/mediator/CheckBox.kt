package mediator

    class CheckBox(override val mediator: Mediator): Colleague {
    override val type = Colleague.Type.CheckBox
    enum class Sex {
        Male,
        Female
    }

    var sex: Sex? = null

    fun select(sex: Sex) {
        this.sex = sex
    }
}