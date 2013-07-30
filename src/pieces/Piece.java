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
	
	public static final String COLOR_WHITE = COLOR.WHITE.getColor();
	public static final String COLOR_BLACK = COLOR.BLACK.getColor();
	
	public static final String COLOR_EMPTY = COLOR.EMPTY.getColor();
	
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


	private Piece(COLOR color, String name) {
		this.color = color.getColor();
		this.name = name;
		this.symbol = getSymbol(this.color, name);
	}
	
	private Piece(COLOR color, Type type) {
		this.color = color.getColor();
		this.name = type.getName();
		this.symbol = getSymbol(this.color,this.name);
	}
	
	private String getSymbol(String color, String name) {
		String result;
		if (name == Type.PAWN.getName()) {
			if (color == COLOR.WHITE.getColor()) {
				result = SYMBOL_WHITE_PAWN;
			} else {
				result = SYMBOL_BLACK_PAWN;
			}
		} else if (name == Type.KNIGHT.getName()) {
			if (color == COLOR.WHITE.getColor()) {
				result = SYMBOL_WHITE_KNIGHT;
			} else {
				result = SYMBOL_BLACK_KNIGHT;
			}
		} else if (name == Type.ROOK.getName()) {
			if (color == COLOR.WHITE.getColor()) {
				result = SYMBOL_WHITE_ROOK;
			} else {
				result = SYMBOL_BLACK_ROOK;
			}
		} else if (name == Type.BISHOP.getName()) {
			if (color == COLOR.WHITE.getColor()) {
				result = SYMBOL_WHITE_BISHOP;
			} else {
				result = SYMBOL_BLACK_BISHOP;
			}
		} else if (name == Type.QUEEN.getName()) {
			if (color == COLOR.WHITE.getColor()) {
				result = SYMBOL_WHITE_QUEEN;
			} else {
				result = SYMBOL_BLACK_QUEEN;
			}
		} else if (name == Type.KING.getName()) {
			if (color == COLOR.WHITE.getColor()) {
				result = SYMBOL_WHITE_KING;
			} else {
				result = SYMBOL_BLACK_KING;
			}
		} else {
			result = SYMBOL_EMPTY;
		}
		return result;
	}
	
	// factory method
	public static Piece create(COLOR color, String name) {
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
	
	public boolean isWhite() {
		if (color == COLOR_WHITE) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isBlack() {
		if (color == COLOR_BLACK) {
			return true;
		} else {
			return false;
		}
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
