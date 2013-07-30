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

	private COLOR color;
	
	private char representation;
	private Type type;

	public static final char PAWN_REPRESENTATION = 'p';
	public static final char KNIGHT_REPRESENTATION = 'n';
	public static final char ROOK_REPRESENTATION = 'r';
	public static final char BISHOP_REPRESENTATION = 'b';
	public static final char QUEEN_REPRESENTATION = 'q';
	public static final char KING_REPRESENTATION = 'k';
	
	public static final char EMPTY_REPRESENTATION = '.';

	private Piece(COLOR color, Type type) {
		this.color = color;
		this.type = type;
		this.representation = calcRepresentation(color,type);
	}
	
	private char calcRepresentation(COLOR color, Type type) {
		char result = ' ';
		switch(type)
		{
		case PAWN:
			if (color == WHITE) {
				result = PAWN_REPRESENTATION;
			} else {
				result = Character.toUpperCase(PAWN_REPRESENTATION);
			}
			break;
		case KNIGHT:
			if (color == WHITE) {
				result = KNIGHT_REPRESENTATION;
			} else {
				result = Character.toUpperCase(KNIGHT_REPRESENTATION);
			}
			break;
		case ROOK:
			if (color == WHITE) {
				result = ROOK_REPRESENTATION;
			} else {
				result = Character.toUpperCase(ROOK_REPRESENTATION);
			}
			break;
		case QUEEN:
			if (color == WHITE) {
				result = QUEEN_REPRESENTATION;
			} else {
				result = Character.toUpperCase(QUEEN_REPRESENTATION);
			}
			break;
		case KING:
			if (color == WHITE) {
				result = KING_REPRESENTATION;
			} else {
				result = Character.toUpperCase(KING_REPRESENTATION);
			}
			break;
		case BISHOP:
			if (color == WHITE) {
				result = BISHOP_REPRESENTATION;
			} else {
				result = Character.toUpperCase(BISHOP_REPRESENTATION);
			}
			break;
		case NOPIECE:
			result = EMPTY_REPRESENTATION;
			break;
		}
		return result;
	}
		
	// factory method
	public static Piece create(COLOR color, Type type) {
		return new Piece(color, type);
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
	
	public String getLabel() {
		return Character.toString(representation);
	}	
	
	public boolean isWhite() {
		if (color == WHITE) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isBlack() {
		if (color == BLACK) {
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
