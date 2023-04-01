package sub_curriculum_New_1_29;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sub_curriculum_New_1_29 {
	/* [概要] CSVファイルを読み取って返すメソッド
	 * [詳細] 読み取ったファイルを一行ごとにmapに格納して返す
	 */	public static Map<Integer,StringBuilder> fileCsv() {
		// ファイルパスの指定
		Path path = Paths.get("src/sub_curriculum_New_1_29/personal_infomation.csv");
		
		try {
			// CSVファイルの読み込み
			List<String> lines = Files.readAllLines(path, Charset.forName("UTF-8"));
			Map<Integer,StringBuilder> map = new HashMap<Integer,StringBuilder>();

			int index = 1;
			int a = 1;
			
			for(int i = 1;i < lines.size();i++) {
				// 初期化しないと同じ値を入れてしまうためここで宣言
				StringBuilder strbu = new StringBuilder();

				// ファイルを一行ごとに配列に格納
				String[] datas  = lines.get(index++).split(",");
				
				// 読み込んだCSVファイルの内容を出力
					int cont = 1;
					for(String str: datas) {
						if(cont == datas.length) {
							strbu.append(str);
						}else {
							strbu.append(str + ",");
						}
						cont++;
					}
					map.put(a,strbu);
					a++;
				}
			return map;
		} catch (IOException e) {
			System.out.println("ファイル読み込みに失敗");
		}
		return null;
	}
}