import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;
public class Sort1{
	public static void main(String[]args){
		Scanner intScn=new Scanner(System.in);
	
		int[] arr=new int[10];
		int[] sortArr=new int[10];
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter the input No:"+" "+i);
			arr[i]=intScn.nextInt();
		}
		out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++){
			int repo=0;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					repo=arr[i];
					arr[i]=arr[j];
					arr[j]=repo;
				}
			}
		}
		sortArr=arr;
		out.println(Arrays.toString(sortArr));
					
	}
}