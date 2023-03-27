package hometask.one;

public class Veterinarian {
	private String name;

	public Veterinarian() {
		super();
	}

	public Veterinarian(String name) {
		super();
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
		return "Veterinarian [name=" + name + "]";
	}

	public void treatment(Animal animal) {
		System.out.println("Ветеринар " + name + " лікує " + animal.toString());
	}
}
