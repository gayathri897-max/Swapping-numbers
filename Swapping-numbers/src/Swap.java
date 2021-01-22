
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a = 2, b = 3;

        System.out.println("Before swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Value of first is assigned to temporary
        int t = a;

        // Value of second is assigned to first
        a = b;

        // Value of temporary (which contains the initial value of first) is assigned to second
        b = t;

        System.out.println("After swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

	}

