package tt;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TT {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws UnsupportedEncodingException {
		String date = "2014-09-11 19:12:30";
		System.out.println(date.substring(2, 19));
		
		String str = "车型|别克 凯越 2013款 1.5L 自动经典型";
		System.out.println(str.indexOf("|"));
		
		String[] strArray = str.split("\\|");
		for (String a : strArray) {
			System.out.println(a);
		}
		
		double d = -0.1;
		System.out.println("d=" + (-d));
		
		System.out.println("==========================");
		
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("1", "1");
		map1.put("2", "2");
		map1.put("3", "3");
		map1 = Collections.unmodifiableMap(map1);
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.putAll(map1);
		map2.put("4", "4");
		for (Entry<String, Object> entry : map2.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("==========================");
		
		String orderNo = "111";
		System.out.println("[" + orderNo.split("_")[0] + "]");
		
		System.out.println("==========================");
		
		String content = "{\"code\":\"Order\"}";
		System.out.println(URLEncoder.encode(content, "UTF-8"));
		System.out.println(URLDecoder.decode("%7B%22code%22%3A%22Order%22%7D", "UTF-8"));
		
		System.out.println("==========================");
		
		String s = String.format("flowsheet_v%s/handovercar_v%s.bpmn2", "1.1", "1.1");
		System.out.println(s);
		
		System.out.println("==========================");
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("123", "123");
		for (Entry<String, Object> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		map.put("123", "456");
		for (Entry<String, Object> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println(map.size());
		
		System.out.println("==========================");
		
		DecimalFormat df = (DecimalFormat) NumberFormat.getCurrencyInstance();
		df.applyPattern("¥#,###.00");
	    System.out.println(df.format(23423412132131.225));
	    
	    System.out.println("==========================");
	    
	    float a = Float.valueOf("25");
	    float b = Float.valueOf("140000");
	    System.out.println(b * (a / 100));
	    
	    System.out.println("==========================");
		
		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("1", "11");
		map3.put("2", "22");
		map3.put("3", "33");
		Map<String, Object> map4 = new HashMap<String, Object>();
		map3.put("1", "1");
		map3.put("2", "2");
		map4.put("4", "4");
		map4.putAll(map3);
		for (Entry<String, Object> entry : map4.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
