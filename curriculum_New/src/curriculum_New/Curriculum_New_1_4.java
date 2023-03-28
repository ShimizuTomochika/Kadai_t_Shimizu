package curriculum_New;

public class Curriculum_New_1_4 {
    // Q1 解答 宣言のみ
	static byte		by;
	static short 	sh;
	static int 		in;
	static long 	lo;
	
	static float 	fl;
	static double 	dou;

	static char 	ch;
	static String 	str;

	static boolean 	bo;

     public static void main(String[] args) {
    	 
	     // Q1 下記9個をクラス変数として宣言のみしてください
	     //		・バイト型・短整数型・整数型・長整数型
	     // 	・単精度浮動小数点数型・倍精度浮動小数点数型
	     //   	・文字型・文字列型
	     //	 	・ブーリアン型 
	     //      
	
	     // Q2 それぞれのクラス変数をローカル内でそれぞれの初期値を代入し初期化してください

    	 // Q2 解答 初期値を代入
    	 by = 0;
    	 sh = 0;
    	 in = 0;
    	 lo = 0l;
    	 
    	 fl = 0.0f;
    	 dou = 0.0d;
    	 
    	 ch = '\u0000';
    	 str = null;
    	 
    	 bo = false;
    	 
	     // Q3 初期化をしたそれぞれの変数に下記の値を代入してください
	
	     // ・バイト型                 10
	     // ・短整数型                 100
	     // ・整数型                	 1000
	     // ・長整数型                 10000
	     // ・単精度浮動小数点数型   	 9.5
	     // ・倍精度浮動小数点数型		 10.5
	     // ・文字型                   a
	     // ・文字列型              	 ハロー
	     // ・ブーリアン型          	 true
	
	     // Q3 解答 代入
    	 
    	 by = 10;
    	 sh = 100;
    	 in = 1000;
    	 lo = 10000l;
    	 
    	 fl = 9.5f;
    	 dou = 10.5d;
    	 
    	 ch = 'a';
    	 str = "ハロー";
    	 
    	 bo = true;
    	 
	     // Q4 下記の通りにコンソール出力されるようにしてください
	     // 必ず変数を使用すること
	
	     // 11110
	     // 20.0
	     // a ハロー true
	     // 11130.0                    数字を全て足す
	     // 10000000000                小数点以外の数字を全てかける
	     // 0.105                      10.5割る100をする
	     // -90                        10引く100をする

    	 // Q4 解答 コンソールに出力
    	 System.out.println(by + sh + in + lo);
    	 System.out.println(fl + dou);
    	 System.out.println(ch + " " + str + " " + bo);
    	 System.out.println(by + sh + in + lo + fl + dou);
    	 System.out.println(by * sh * in * lo);
    	 System.out.println(dou / sh);
    	 System.out.println(by - sh);
    	 
    	// Q5 
    	// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
    	// 「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
 		String num = "20";
 		int num1 = 23;
 		System.out.println("ハローJAVA" + (num + num1));
 		
 		// Q5 解答 変更箇所
 		int nu = 20;
 		int nu1 = 23;
 		System.out.println("ハローJAVA" + (nu + nu1));
 		
     }

}