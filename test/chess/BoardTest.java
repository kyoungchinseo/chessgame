package chess;
import junit.framework.TestCase;
import pieces.Pawn;

public class BoardTest extends TestCase {
	
	private Board board;
	
	public void setUp() {
		board = new Board();
	}
	
	public void testCreate() throws Exception {
		
		assertEquals(1, board.addPiece(new Pawn("white","p")));
		assertEquals(2, board.addPiece(new Pawn("black","P")));
		
		assertEquals(new Pawn("white","p"), board.getPawn(0));
		assertEquals(new Pawn("black","P"), board.getPawn(1));
		
		/**
		 * P for black pawn, p for white pawn
		 */
		assertEquals("p",board.getLabel(0));
		assertEquals("P",board.getLabel(1));
		
		//assertEquals(3, board.addPiece(new Integer("7")));
		
		
		board.initialize();
		assertEquals("PPPPPPPP", board.getRowLabels(6));
		assertEquals("pppppppp", board.getRowLabels(1));
	
		assertEquals("........"+Board.NEWLINE
				    +"PPPPPPPP"+Board.NEWLINE
				    +"........"+Board.NEWLINE
				    +"........"+Board.NEWLINE
				    +"........"+Board.NEWLINE
				    +"........"+Board.NEWLINE
				    +"pppppppp"+Board.NEWLINE
				    +"........"+Board.NEWLINE,board.getBoard());
		
		board.displayBoard(); // display board
	}	
	
}
