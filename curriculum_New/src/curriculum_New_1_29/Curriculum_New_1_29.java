package curriculum_New_1_29;

import java.util.HashMap;
import java.util.Map;

import sub_curriculum_New_1_29.Sub_curriculum_New_1_29;

public class Curriculum_New_1_29 {

	public static void main(String[] args) {

		Sub_curriculum_New_1_29 sub = new Sub_curriculum_New_1_29();
		Map<Integer,StringBuilder> map = new HashMap<Integer,StringBuilder>();
		
		map = sub.fileCsv();
		for(StringBuilder str:map.values()) {
			System.out.println(str.toString());
		}
	}

}
