package java02;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int n;
        int total=0,count=0;
        double avg;
        int scores[] = new int[1000];
        for (int i=0;i<c;++i) {
            n = sc.nextInt();
            for (int j=0;j<n;++j) {
                scores[j] = sc.nextInt();
                total += scores[j];
            }
            avg =total/n;
            for (int j = 0; j < n; ++j) {
                if (scores[j] > avg) {
                    count++;
                }
            }
            System.out.printf("%.3f", 100.0 * count / n);
            System.out.println("%");
        }
        
    }
}


  


        		
        		
        