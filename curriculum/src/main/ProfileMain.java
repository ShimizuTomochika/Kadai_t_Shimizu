package main;

import profile.ProfileAction;

public class ProfileMain {

	public static void main(String[] args) {
		// 		添付のテキストファイルを読み取って作業します
		//		プロジェクトを新規作成してください
		//		コンソールに入力された数値（1~5）をキーにして、
		//		条件に当てはまる人をコンソールに出力してからCSV出力してください
				
		//		実行ファイル・処理ファイル・beanファイルを作成してください
		//		実行ファイルと処理ファイル・beanファイルのパッケージは分けてください
		//		getとsetをbeanファイルに記述してください
		//		拡張for文・for文・Mapを必ず使用してください
		//		CSV出力は「,」くぎり、項目ごとに「””」で囲われて出力してください
		// 		名前は「姓：」「名：」で出力されるようにしてください
		//		電話番号は「-」区切りで出力してください
		//		テキストファイルの一行目はヘッダーとして出力してください
				
		//		下記がコンソール出力画面
		// 		ID,名前,年齢,性別,身長,体重,趣味,電話番号
		// 		4 佐藤 愛佳 26 女性 168.7 60.1 野球・カラオケ 00077778888 
		
		ProfileAction act = new ProfileAction();
		act.text();
	}
}
