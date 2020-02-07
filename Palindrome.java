
import java.util.Scanner;

public class Palindrome
{
public static void main(String args[]){ 
int num1, num2, remainder, reverse = 0;

System.out.println("Enter Number");
Scanner enter = new Scanner(System.in);
num1 = enter.nextInt();

num2 = num1;
while (num1 != 0){
remainder = num1 % 10;
num1 = num1 / 10;
reverse = reverse * 10 + remainder;
}

if (num2 == reverse){
System.out.println("Entered Number is palindromic number .");
}
else{
System.out.println("Entered Number is Not palindromic number .");
}
}
}