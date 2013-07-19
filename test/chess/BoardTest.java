package chess;
import junit.framework.TestCase;
import pieces.Pawn;

public class BoardTest extends TestCase {
	
	private Board board;
	
	public void setUp() {
		board = new Board();
	}
	
	public void testCreate() throws Exception {
		
		assertEquals(1, board.addPiece(new Pawn("white")));
		assertEquals(2, board.addPiece(new Pawn("black")));
		
		assertEquals(new Pawn("white"), board.getPawn(0));
		assertEquals(new Pawn("black"), board.getPawn(1));
		
		//assertEquals(3, board.addPiece(new Integer("7")));
	}	
	
}
