package kadai_028;

public class JyankenExec_Chapter28 {
    public static void main(String[] args) {
        
        Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();

        // 1. 自分の手を入力する
        String myChoice = jyanken.getMyChoice();

        // 2. 対戦相手の手が乱数で選ばれる
        String opponentChoice = jyanken.getRandom();

        // 3. じゃんけんを実行する
        jyanken.playGame(myChoice, opponentChoice);
    }
}
