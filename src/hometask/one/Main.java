package hometask.one;

public class Main {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Кітікет і миші", "білий", 4, "Круглик");
		Dog dog1 = new Dog("Педігрі і м'ясо", "чорний", 10, "Бублик");
		Veterinarian vet1 = new Veterinarian("Петро");

		cat1.sleep();
		System.out.println(cat1.getVoice());
		dog1.sleep();
		System.out.println(dog1.getVoice());

		vet1.treatment(cat1);
		vet1.treatment(dog1);
	}
}