package visitor

class CurryVisitor: Visitor {
    private var cookingPotato = false
    private var cookingCarrot = false
    private var cookingPork = false
    private var cookingOther = false

    override fun visit(e: PotatoElement) {
        cookingPotato = true
        println("${e.name()}の皮を剥いて切って鍋で煮込みます。")
    }

    override fun visit(e: CarrotElement) {
        cookingCarrot = true
        println("${e.name()}の芽をとって皮を剥いて切って鍋で煮込みます。")
    }

    override fun visit(e: PorkElement) {
        cookingPork = true
        println("${e.name()}を切って鍋で煮込みます。")
    }

    override fun visit(e: OtherElement) {
        cookingOther = true
        println("カレーのルーと${e.name()}を鍋に入れて煮込みます。")
    }

    override fun serve() {
        if (cookingPotato && cookingCarrot && cookingOther && cookingPork) {
            println("カレーの完成！")
        } else {
            println("まだ料理中です。")
        }
    }

}