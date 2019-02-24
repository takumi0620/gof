package interpreter

class DivideExpression: CalcExpression() {
    override fun calc(): Int {
        var result = numList.first().toInt()
        for (i in 1 until numList.size) {
            result /= numList[i]
        }
        return result
    }

    override fun toString(): String {
        return "/" + list.toString()
    }
}