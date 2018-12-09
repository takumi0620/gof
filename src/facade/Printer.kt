package facade

class Printer {
    fun startUp() { print("起動") }
    fun shutDown() { print("終了") }
    fun setToner(color: String) { print("トナーを${color}色に設定します。") }
    fun addPaper(num: Int) { print("紙を${num}枚追加します。") }
    fun login(name: String) { print("ユーザ${name}がログインしました。") }
    fun printOut(num: Int) { print("${num}枚印刷します。") }
}