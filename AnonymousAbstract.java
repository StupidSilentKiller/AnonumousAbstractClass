package AnonymousAbstractClass;

public class AnonymousAbstract {
    public static void main(String args[]) {
        B obj = new B() {
            public void print1() {
                System.out.println("Faramgate");
            }
		};
		obj.print1();
		obj.print2();
	}
}

abstract class B {
	public abstract void print1();
	public void print2() {
		System.out.println("Barishal");
	}
}
