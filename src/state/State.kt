package state

interface State {
    fun coin(v: VendingMachine)
    fun push(v: VendingMachine)
}