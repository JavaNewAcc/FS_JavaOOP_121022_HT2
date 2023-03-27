package hometask.one;

public class Cat extends Animal {
	private String name;

	public Cat() {
		super();
	}

	public Cat(String ration, String color, int weight, String name) {
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
		return "Cat [name=" + name + ", color=" + getColor() + ", ration=" + getRation() + ", weight=" + getWeight()
				+ " kg]";
	}

	@Override
	public String getVoice() {
		return "Мяу-мяу";
	}

	@Override
	public void eat() {
		System.out.println(name + " їсть " + getRation());
	}

	@Override
	public void sleep() {
		System.out.println(name + " спить вдома на батареї не менше 12 годин на день");
	}
}
