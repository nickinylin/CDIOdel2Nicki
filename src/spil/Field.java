package spil;

public class Field {

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	private String name;
	private int value;

	public Field(String name, int value) {
		this.name = name;
		this.value = value;
	}

}
