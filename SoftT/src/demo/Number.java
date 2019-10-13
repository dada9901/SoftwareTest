package demo;

public class Number {

	public int multi(int a) {
		if(a>1)
			return multi(a-1)*a;
		else
		return a;
	}
	public double gete() {
		double s=0;
		for(int i =0;i<100;i++)
			s=s+1/multi(i);
		return s;
	}
	public int getfeb(int a) {
		if(a==1)
			return 1;
		else if(a==2)
			return 1;
		else
			return getfeb(a-1)+getfeb(a-2);
	}
	public int issushu(int a) {
		for(int i=1;i<a;i++)
			for (int j=1;j<i;j++)
				if(i*j==a)
					return 1;
		return 0;
	}
}