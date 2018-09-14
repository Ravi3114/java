import java.util.Scanner;
public class PrimeBW{
	public static void main(String[]args){
		Scanner intObj=new Scanner(System.in);
		System.out.println("Enter the first number in the range :");
		int firstNum=intObj.nextInt();
		System.out.println("Enter the last number in the range :");
		int lastNum=intObj.nextInt();
		for(int i=2;i<firstNum;i++){
			if(i>2)
			for(int j=firstNum;j<=lastNum;j++){
				int h=j%i;
				System.out.println(h);
			}
			}
		}
	}

		