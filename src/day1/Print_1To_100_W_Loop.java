package day1;
//Print numbers 1 to 100 without using any loop
public class Print_1To_100_W_Loop {
	
	public static void main(String args[]) {
		printNumbers(1);
	}
	
	public static void printNumbers(int n){
		System.out.print(n++ + " ");
		if(n<=100) printNumbers(n);
	}

}
