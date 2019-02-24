package interpreter.example1

import java.util.*

/*
 *  Context
 *
 *  役割：<Context>
 */
class Context {
    private val table = Hashtable<String, Boolean>()

    fun lookup(name: String): Boolean {
        return table[name]?.let {
            true
        } ?: run {
            false
        }
        // name で参照される変数が存在しない場合、
        // NullPointerException を投げる
    }

    fun assign(exp: VariableExp, b: Boolean) {
        table[exp.getName()] = b
    }
}
