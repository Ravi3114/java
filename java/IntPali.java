import static java.lang.System.*;
import java.util.Scanner;
public class IntPali{
	public static void main(String[]args){
		Scanner intObj=new Scanner(System.in);
		int originNum=intObj.nextInt();
		int rem=0;
		int revNum=0;
		for(int i=originNum;i>1;i=i/10){
			rem=i%10;
			revNum=revNum*10+rem;
		}
		if(originNum==revNum){
			out.println(originNum+" "+"is a palindrome");
		}else{
			out.println(originNum+" "+"is not a palindrome");
		}
	}
}