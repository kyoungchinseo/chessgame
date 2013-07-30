package chess;
import junit.framework.TestCase;

import pieces.Piece;

import static pieces.COLOR.*;
import static pieces.Piece.Type.*;

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
	
	public void testGetMethods() throws Exception {
		board.initialize();
		assertEquals(32,board.pieceCount());
		
		
		assertEquals(8, board.getNumOfPieces(WHITE,PAWN));
		assertEquals(2, board.getNumOfPieces(BLACK,ROOK));
		assertEquals(1, board.getNumOfPieces(WHITE,KING));
		
		Piece piece = board.getPiece("a8");
		assertEquals(ROOK, piece.getType());
		
		assertEquals(KING,board.getPiece("e1").getType());
		
	}
	
}
