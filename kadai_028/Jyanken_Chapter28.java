package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
    public String getMyChoice(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのr、チョキはscissorsのs、パーはpaperのpを入力しましょう");
        
        while (true) {
            String input = scanner.next();

            if (input.equals("r") || input.equals("s") || input.equals("p")) {
                scanner.close();
                return input;
            }
            System.out.println("エラー：r, s, pのいずれかを入力してください。");
        }
    }

    public String getRandom() {
        String[] hands = {"r", "s", "p"};
        int index = (int) Math.floor(Math.random() * 3);
        return hands[index];
    }

    public void playGame(String myChoice, String opponentChoice) {
        
        // HashMapの宣言
        HashMap<String, String> jyankenMap = new HashMap<>();

        // 要素の追加
        jyankenMap.put("r", "グー");
        jyankenMap.put("s", "チョキ");
        jyankenMap.put("p", "パー");
        
        // お互いの手を表示
        System.out.println("自分の手は" + jyankenMap.get(myChoice) + "です");
        System.out.println("CPUの手は" + jyankenMap.get(opponentChoice) + "です");

        String result = switch (myChoice + opponentChoice) {
        case "rr", "ss", "pp" -> "あいこです";
        case "rs", "sp", "pr" -> "自分の勝ちです";
        case "rp", "sr", "ps" -> "自分の負けです";
        default -> "エラー";
        };

        // returnしてjyankenExecで表示させるべき？
        System.out.println(result);
    }
}
