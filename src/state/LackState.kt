package state

class LackState: State {
    override fun coin(v: VendingMachine) {
        v.insertMoney(50)
    }

    override fun push(v: VendingMachine) {
        v.errorMessage()
    }
}