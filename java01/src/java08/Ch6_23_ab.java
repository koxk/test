package java08;

public class Ch6_23_ab {
	int x1,x2,y1,y2,num;
	int av;
	double ran;
	
	Ch6_23_ab(){}
	
	void coo(int x1,int x2,int y1,int y2,double ran) {
		ran = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	}
	void com(int av) {
		if(num<0) {
			num=-num;
			av+=num;
				
		}
	}
	
	
	
}
