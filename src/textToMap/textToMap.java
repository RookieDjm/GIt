package textToMap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Map;

import net.sf.json.JSONObject;


public class textToMap {
	private static final String SAVE_PATH = "D:/text.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File(SAVE_PATH);
		String cent=txt2String(file);
//		JSONObject  jsonObject = JSONObject.fromObject(cent);
////		JSONObject jasonObject = JSONObject.fromObject(cent);
//		Map<Object, Object> map = (Map)jsonObject;
		System.out.println(cent);
	}

	public static String txt2String(File file) {
		StringBuilder result = new StringBuilder();
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));// 构造一个BufferedReader类来读取文件
			String s = null;
			while ((s = br.readLine()) != null) {// 使用readLine方法，一次读一行
				result.append(System.lineSeparator() + s);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result.toString();
	}
}
