package singleton;

/**
 * シングルトンクラス
 */
public class JavaSingletonObject {
    /**
     * staticで定義し自クラスのインスタンスを唯一とする
     */
    public static JavaSingletonObject instance = new JavaSingletonObject();
    private String address = "/assets/temp";
    enum Assets {
        IMAGE1("image_1"),
        IMAGE2("image_2"),
        AUDIO1("audio_1"),
        AUDIO2("audio_2");

        private final String value;

        Assets(final String value) {
            this.value = value;
        }
    }

    /**
     * コンストラクタをprivateで定義し、新たなインスタンスを生成できないようにする。
     */
    private JavaSingletonObject(){
        System.out.println("接続：" + address);
    }

    public String getAssets(Assets target) {
        System.out.println("シングルトンオブジェクトで資材取得：" + target.value);
        return target.value;
    }
}
