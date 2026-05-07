package kadai_021;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        
        Dictionary_Chapter21 dict = new Dictionary_Chapter21();
        dict.addWords();

        // 調べる英単語を配列で用意
        String[] searchArray = {"apple", "banana", "grape", "orange"};

        // 配列で渡して繰り返し処理をする
        dict.searchWords(searchArray);
    }
}
