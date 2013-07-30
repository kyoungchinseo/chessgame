package pieces;

import static pieces.COLOR.*;
import static pieces.Piece.Type.*;


/**
 * class for Chess Pieces
 * 
 * @author kyoungchin seo
 *
 */
public class Piece {

	public enum Type {
		NOPIECE("BLANK"),ROOK("ROOK"),KNIGHT("KNIGHT"),BISHOP("BISHOP"),QUEEN("QUEEN"),KING("KING"), PAWN("PAWN");
		
		String name;
		
		Type(String name) {
			this.name = name;
		}
		
		String getName() {
			return name;
		}
	}

	private String color;
	private String name;
	private String symbol; // "P" for black, "p" for white
	
	private char representation;
	private Type type;
	
	public static final String COLOR_WHITE = WHITE.getColor();
	public static final String COLOR_BLACK = BLACK.getColor();
	
	public static final String COLOR_EMPTY = EMPTY.getColor();
	
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

	public static final String NAME_PAWN = PAWN.getName();
	public static final String NAME_KNIGHT = KNIGHT.getName();
	public static final String NAME_ROOK = ROOK.getName();
	public static final String NAME_BISHOP = BISHOP.getName();
	public static final String NAME_QUEEN = QUEEN.getName();
	public static final String NAME_KING = KING.getName();
	
	public static final char PAWN_REPRESENTATION = 'p';
	public static final char KNIGHT_REPRESENTATION = 'n';
	public static final char ROOK_REPRESENTATION = 'r';
	public static final char BISHOP_REPRESENTATION = 'b';
	public static final char QUEEN_REPRESENTATION = 'q';
	public static final char KING_REPRESENTATION = 'k';

	private Piece(COLOR color, String name) {
		this.color = color.getColor();
		this.name = name;
		this.symbol = getSymbol(this.color, name);
	}
	
	private Piece(COLOR color, Type type) {
		this.color = color.getColor();
		this.name = type.getName();
		this.type = type;
		this.symbol = getSymbol(this.color,this.name);
	}
	
	private String getSymbol(String color, String name) {
		String result;
		if (name == PAWN.getName()) {
			if (color == WHITE.getColor()) {
				result = SYMBOL_WHITE_PAWN;
			} else {
				result = SYMBOL_BLACK_PAWN;
			}
		} else if (name == KNIGHT.getName()) {
			if (color == WHITE.getColor()) {
				result = SYMBOL_WHITE_KNIGHT;
			} else {
				result = SYMBOL_BLACK_KNIGHT;
			}
		} else if (name == ROOK.getName()) {
			if (color == WHITE.getColor()) {
				result = SYMBOL_WHITE_ROOK;
			} else {
				result = SYMBOL_BLACK_ROOK;
			}
		} else if (name == BISHOP.getName()) {
			if (color == WHITE.getColor()) {
				result = SYMBOL_WHITE_BISHOP;
			} else {
				result = SYMBOL_BLACK_BISHOP;
			}
		} else if (name == QUEEN.getName()) {
			if (color == WHITE.getColor()) {
				result = SYMBOL_WHITE_QUEEN;
			} else {
				result = SYMBOL_BLACK_QUEEN;
			}
		} else if (name == KING.getName()) {
			if (color == WHITE.getColor()) {
				result = SYMBOL_WHITE_KING;
			} else {
				result = SYMBOL_BLACK_KING;
			}
		} else {
			result = SYMBOL_EMPTY;
		}
		representation = result.charAt(0);
		return result;
	}
	
	// factory method
	public static Piece create(COLOR color, String name) {
		return new Piece(color, name);
	}
	
	public static Piece createWhitePawn() {
		return new Piece(WHITE,PAWN);
	}

	public static Piece createBlackPawn() {
		return new Piece(BLACK,PAWN);
	}
	
	public static Piece createWhiteRook() {
		return new Piece(WHITE,ROOK);
	}
	
	public static Piece createBlackRook() {
		return new Piece(BLACK,ROOK);
	}
	
	public static Piece createWhiteKnight() {
		return new Piece(WHITE,KNIGHT);
	}
	
	public static Piece createBlackKnight() {
		return new Piece(BLACK,KNIGHT);
	}
	
	public static Piece createWhiteBishop() {
		return new Piece(WHITE,BISHOP);
	}
	
	public static Piece createBlackBishop() {
		return new Piece(BLACK,BISHOP);
	}
	
	public static Piece createWhiteQueen() {
		return new Piece(WHITE,QUEEN);
	}
	
	public static Piece createBlackQueen() {
		return new Piece(BLACK,QUEEN);
	}
	
	public static Piece createWhiteKing() {
		return new Piece(WHITE,KING);
	}
	
	public static Piece createBlackKing() {
		return new Piece(BLACK,KING);
	}
	
	public String getColor() {
		return color;
	}
	
	public String getLabel() {
		return symbol;
	}	
	
	public String getName() {
		return name;
	}
	
	public boolean isWhite() {
		if (color == WHITE.getColor()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isBlack() {
		if (color == BLACK.getColor()) {
			return true;
		} else {
			return false;
		}
	}
	
	public Type getType() {
		return type;
	}

	public char getRepresentation() {
		return representation;
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
