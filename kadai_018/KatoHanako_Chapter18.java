package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {

    public void setGivenName() {
        this.givenName = "花子";
    }

    // 親の抽象メソッドを実装する
    @Override
    public void eachIntroduce() {
        System.out.println("趣味は読書です");
    }
}
