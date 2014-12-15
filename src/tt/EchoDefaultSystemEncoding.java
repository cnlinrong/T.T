package tt;

public class EchoDefaultSystemEncoding {

	public static void main(String[] args) {
		String encoding = System.getProperty("file.encoding");
		System.out.println("Default System Encoding: " + encoding);
	}

}
