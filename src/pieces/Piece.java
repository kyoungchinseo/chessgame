package pieces;



/**
 * class for Chess Pieces
 * 
 * @author kyoungchin seo
 *
 */
public class Piece {

	private String color;
	private String name;
	private String symbol; // "P" for black, "p" for white
	
	public static final String COLOR_WHITE = "white";
	public static final String COLOR_BLACK = "black";
	
	public static final String COLOR_EMPTY = "";
	public static final String SYMBOL_EMPTY = ".";
	public static final String NAME_EMPTY = "empty";
	
	public static final String SYMBOL_WHITE_PAWN = "p";
	public static final String SYMBOL_BLACK_PAWN = "p".toUpperCase();
	public static final String SYMBOL_WHITE_KNIGHT = "n";
	public static final String SYMBOL_BLACK_KNIGHT = "n".toUpperCase();
	public static final String SYMBOL_WHITE_ROOK = "r";
	public static final String SYMBOL_BLACK_ROOK = "r".toUpperCase();
	public static final String SYMBOL_WHITE_BISHOP = "b";
	public static final String SYMBOL_BLACK_BISHOP = "b".toUpperCase();
	public static final String SYMBOL_WHITE_QUEEN = "q";
	public static final String SYMBOL_BLACK_QUEEN = "q".toUpperCase();
	public static final String SYMBOL_WHITE_KING = "k";
	public static final String SYMBOL_BLACK_KING = "k".toUpperCase();

	public static final String NAME_PAWN = "pawn";
	public static final String NAME_KNIGHT = "knight";
	public static final String NAME_ROOK = "rook";
	public static final String NAME_BISHOP = "bishop";
	public static final String NAME_QUEEN = "queen";
	public static final String NAME_KING = "king";


	private Piece(String color, String name) {
		this.color = color;
		this.name = name;
		this.symbol = getSymbol(color, name);
	}
	
	private String getSymbol(String color, String name) {
		String result;
		if (name == NAME_PAWN) {
			if (color == COLOR_WHITE) {
				result = SYMBOL_WHITE_PAWN;
			} else {
				result = SYMBOL_BLACK_PAWN;
			}
		} else if (name == NAME_KNIGHT) {
			if (color == COLOR_WHITE) {
				result = SYMBOL_WHITE_KNIGHT;
			} else {
				result = SYMBOL_BLACK_KNIGHT;
			}
		} else if (name == NAME_ROOK) {
			if (color == COLOR_WHITE) {
				result = SYMBOL_WHITE_ROOK;
			} else {
				result = SYMBOL_BLACK_ROOK;
			}
		} else if (name == NAME_BISHOP) {
			if (color == COLOR_WHITE) {
				result = SYMBOL_WHITE_BISHOP;
			} else {
				result = SYMBOL_BLACK_BISHOP;
			}
		} else if (name == NAME_QUEEN) {
			if (color == COLOR_WHITE) {
				result = SYMBOL_WHITE_QUEEN;
			} else {
				result = SYMBOL_BLACK_QUEEN;
			}
		} else if (name == NAME_KING) {
			if (color == COLOR_WHITE) {
				result = SYMBOL_WHITE_KING;
			} else {
				result = SYMBOL_BLACK_KING;
			}
		} else {
			result = SYMBOL_EMPTY;
		}
		return result;
	}
	
	public static Piece create(String color, String name) {
		return new Piece(color, name);
	}
	
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}
	
	public String getLabel() {
		return symbol;
	}	
	
	public String getName() {
		return name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Piece other = (Piece) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}

	

}
