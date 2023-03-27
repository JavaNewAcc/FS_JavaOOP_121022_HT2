package hometask.one;

public class Dog extends Animal {

	private String name;

	public Dog() {
		super();
	}

	public Dog(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + getColor() + ", ration=" + getRation() + ", weight=" + getWeight()
				+ " kg]";
	}

	@Override
	public String getVoice() {
		return "Гав-гав";
	}

	@Override
	public void eat() {
		System.out.println(name + " їсть" + getRation());
	}

	@Override
	public void sleep() {
		System.out.println(name + " спить у будці від 8 до 10 годин на день");
	}
}
