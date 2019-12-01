package state

class Client {
    init {
        val v: Context = VendingMachine()
        v.coin()
        v.push()
        v.coin()
        v.coin()
        v.push()
    }
}