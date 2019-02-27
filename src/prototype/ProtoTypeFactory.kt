package prototype

/**
 * 試作品工場クラス
 * ConcretePrototype 複製を行う具象クラス
 */
class ProtoTypeFactory: ProtoType {
    var engine = Engine(0)
    var tire = Tire(4)

    override fun createEngine(): Engine {
        return engine.clone() as Engine
    }

    override fun createTire(): Tire {
        return tire.clone() as Tire
    }
}
