package training;
import java.util.*;
import java.util.Scanner;
public class test{
	public static void main(String args[]) {
		test test = new test();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int result = test.factorial(n);
		System.out.println("The fatctorial number of " + n + " is " + result);
	}
	public int factorial(int n) {
		if(n<=0) {
			return 1;
		}
		int result = n*factorial(n-1);
		return result;
	}
}