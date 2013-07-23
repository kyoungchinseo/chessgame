package pieces;
//import pieces.Pawn;
import junit.framework.TestCase;

import static pieces.Piece.COLOR_BLACK;
import static pieces.Piece.COLOR_WHITE;

import static pieces.Piece.NAME_BISHOP;
import static pieces.Piece.SYMBOL_BLACK_BISHOP;
import static pieces.Piece.SYMBOL_WHITE_BISHOP;


public class PieceTest extends TestCase {
	
	private Piece piece;
	
	public void testCreate() throws Exception {
		
		piece = Piece.create(COLOR_WHITE, NAME_BISHOP);
		assertEquals(COLOR_WHITE, piece.getColor()); 
		assertEquals(NAME_BISHOP, piece.getName());
		assertEquals(SYMBOL_WHITE_BISHOP, piece.getLabel());
		
		piece = Piece.create(COLOR_BLACK, NAME_BISHOP);
		assertEquals(COLOR_BLACK, piece.getColor()); 
		assertEquals(NAME_BISHOP, piece.getName());
		assertEquals(SYMBOL_BLACK_BISHOP, piece.getLabel());
		
	}
	
}
