package week1.day2.Day2Assignments;

public class PalindromeOrNot {
	public static void main(String[] args) {
		int num=34343;
		int reverse=0,rem;
		int temp=num;
		for( ;num!=0;num/=10)
	{
			  rem= num % 10;
			  reverse = (reverse * 10) + rem;
			}

			if (temp == reverse){
			  System.out.println("Yes, it is palindrome");
			}
			else{
			  System.out.println("No, it is not palindrome");
			}
	}
	

}
