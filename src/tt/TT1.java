package tt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TT1 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("sale1");
		list1.add("sale2");
		list1.add("sale4");
		list1.add("sale6");
		String str1 = "sale7;sale9;sale1;sale2;sale3;sale4;sale5";
		List<String> list2 = Arrays.asList(str1.split(";"));
		for (String e : list2) {
			System.out.println(e);
		}
		System.out.println("---------------");
		List<String> list3 = new ArrayList<String>();
		for (String str : list2) {
			System.out.println("---" + str);
			if (list1.contains(str)) {
				list3.add(str);
			}
		}
		for (String e : list3) {
			System.out.println(e);
		}
		System.out.println("---------------");
		for (String str : list1) {
			if (!list2.contains(str)) {
				list3.add(str);
			}
		}
		for (String e : list3) {
			System.out.println(e);
		}
		System.out.println("---------------");
		
		System.out.println("测试");
	}

}
