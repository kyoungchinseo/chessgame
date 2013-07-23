package chess;
import junit.framework.TestCase;


import util.StringUtil;

public class BoardTest extends TestCase {
	
	private Board board;
	
	protected void setUp() {
		board = new Board();
	}
	
	public void testCreate() throws Exception {
		// test generated number of pawns inside the board
		board.initialize();
		assertEquals(32,board.pieceCount());
		
		String blankRank = StringUtil.appendNewLine("........");
		
		assertEquals(
				StringUtil.appendNewLine("RNBQKBNR") +
				StringUtil.appendNewLine("PPPPPPPP") +
				blankRank + blankRank + blankRank + blankRank + 
				StringUtil.appendNewLine("pppppppp") +
				StringUtil.appendNewLine("rnbqkbnr"),
				board.print());
		
		board.displayBoard(); // display board
		
	}	
	
}
