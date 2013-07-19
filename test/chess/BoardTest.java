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
		
		// test row by row
		StringBuilder rowWhitePawns = new StringBuilder();
		StringBuilder rowBlackPawns = new StringBuilder();
		StringBuilder rowEmptyPawns = new StringBuilder();
		for(int i=0;i<8;i++) {
			rowWhitePawns.append(SYMBOL_WHITE);
			rowBlackPawns.append(SYMBOL_BLACK);
			rowEmptyPawns.append(SYMBOL_EMPTY);			
		}
		assertEquals(rowBlackPawns.toString(), board.getRowSymbols(6));
		assertEquals(rowWhitePawns.toString(), board.getRowSymbols(1));
		assertEquals(rowEmptyPawns.toString(), board.getRowSymbols(0));
		
		// test chessboard print
		StringBuilder boardDisplay = new StringBuilder();
		for(int row=0;row<8;row++) {
			switch(row) {
			default:
				for(int i=0;i<8;i++) {
					boardDisplay.append(SYMBOL_EMPTY);
				}
				break;
			case 6:
				for(int i=0;i<8;i++) {
					boardDisplay.append(SYMBOL_WHITE);
				}
				break;
			case 1:
				for(int i=0;i<8;i++) {
					boardDisplay.append(SYMBOL_BLACK);
				}
				break;
			}
			boardDisplay.append(NEWLINE);
		}
		assertEquals(boardDisplay.toString(),board.getBoard());
		
		board.displayBoard(); // display board
	}	
	
}
