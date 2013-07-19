package chess;
import junit.framework.TestCase;
import pieces.Pawn;

import static chess.Board.NEWLINE;
import static pieces.Pawn.COLOR_BLACK;
import static pieces.Pawn.COLOR_WHITE;
import static pieces.Pawn.COLOR_EMPTY;
import static pieces.Pawn.SYMBOL_BLACK;
import static pieces.Pawn.SYMBOL_WHITE;
import static pieces.Pawn.SYMBOL_EMPTY;

public class BoardTest extends TestCase {
	
	private Board board;
	
	public void setUp() {
		board = new Board();
	}
	
	public void testCreate() throws Exception {
		
		assertEquals(1, board.addPiece(new Pawn(COLOR_WHITE,SYMBOL_WHITE)));
		assertEquals(2, board.addPiece(new Pawn(COLOR_BLACK,SYMBOL_BLACK)));
		assertEquals(3, board.addPiece(new Pawn(COLOR_EMPTY,SYMBOL_EMPTY)));
		
		
		assertEquals(new Pawn(COLOR_WHITE,SYMBOL_WHITE), board.getPawn(0));
		assertEquals(new Pawn(COLOR_BLACK,SYMBOL_BLACK), board.getPawn(1));
		assertEquals(new Pawn(COLOR_EMPTY,SYMBOL_EMPTY), board.getPawn(2));
		
		
		/**
		 * P for black pawn, p for white pawn
		 */
		assertEquals(SYMBOL_WHITE,board.getLabel(0));
		assertEquals(SYMBOL_BLACK,board.getLabel(1));
		assertEquals(SYMBOL_EMPTY,board.getLabel(2));
		
		//assertEquals(3, board.addPiece(new Integer("7")));
		
		board.initialize();
		StringBuilder rowWhitePawns = new StringBuilder();
		StringBuilder rowBlackPawns = new StringBuilder();
		StringBuilder rowEmptyPawns = new StringBuilder();
		for(int i=0;i<8;i++) {
			rowWhitePawns.append(SYMBOL_WHITE);
			rowBlackPawns.append(SYMBOL_BLACK);
			rowEmptyPawns.append(SYMBOL_EMPTY);			
		}
		String strRowWhitePawns = rowWhitePawns.toString();
		String strRowBlackPawns = rowBlackPawns.toString();
		String strRowEmptyPawns = rowEmptyPawns.toString();
		
		assertEquals(strRowBlackPawns, board.getRowLabels(6));
		assertEquals(strRowWhitePawns, board.getRowLabels(1));
	
		assertEquals(strRowEmptyPawns+NEWLINE
				    +strRowBlackPawns+NEWLINE
				    +strRowEmptyPawns+NEWLINE
				    +strRowEmptyPawns+NEWLINE
				    +strRowEmptyPawns+NEWLINE
				    +strRowEmptyPawns+NEWLINE
				    +strRowWhitePawns+NEWLINE
				    +strRowEmptyPawns+NEWLINE,board.getBoard());
		
		board.displayBoard(); // display board
	}	
	
}
