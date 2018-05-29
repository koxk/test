package java02;

public class Ch3_IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		System.out.println("---------------------");
		x++; //x=11
		++x; //x=12
		System.out.println("x=" + x); //12
		System.out.println("---------------------");
		y--; //y=9
		--y; //y=8
		System.out.println("y=" + y); //8
		System.out.println("---------------------");
		z = x++;//z=12
		//z에 12를 대입하고 ++ 가 연산되서 x=13이됨
		System.out.println("z=" + z); //12
		System.out.println("x=" + x); //13
		System.out.println("---------------------");
		z = ++x; // 13이된 x를 연산후 z에 대입하기 때문에 둘다 14임
		System.out.println("z=" + z); //14
		System.out.println("x=" + x); //14
		System.out.println("---------------------");
		z = ++x + y++;
		//1을 더한 x의 값에 연산전 y 값을 대입해서 23 이됨
		//y는 출력할땐 연산후라서 9가됨
		System.out.println("z=" + z); //23
 		System.out.println("x=" + x); //15
		System.out.println("y=" + y); //9
		

	}

}
