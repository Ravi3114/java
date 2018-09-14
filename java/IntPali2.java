import java.util.Scanner;
public class IntPali2{
	static int originalNum;
	static int reverseNum;
	public static int reverseInt(int inNum){
		originalNum=inNum;
		int rem=0;
		int reverseNum1=0;
		for(int i=originalNum;i>1;i=i/10){
			rem=i%10;
			reverseNum1=reverseNum1*10+rem;
		}
		reverseNum=reverseNum1;
		return reverseNum;
	}
	public static boolean areBothSame(){
		boolean result=originalNum==reverseNum;
		return result;
	}
	public static void main(String[]args){
		Scanner newInt=new Scanner(System.in);
		int p=reverseInt(newInt.nextInt());
		 boolean testResult=areBothSame();
		 if(testResult==true){
			 System.out.println(originalNum+" "+"is a Palindrome");
		 }else{
			 System.out.println(originalNum+" "+"is not a palindrome");
		 }
	}
}
		
		
		
			
		
		