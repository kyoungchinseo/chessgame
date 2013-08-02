package pieces;

import static pieces.COLOR.*;
import static pieces.Piece.Type.*;


/**
 * class for Chess Pieces
 * 
 * @author kyoungchin seo
 *
 */
public class Piece implements Comparable<Piece> {

	public enum Type {
		NO_PIECE(0.0),ROOK(5.0),KNIGHT(2.5),BISHOP(3.0),QUEEN(9.0),KING(0.0), PAWN(1.0);
		
		private double point;
		
		Type(double point) {
			this.point = point;
		}
		
		public double getPoint() {
			return point;
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
		case NO_PIECE:
			result = EMPTY_REPRESENTATION;
			break;
		}
		return result;
	}
		
	// factory method
	public static Piece create(COLOR color, Type type) {
		return new Piece(color, type);
	}


	public static Piece createPawn(COLOR color) {
		return new Piece(color,PAWN);
	}

	public static Piece createRook(COLOR color) {
		return new Piece(color,ROOK);
	}

	public static Piece createKnight(COLOR color) {
		return new Piece(color,KNIGHT);
	}
	
	public static Piece createBishop(COLOR color) {
		return new Piece(color,BISHOP);
	}

	public static Piece createQueen(COLOR color) {
		return new Piece(color,QUEEN);
	}
	
	public static Piece createKing(COLOR color) {
		return new Piece(color,KING);
	}
	
	public static Piece noPiece() {
		return new Piece(EMPTY,NO_PIECE);
	}
	
	public String getLabel() {
		return Character.toString(representation);
	}	
	
	public COLOR getColor() {
		return color;
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

	@Override
	public int compareTo(Piece that) {
		int compare = (int)(that.getType().getPoint() - this.getType().getPoint());
		return compare;
	}

	
	

}
