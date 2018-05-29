package java05;

public class Ch5_15_example {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		String arr2[]= {"사과 ","배 ","바나나 ","체리 ","딸기 ","포도"};
		int sum=0;
		for (int a : arr1) {
			System.out.print(a+" ");
			sum += a;
		}System.out.println("합은 "+sum);
		for (String b : arr2) {
			System.out.print(b+" ");
		}
	}

}
