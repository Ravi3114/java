import java.util.Scanner;
import java.util.Arrays;
public class IntPal{
	public static void main(String[]args){
		System.out.println("Enter a Number");
		Scanner intObj=new Scanner(System.in);
		int inInt=intObj.nextInt();
		System.out.println("Entered Number is :"+" "+inInt);
		int count=0;
		System.out.println(inInt);
		for(int i=inInt;i>0;i=i/10){
			int catI=i%10;
			count++;
		}
		int[] boxPal=new int[count];
		for(int i=boxPal.length-1;i>=0;i--){
			int catI=inInt;
			catI=catI%10;
			inInt=inInt/10;
			boxPal[i]=catI;
		}
		System.out.println(Arrays.toString(boxPal));
		int x1=0,x2=0;
		for(int i=0,j=boxPal.length-1;i<=boxPal.length-1&&j>=0;i++,j--){
			if(i!=j){
				x1=boxPal[i];
				x2=boxPal[j];
		if(boxPal[i]!=boxPal[j])
			break;
		
	}
	}
	if(x1!=x2){
		System.out.println("is not a palindrome");
	}else{
		System.out.println("is a palindrome");
	}
}
}
		