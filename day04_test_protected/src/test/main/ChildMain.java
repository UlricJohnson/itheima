package test.main;

public class ChildMain extends FatherMain {

	public ChildMain() {
	}

	public void test() {
		System.out.println("i: " + i);
		System.out.println("this.i: " + this.i);
		System.out.println("super.i: " + super.i);
		
//		System.out.println("new FatherMain().i: " + new FatherMain().i);
//		System.out.println("new ChildMain().i: " + new ChildMain().i);
	}

	// public static void main(String[] args) {
	// new ChildMain().test();
	// }

}
