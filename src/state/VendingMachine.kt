package state

class VendingMachine: Context {
    companion object {
        private val lack = LackState()
        private val sufficient = SufficientState()
    }

    private var state: State = lack
    private var money = 0

    override fun coin() {
        state.coin(this)
    }

    override fun push() {
        state.push(this)
    }

    fun warningMessage() {
        println("これ以上の入金は不要です。")
    }

    fun errorMessage() {
        println("必要な金額が投入されていません。")
    }

    fun insertMoney(m: Int) {
        println("お金を投入しました。")
        money += m
        if (money >= 100) {
            state = sufficient
        }
    }

    fun buy() {
        println("飲み物を取り出し口からお取りください。")
        state = lack
    }
}