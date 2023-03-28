package curriculum_New;

public class Curriculum_New_1_5 {

    public static void main(String[] args) {

        // Q1 『』で囲われた人の自己紹介をformatの通り出力してください
        //  好きな食べ物のみインスタンス変数にして、他の項目はローカル変数に代入し○○に入れてください
        // 『山田太郎 18歳 170.5cm 62.2kg 寿司』

        // ↓↓format↓↓
        // 「初めまして○○です」
        // 「年齢は○○歳です」
        // 「身長は○○cmです」
        // 「体重は○○kgです」
        // 「好きな食べ物は○○です」

        // Q1を下記に記載

        // Q1 解答 変数の宣言・代入・出力
    	String name = "山田太郎";
    	int age = 18;
    	double hei = 170.5d;
    	double wi = 62.2d;
    	String like = "寿司";
    	
    	System.out.println("初めまして" + name + "です");
    	System.out.println("年齢は" + age + "歳です");
    	System.out.println("身長" + hei + "cmです");
    	System.out.println("体重は" + wi + "kgです");
    	System.out.println("好きな食べ物は" + like + "です");
    	
        // Q2 Q1で作成した自己紹介に続いてBMIが出力されるようにしてください
    	// 「BMIは○○です」
        // ただし計算は数値を直書きせず、全て変数を使ってすること

        // Q2を下記に記載
    	
        // Q2 解答 BMI用変数を宣言・代入・出力
    	double bmi = wi / ((hei/100) * (hei/100));
    	System.out.println("BMIは" + String.format("%.1f", bmi) + "です");

        // Q3 Q1で宣言した変数を使い下記の通りコンソールに出力してください
    	// 名前:鈴木一郎
    	// 好きな食べ物:オムライスにして再出力してください

        // Q3を下記に記載
        // Q3 解答 変数に代入・出力
    	name = "鈴木一郎";
    	age = 24;
    	hei = 168.5d;
    	wi = 64.2d;
    	like = "オムライス";

    	bmi = wi / ((hei/100) * (hei/100));

    	System.out.println("初めまして" + name + "です");
    	System.out.println("年齢は" + age + "歳です");
    	System.out.println("身長" + hei + "cmです");
    	System.out.println("体重は" + wi + "kgです");
    	System.out.println("好きな食べ物は" + like + "です");
    	System.out.println("BMIは" + String.format("%.1f", bmi) + "です");

     }

}