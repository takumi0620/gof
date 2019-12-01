package state

class SufficientState: State {
    override fun coin(v: VendingMachine) {
        v.warningMessage()
    }

    override fun push(v: VendingMachine) {
        v.buy()
    }

}