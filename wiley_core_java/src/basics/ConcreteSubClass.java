package basics;




class Animal {
    public void move() {
        System.out.println("Moving...");
    }
}

class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("Running on four legs...");
    }
}




public class ConcreteSubClass {
	public static void main(String[] args) {
		
	}
}
