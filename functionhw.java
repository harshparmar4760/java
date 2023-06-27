import java.util.*;
import java.lang.Math;
import java.nio.channels.Pipe;


public class functionhw{      
    
    
// 1- Enter 3 numbers from the user & make a function to print their average.

    // public static int calculateAverage(int a, int b, int c){
    //     return (a + b + c)/3;
    // }
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();        
    //     int c = sc.nextInt();

    //     System.out.println("Average of Three Number is : "+ calculateAverage(a, b, c));
    // }
    // ================================================
//     public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       int a = sc.nextInt();
//       int b = sc.nextInt();
//       int c = sc.nextInt();

//       int average = (a + b + c) / 3;
//       System.out.println(average);
//    } 


// -----------------------------------------------------

// 2- Write a function to print the sum of all odd numbers from 1 to n.

    // public static void main(String[] args){
	// 	Scanner sc = new Scanner(System.in);
	// 	System.out.print("Enter The Number : ");
	// 	int n =sc.nextInt();
	// 	int sum = 0;
	// 	for(int i=1;i<=n;i++)
	// 	{
	// 		if(i%2==1)
	// 			sum = sum + i;
	// 	}
	// 	System.out.println("Sum of Odd Numbers :"+sum);
    // }

// -----------------------------------------------------

// 3- Write a function which takes in 2 numbers and returns the greater of those two.

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter Two Number: ");
    //     int a = sc.nextInt();
    //     int b = sc.nextInt(); 
    //     System.out.println("Largest = " + LargestOfTwo(a, b));
    // }
    
    // public static int LargestOfTwo(int a, int b){
    //   if(a > b) {
    //       return a;
    //   } else {
    //       return b;
    //   }
    // }

// -----------------------------------------------------

// not done 4- Write a function that takes in the radius as input and returns the circumference of a circle.

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Radius of the circle: ");
//         int r = sc.nextInt();
//         System.out.println("Circumference of the circle: " +Circumference(r) );
//     }
    
//     public static int Circumference(int r){
//         return (2*Math.PI*r) ;
//     }

// -----------------------------------------------------

// 5- Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter age: ");
    //     int age = sc.nextInt();
    //     System.out.println("Eligible to vote " + voting (age) );
    // }
    
    // public static boolean voting(int age){
    //     return age > 18;
    // }

// -----------------------------------------------------

// 6- Write an infinite loop using do while condition.
    // public static void main(String[] args) {
    //  do{
	// 		System.out.println("Java");
	// 	}while(true);
	// }

// -----------------------------------------------------

// 7- Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

//     public static void main(String args[]) {
//        int positive = 0, negative = 0, zeros = 0;
//        System.out.println("Press 1 to continue & 0 to stop");
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();

//        while(input == 1) {
//            System.out.print("Enter your number : ");
//            int number = sc.nextInt();
//            if(number > 0) {
//                positive++;
//            } else if(number < 0) {
//                negative++;
//            } else {
//                zeros++;
//            }

//            System.out.println("Press 1 to continue & 0 to stop");
//            input = sc.nextInt();
//        }

//        System.out.println("Positives : "+ positive);
//        System.out.println("Negatives : "+ negative);
//        System.out.println("Zeros : "+ zeros);
//    }  

// -----------------------------------------------------


// 8- Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
    
//     public static void main(String arg[]){
//        long n,p,r=1;
//        Scanner sc=new Scanner(System.in);
//        System.out.print("enter number: ");
//        n=sc.nextLong();
//        System.out.print("enter power: ");
//        p=sc.nextLong();
//        r=functionhw.calpower(n,p);
//      System.out.println(n+"^"+p+"="+r);
//   }
//   static long calpower(long n1,long p1)
//   {
//      long r1=1;
//      if(n1>=0&&p1==0)
//         r1=1;
//      else if(n1==0&&p1>=1)
//         r1=0;
//      else
//        for(int i=1;i<=p1;i++)
//          r1=r1*n1;
//      return r1;
//     }

// ==========================================================

//     public static void main(String args[]) {
//        System.out.print("Enter x : ");
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        System.out.print("Enter n : ");
//        int n = sc.nextInt();

//        int result = 1;
//        //Please see that n is not too large or else result will exceed the size of int
//        for(int i=0; i<n; i++) {
//            result = result * x;
//        }
//        System.out.println("x to the power n is : "+ result);
//    } 

// -----------------------------------------------------

// 9- Write a function that calculates the Greatest Common Divisor of 2 numbers. 

    // public static void main(String[] args){
    //     int a , b , gcd ;
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a first number: ");
    //     a = sc.nextInt();
    //     System.out.print("Enter a second number: ");
    //     b = sc.nextInt();
    //     gcd = 1;
    //     for(int i = 1; i <= a && i <= b ; i++){
    //         if(a%i==0 && b%i==0)
    //         gcd = i;
    //     }
    //     System.out.printf("The GCD of %d and %d is: %d", a, b, gcd);
    // }

// =====================================================

    //     public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a first number: ");
    //     int n1 = sc.nextInt();
    //     System.out.print("Enter a second number: ");
    //     int n2 = sc.nextInt();

    //     while(n1 != n2) { 
    //         if(n1>n2) {
    //             n1 = n1 - n2;
    //         } else {
    //             n2 = n2 - n1;
    //         }
    //     }
    //     System.out.println("The GCD is: "+ n2);
    // } 

// -----------------------------------------------------

//  10- Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = 0, b = 1;
        System.out.print("Enter the number of terms: ");
        int n=sc.nextInt();   
        System.out.println("First " + n + " terms of fibonnaci series: ");
        //Print the fibonacci series
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(a + ", ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }

}