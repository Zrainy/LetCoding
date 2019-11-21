public class Solution7 {
	//数学法
	public int reverse(int x) {
		int a = 0;//当前位
		int b = 0;//下一位
		
		while(x!=0) {
			b = x % 10;
			if(a > Integer.MAX_VALUE/10 || ((a==Integer.MAX_VALUE/10)&&b>7))
				return 0;
			if(a < Integer.MIN_VALUE/10 || ((a==Integer.MIN_VALUE/10)&&b<-8))
				return 0;
			a = a*10 + b;
			x /= 10;
		}
		return a;
	}
}
