package pieces;
//import pieces.Pawn;
import junit.framework.TestCase;

import static pieces.Piece.COLOR_BLACK;
import static pieces.Piece.COLOR_WHITE;
import static pieces.Piece.SYMBOL_BLACK;
import static pieces.Piece.SYMBOL_WHITE;

public class PieceTest extends TestCase {
	
	private Piece firstPawn;
	private Piece secondPawn;
	
	private final String whiteColor = COLOR_WHITE;
	private final String blackColor = COLOR_BLACK;
	
	
	public void setUp() {
		firstPawn = new Piece(whiteColor,SYMBOL_WHITE);
		secondPawn = new Piece(blackColor,SYMBOL_BLACK);
	}
	
	
	public void testCreate() throws Exception {
		String firstPawncolor = firstPawn.getColor();
		assertEquals(whiteColor, firstPawncolor);
		
		String secondPawnColor = secondPawn.getColor();
		assertEquals(blackColor, secondPawnColor);
	}
	
	public void testPawn() throws Exception {
		Piece pawn = new Piece();
		assertEquals(COLOR_WHITE, pawn.getColor());
	}
}
