package curriculum_New;

import java.util.Random;

public class Curriculum_New_1_18{
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void hello(String name,int index) {
		System.out.println("Q1出力結果");
		System.out.println(name + " JavaSE " + index);
		System.out.println();
	}
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
		public static void sum(int index) {
			System.out.println("Q2出力結果");
			System.out.println(index *= index);
			System.out.println();
		}
		
	// Q3：引数として整数の配列を渡すと、
	// 受け取った値を順番にコンソールに出力するメソッドを作成してください
		public static void ave(int[] indexs) {
			for(int index : indexs) {
				System.out.println("Q3出力結果");
				System.out.println(index);
				System.out.println();
			}
		}
			
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
		public static void sum(double a,double b) {
			System.out.println("Q4出力結果");
			System.out.println(a + b);
			System.out.println();
		}
		
	// Q5：メソッドに数字を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
		public static int[] rum(int index) {
			Random rum = new Random();
			int[] indexs = new int[index];
			for(int i = 0;i < indexs.length;i++)
			indexs[i] = rum.nextInt(99) + 1;

			return indexs;
		}

	// Q6：引数にQ5で作成したメソッドを入れて受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
		public static double aveg(int[] indexs) {
			int av = 0;
			for(int index:indexs) {
				System.out.println("Q5出力結果");
				System.out.println(index);
				System.out.println();
				av += index;
			}
			double ave =  (av / indexs.length);
			System.out.println("Q6出力結果");
			System.out.println(ave);
			System.out.println();
			
			return ave;
		}
		
		public static boolean boo(double ave) {
			if(ave < 50) {
				return true;
			}else {
				return false;
			}
		}
    public static void main(String[] args) {
    	// 作成したメソッドをここで呼び出してください
    	// Q1
    	hello("Hello",11);
    	// Q2
    	sum(19);
    	// Q3
    	int[] index = {3,2,1};
    	ave(index);
    	// Q4
    	sum(1.4,1.6);
    	// Q5,Q6,Q7
    	System.out.println(boo(aveg(rum(5))));
     }
}