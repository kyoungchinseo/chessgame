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
		
		piece = Piece.create(COLOR.WHITE, NAME_BISHOP);
		assertEquals(COLOR.WHITE.getColor(), piece.getColor()); 
		assertEquals(NAME_BISHOP, piece.getName());
		assertEquals(SYMBOL_WHITE_BISHOP, piece.getLabel());
		
		assertEquals(true, piece.isWhite());
		
		piece = Piece.create(COLOR.BLACK, NAME_BISHOP);
		assertEquals(COLOR.BLACK.getColor(), piece.getColor()); 
		assertEquals(NAME_BISHOP, piece.getName());
		assertEquals(SYMBOL_BLACK_BISHOP, piece.getLabel());
	
		assertEquals(true, piece.isBlack());
		
		
		
	}
	
	
	
}
