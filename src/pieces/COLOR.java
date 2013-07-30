package pieces;

public enum COLOR {
	WHITE("white"),BLACK("black"),EMPTY("empty");
	private String color;
	COLOR(String color) {
		this.color = color;
	}
	String getColor() {
		return color;
	}
}

