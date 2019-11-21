public class Solution9 {
	public boolean isPalindrome(int x) {
        //排除负数和个位为0的情况
//		if (x < 0 || (x % 10 == 0)) 忽略了x为0时 true的特例
        if (x < 0 || (x % 10 == 0 && x != 0))
			return false;
		int a = 0;//a为操作的中间数
		while(x>a) {
			a = a * 10 + x % 10;
			x /= 10;
		}
		
//		if(a == x || x == a/10) 
//			return true;
//		else return false;
		return a == x || x == a / 10;
    }
}
