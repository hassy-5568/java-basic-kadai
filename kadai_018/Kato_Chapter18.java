package kadai_018;

public abstract class Kato_Chapter18 {

    // abstractメソッドがあると、classもabstractをつけないといけない。

    public String familyName = "加藤";  // 姓を表す
    public	String	givenName;	        // 名を表す
    public	String	address = "東京都中野区〇×";  // 住所を表す

    // 修飾子、アクセス修飾子	戻り値	メソッド名	用途

    public	void commonIntroduce(){
        //共通の紹介を出力する
        System.out.println("名前は" + familyName + givenName + "です");
        System.out.println("住所は" + address + "です");
    }	
    
    public abstract void eachIntroduce();  // ここを子のメソッドでオーバーライドする
    
    public	void execIntroduce(){
        // 紹介を実行するメソッド
        commonIntroduce();
        eachIntroduce();
        System.out.println(); // 改行
    }
}
