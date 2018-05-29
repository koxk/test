package java02;

public class Ch3_StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "김준호";
		String strVar2 = "김준호";
		String strVar3 = new String("김준호");
		
		System.out.println( strVar1 == strVar2);
		System.out.println( strVar1 == strVar3);
		System.out.println();
		System.out.println( strVar1.equals(strVar2));
		System.out.println( strVar1.equals(strVar3));
	}

}
