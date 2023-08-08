package super0807;


	class Parent {
	    int x = 10;

	    public Parent(int x) {
	        this.x = x;
	    }
	}

	class Child extends Parent {
	    int x = 20;

	    public Child(int x) {
	        super(10);
	        this.x = x;
	    }
	    public void method() {
	        System.out.println(this.x);
	        System.out.println(super.x);
	    }
	}
	
	public class SuperExample {
	    public static void main(String[] args) {
	        Child c = new Child(20);
	        c.method();
	    }
	}	

