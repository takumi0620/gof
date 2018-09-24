package prototype

/**
 * 試作品工場クラス
 */
class ProtoTypeFactory {
    var engine = Engine(0)
    var tire = Tire(4)

    fun createEngine(): Engine {
        return engine.clone() as Engine
    }

    fun createTire(): Tire {
        return tire.clone() as Tire
    }
}
