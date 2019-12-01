package visitor

class FriedVegetablesVisitor: Visitor {
    private var cookingPotato = false
    private var cookingCarrot = false
    private var cookingPork = false
    private var cookingOther = false

    override fun visit(e: PotatoElement) {
        cookingPotato = true
        println("${e.name()}の皮を剥いて切って炒めます。")
    }

    override fun visit(e: CarrotElement) {
        cookingCarrot = true
        println("${e.name()}の芽をとって皮を剥いて切って炒めます。")
    }

    override fun visit(e: PorkElement) {
        cookingPork = true
        println("${e.name()}を切って炒めます。")
    }

    override fun visit(e: OtherElement) {
        cookingOther = true
        println("${e.name()}を鍋に入れて炒めます。")
    }

    override fun serve() {
        if (cookingPotato && cookingCarrot && cookingOther && cookingPork) {
            println("野菜炒めの完成！")
        } else {
            println("まだ料理中です。")
        }
    }
}