import java.util.Scanner;
import static java.lang.System.*;
public class ArithOp{
	/*addOp method will add two operands, operands that are mentioned as arguments in the method signature*/
	public static int addOp(int op1, int op2){
		int operation=op1+op2;
		return operation;
	}
	/* subOp method will subtract first operand from second operand and operands are taken from the method arguments */
	public static int subOp(int op1, int op2){
		int operation=op2-op1;
		return operation;
	}
	/* mulOp method will multiply two operands that are taken as method arguments*/
	public static int mulOp(int op1,int op2){
		int operation=op1*op2;
		return operation;
	}
	/*divOp method divides argument two by operand one*/
	public static int divOp(int op1,int op2){
		int operation=op2/op1;
		return operation;
	}
	public static void main(String[]args){
		/*Scanner object*/
		 Scanner intObj=new Scanner(System.in);
		 out.println("Enter the 1st operand :");
		 int op1=intObj.nextInt();
		 out.println("Enter the 2nd operand :");
		 int op2=intObj.nextInt();
		 int callOp1=addOp(op1,op2);
		 out.println("Addition of two numbers is :"+" "+callOp1);
		 int callOp2=subOp(op1,op2);
		 out.println("Subtraction of two numbers is :"+" "+callOp2);
		 int callOp3=mulOp(op1,op2);
		 out.println("Multiplication of two numbers is :"+" "+callOp3);
		 int callOp4=divOp(op1,op2);
		 out.println("Division of two numbers is :"+" "+callOp4);
	}
}
	