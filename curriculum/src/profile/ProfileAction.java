package profile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ProfileAction {
	static String header;

	public static void text() {
		// エラー表示回避用のため特に意味なし
		@SuppressWarnings("resource")
		// コンソール入力設定
		Scanner scan = new Scanner(System.in);
		// 整数型で入力値を受け取る
		int lines = scan.nextInt();
		StringBuilder str = new StringBuilder();

		Map<Integer, ProfileBeen> map = new HashMap<Integer,ProfileBeen>();
		
		// ファイルパス設定
		String txetFilePath ="src"
				+ "/profileText"
				+ "/profile.txt";

		str.append(txetFilePath);

		try {
			// ファイル読み取り
			Path path = Paths.get(str.toString());
			// 受け取ってきたテキストファイルの情報をリストに格納する処理
			List<String> lins = Files.readAllLines(path);
			// 情報をマップに詰め込む処理
			map = mapProfile(lins);
			System.out.println(header);
			if(lines < map.size()) {
				System.out.print(map.get(lines).getId() + " ");
				System.out.print(map.get(lines).getName() + " ");
				System.out.print(map.get(lines).getAge() + " ");
				System.out.print(map.get(lines).getSeibetu() + " ");
				System.out.print(map.get(lines).getHeight() + " ");
				System.out.print(map.get(lines).getWeight() + " ");
				System.out.print(map.get(lines).getHobby() + " ");
				System.out.print(map.get(lines).getTel() + " ");
			}else {
				System.out.println("該当者なし");
			}
			// CSV出力する処理
			profileCsv(map.get(lines));
			} catch(IOException ioex) {
			ioex.printStackTrace();
		}
	}
	
/*[概要]受け取ったlistをmapに詰め込む処理
 *[詳細]受け取ってきたリストのテキスト情報をbeenに詰め込んでから、beenごとにmapへ格納する
 */
	public static Map<Integer,ProfileBeen> mapProfile(List<String> list) {
		Map<Integer,ProfileBeen> map = new HashMap<Integer,ProfileBeen>();
		int index = 0;
		for(String str :list) {
			String[] txt = str.split(",");

			if(txt[0].equals("ID")) {
				// ヘッダーの情報をフィールドに持たせる
				header = str;
				++index;
				continue;
			}else {
				// map
				ProfileBeen been = new ProfileBeen();
				int inin = 0;
				been.setId(Integer.parseInt(txt[inin++]));
				been.setName(txt[inin++]);
				been.setAge(Integer.parseInt(txt[inin++]));
				been.setSeibetu(txt[inin++]);
				been.setHeight(Double.parseDouble(txt[inin++]));
				been.setWeight(Double.parseDouble(txt[inin++]));
				been.setHobby(txt[inin++]);
				been.setTel(txt[inin++]);
				
				map.put(index, been);
				++index;
			}
		}
		return map;
	}
	/*[概要]CSV出力処理
	 *[詳細]受け取ったbeenの情報を項目ごとに「””」で囲い、「,」ごとに区切る処理
	 *名前は「姓：〇〇 名：〇〇」の形へ変換してからCSV出力
	 *電話番号は「***-****-****」の形へ変換してからCSV出力
	 */
	public static void profileCsv(ProfileBeen profileBeen) throws IOException {
        // 出力ファイルの作成
        FileWriter fw = new FileWriter("profile/Userdata.csv", false);
        // PrintWriterクラスのオブジェクトを生成
        PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
        // ヘッダーの項目情報を配列に直す
        String[] str = header.split(",");
        // 項目を「""」で囲い「,」区切りにする
        // ヘッダー情報をファイル出力する処理
        for(int i = 0,n = str.length; i < n; i++) {
        	if(i == 0) {
                pw.print("\"" + str[i] + "\"");
        	}else {
                pw.print("," + "\"" + str[i] + "\"");
        	}
        }
        pw.println();
        // 姓名を分解して配列に格納する処理
        String[] name = profileBeen.getName().split(" ");
        // 電話番号を分解してハイフン追加する処理
        String tel1 = profileBeen.getTel().substring(0,3);
        String tel2 = profileBeen.getTel().substring(3,7);
        String tel3 = profileBeen.getTel().substring(7,11);
        String tel = tel1 + "-" + tel2 + "-" + tel3;
        
        // ファイルにデータを書き込む
	        pw.print("\"" + profileBeen.getId() + "\"" + ",");
	        pw.print("\"" + "姓：" + name[0] + " 名：" + name[1] + "\"" + ",");
            pw.print("\"" + profileBeen.getAge() + "\"" + ",");
            pw.print("\"" + profileBeen.getSeibetu() + "\"" + ",");
            pw.print("\"" + profileBeen.getHeight() + "\"" + ",");
            pw.print("\"" + profileBeen.getWeight() + "\"" + ",");
            pw.print("\"" + profileBeen.getHobby() + "\"" + ",");
            pw.print("\"" + tel + "\"");
            pw.println();

        // ファイルを閉じる
        pw.close();
	}
}
