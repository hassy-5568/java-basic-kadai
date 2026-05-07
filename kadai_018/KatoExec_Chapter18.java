package kadai_018;

public class KatoExec_Chapter18 {
    public static void main(String[] args) {
        // 太郎さんのインスタンスを作成
        KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
        taro.setGivenName();   // 名をセット
        taro.execIntroduce();  // 紹介を実行

        // 一郎さんのインスタンスを作成
        KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
        ichiro.setGivenName();
        ichiro.execIntroduce();

        // 花子さんのインスタンスを作成
        KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
        hanako.setGivenName();
        hanako.execIntroduce();
    }
}
