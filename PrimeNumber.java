import java.util.Scanner;
public class PrimeNumber{
	public static void main(String[]args){
		Scanner numObj=new Scanner(System.in);
		int eInt=numObj.nextInt();
		System.out.println("Entered Number"+"="+eInt);
		if(eInt==2){
			System.out.println(eInt+" "+"is a Prime Number");
		}else{
		int j=0;
		for(int i=2;i<eInt;i++){
			j=eInt%i;
			if(j==0)
				break;
		}
		if(j==0){
			System.out.println(eInt+" "+"is not a Prime Number");
		}else if(j!=0){
			System.out.println(eInt+" " +"is a PrimeNumber");
		}
		}
	}
}
			
		