package java02;

public class Ch3_stringconcatexample {

	public static void main(String[] args) {
		//String 문자열을 저장할 수 있는 타입
		String str1 = "JDK" + 6.0;
		String str2 = str1 + "특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "jdk";
		System.out.println(str3);
		System.out.println(str4);
	}

}
