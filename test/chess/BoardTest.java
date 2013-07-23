package chess;
import junit.framework.TestCase;


import static util.StringUtil.NEWLINE;
import static pieces.Pawn.SYMBOL_BLACK;
import static pieces.Pawn.SYMBOL_WHITE;
import static pieces.Pawn.SYMBOL_EMPTY;

public class BoardTest extends TestCase {
	
	private Board board;
	
	public void setUp() {
		board = new Board();
	}
	
	public void testCreate() throws Exception {
		// test generated number of pawns inside the board
		board.initialize();
		assertEquals(16,board.getNumOfPawns());
		
		
		//assertEquals(3, board.addPiece(new Integer("7")));
				
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
