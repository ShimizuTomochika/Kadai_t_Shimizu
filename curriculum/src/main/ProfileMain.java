package main;

import profile.ProfileAction;

public class ProfileMain {
	
	public static void main(String[] args) {
//		コンソールに入力された数値（1~5）をキーにtextファイルを読み取って、
//		コンソールに出力してからCSV出力してください
		
//		実行ファイル・処理ファイル・beanファイルを作成してください
//		実行ファイルと処理ファイル・beanファイルのパッケージは分けてください
//		getとsetをbeanファイルに記述してください
//		拡張for文・for文・Mapを必ず使用してください
//		CSV出力は「,」くぎり、項目ごとに「””」で囲われて出力してください
// 		名前は「姓：」「名：」で出力されるようにしてください
//		電話番号は「-」区切りで出力してください
//		テキストファイルの一行目はヘッダーとして出力してください
		
		ProfileAction act = new ProfileAction();
		act.text();
	}
}
