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
			BufferedReader br = new BufferedReader(new FileReader(file));// ����һ��BufferedReader������ȡ�ļ�
			String s = null;
			while ((s = br.readLine()) != null) {// ʹ��readLine������һ�ζ�һ��
				result.append(System.lineSeparator() + s);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result.toString();
	}
}
