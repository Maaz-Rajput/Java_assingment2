class Swapwithouttemp{
	public static void main(String[] args) {
		int x = 2 , y = 4 ;
		System.out.println("Before Swapping \n X = " + x + "\nY = " + y);

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("After Swapping \n X = " + x + "\nY = " + y);
	}
}