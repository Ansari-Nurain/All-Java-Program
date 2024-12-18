package a.com;

public class A {

	public void foo() {
		System.out.println("Parent class");
	}
}
	class B extends A {
		public void foo() {
			System.out.println("child class");
		}
	}
	
	class test{

	public static void main(String[] args) {

		B b = new B();
//		A a = new A();
		b.foo();

	}

}
