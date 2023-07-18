package week1.day2.Day2Assignments;

public class FibonacciSeries {
	public static void main(String[] args) {
		int  firstNum = 0, secNum = 1, sum ,range=8;    
		 System.out.print(firstNum);   
		    
		 for(int i=1;i<range;++i) 
		 {    
		  sum=firstNum+secNum  ;  
		  System.out.print(" "+sum);    
		  firstNum =secNum;    
		  secNum=sum;    
	}

}
}