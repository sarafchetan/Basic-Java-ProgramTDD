package reverse;



public class ReverseNumber {

	
	public int reverse(int num) {
		
		int reverseNum=0;
		while(num !=0) {
			reverseNum=reverseNum * 10;
			reverseNum=reverseNum + num%10;
			num=num/10;
			
		}
		
		return reverseNum;

	}
	
	
	
	
}
