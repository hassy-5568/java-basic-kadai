package kadai_015;

public class Car_Chapter15 {
	// フィールド（内部データ）
    private int gear = 1;    // 1速から5速のギアを表す
    private int speed = 10;  // ギアチェンジ後の速度を表す	
    
    /*
    // コンストラクタ（初期化処理）
    // 今回は初期値のまま使うから別にいらないか？
    public Car_Chapter15( final int gear) {
        this.gear  = gear;
        
    }*/ 

    // 【メソッド】ギアチェンジを行う
    public void changeGear( final int afterGear ) {
        switch (afterGear) {
			case 1 -> this.speed = 10;
			case 2 -> this.speed = 20;
			case 3 -> this.speed = 30;
			case 4 -> this.speed = 40;
			case 5 -> this.speed = 50;
			default -> this.speed = 10;
		}
        
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
		this.gear = afterGear;
    }
    	
     // 【メソッド】ギアチェンジ後の速度を表示する	
    public void run() {
    		System.out.println("速度は時速" + this.speed + "kmです");
    }	
}
