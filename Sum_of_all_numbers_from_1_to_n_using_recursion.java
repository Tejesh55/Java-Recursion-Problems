package training;
import java.util.*;
import java.util.Scanner;
public class test{
	public static void main(String args[]) {
		test test = new test();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int result = test.sumofnum(n);
		System.out.println("The sum of the numbers from 1 to "+ n + " is " + result);
	}
	public int sumofnum(int n) {
		if(n<=0) {
			return 0;
		}
		int result = n+sumofnum(n-1);
		return result;
	}
}