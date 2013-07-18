package chess;
import junit.framework.TestCase;
import pieces.Pawn;

public class BoardTest extends TestCase {
	public void testCreate() throws Exception {
		Board board = new Board();	
		
		assertEquals(1, board.addPiece(new Pawn("white")));
		assertEquals(2, board.addPiece(new Pawn("black")));
		
		assertEquals(new Pawn("white"), board.getPawn(0));
		assertEquals(new Pawn("black"), board.getPawn(1));
		
	}	
}
