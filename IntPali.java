import java.util.Scanner;
public class IntPali{
	/* reverse the number*/
	public static int reverseInt(int inNum){
		int originalNum=inNum;
		int rem=0;
		int reverseNum1=0;
		for(int i=originalNum;i>1;i=i/10){
			rem=i%10;
			reverseNum1=reverseNum1*10+rem;
		}
		return reverseNum1;
	}
	/* test whether the original Number and reversed number are same or not */
	public static boolean areBothSame(int originalNum1,int reverseNum2){
		reverseNum2=reverseInt(originalNum1);
		if(originalNum1==reverseNum2){
			return true;
		}else{
			return false;
		}
	
	}
	/*Main method has the Stdin*/
	public static void main(String[]args){
		Scanner newInt=new Scanner(System.in);
		int p=newInt.nextInt();
		int q=reverseInt(p);
		 boolean testResult=areBothSame(p,q);
		 if(testResult==true){
			 System.out.println(p+" "+"is a Palindrome");
		 }else{
			 System.out.println(p+" "+"is not a palindrome");
		 }
	}
}
	