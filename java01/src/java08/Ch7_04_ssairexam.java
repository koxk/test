package java08;

public class Ch7_04_ssairexam {

	public static void main(String[] args) {
		Ch7_04_ssair sa = new Ch7_04_ssair();
		sa.takeOff();
		sa.fly();
		sa.flyMode=Ch7_04_ssair.SUPERSONIC;
		sa.fly();
		sa.flyMode=Ch7_04_ssair.NORMAL;
		sa.fly();
		sa.land();
	}

}
