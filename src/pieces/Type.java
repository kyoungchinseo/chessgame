package pieces;

public enum Type {
	ROOK("ROOK"),KNIGHT("KNIGHT"),BISHOP("BISHOP"),QUEEN("QUEEN"),KING("KING"),PAWN("PAWN");
	
	private String name;
	
	Type(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
}
