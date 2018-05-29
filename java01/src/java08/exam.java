package java08;
import java.util.Scanner;
public class exam {

	public static void main(String[] args) {
		 
        Scanner sc=new Scanner(System.in);
        int s1=sc.nextInt();   
        int temp,k=0,fr=0,ba,result=-1,s2=s1,h;
        
        for(h=0;s1!=result;h++) {
            if(s2>=10) {
                for(int i=2;i<11;i++) {
                    k=10*i;
                    if(s2<k) {
                        fr=i-1;
                        break;
                    }
                }
            }else{
                fr=0;
            }
            ba=(s2%10);
            temp=fr+ba;
            result=ba*10+temp%10;
            s2=result;
        }
        System.out.print(h);

		}
	}


