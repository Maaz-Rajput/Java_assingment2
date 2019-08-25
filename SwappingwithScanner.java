import java.util.Scanner;
	
	class SwappingwithScanner{
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			System.out.println("Enter the value of A: ");
			int a = input.nextInt();

			System.out.println("enter the value of B: ");
			int b = input.nextInt();

			int temp;
			System.out.println("Before Swapping \n A = " + a + "\nB = " + b );

			temp = a;
			a = b;
			b = temp;

			System.out.println("After Swapping \n A = " + a + "\nB = " + b );


		}
	}