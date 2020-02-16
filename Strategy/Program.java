package itay;

public class Program {

	public static void main(String[] args) {
		System.out.println("Hello Java!");
		Dog rexy = new Dog("Rexy", new CannotFly());
		
		rexy.Fly();
		// rexy can fly!
		rexy.ChangeFlyAttitude(new CanFly());
		rexy.Fly();
		
	}

}
