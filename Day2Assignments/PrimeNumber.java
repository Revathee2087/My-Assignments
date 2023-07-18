package week1.day2.Day2Assignments;

public class PrimeNumber {
	public static void main(String[] args) {
		int num=13;
		boolean flag=false;
	for(int i=2;i<num/2;i++) {
		System.out.println(i+"/n"+num/2);
		if(num%2==0) {
			flag=true;
			break;
			
		}
		
	}
	if(flag) {
		System.out.println("The number is Prime No");
	}
	else 
	{
		System.out.println("The number is not Prime No");
	}
	
	}

}
