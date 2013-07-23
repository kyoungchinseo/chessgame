package chess;

import java.util.ArrayList;

import pieces.Row;
import static pieces.Pawn.COLOR_WHITE;
import static pieces.Pawn.COLOR_BLACK;
import static pieces.Pawn.COLOR_EMPTY;
import static pieces.Pawn.SYMBOL_WHITE;
import static pieces.Pawn.SYMBOL_BLACK;
import static pieces.Pawn.SYMBOL_EMPTY;

/**
 * 
 * class for chess board
 * 
 * @author kyoungchin seo
 *
 */
class Board {
	
	private ArrayList<Row> chessBoard  = new ArrayList<Row>();
	
	public static final String NEWLINE = System.getProperty("line.separator");
	
	private int numOfPawns = 0;
	
	Board () {
		
	}

	public void initialize() {	
		for(int row=0;row<8;row++) {
			switch(row) {
			case 1:
				chessBoard.add(new Row(COLOR_WHITE,SYMBOL_WHITE));
				break;
			case 6:
				chessBoard.add(new Row(COLOR_BLACK,SYMBOL_BLACK));
				break;
			default:
				chessBoard.add(new Row(COLOR_EMPTY,SYMBOL_EMPTY));
				break;
			}
			// calculate total number of pawns in chessboard
			this.numOfPawns += chessBoard.get(row).getNumOfPawns(); 
		}
	}
	
	public String getRowSymbols(int index) {
		return chessBoard.get(index).getRow();
	}

	public String getBoard() {
		StringBuilder boardMap = new StringBuilder();
		for(int i=0;i<8;i++) {
			boardMap.append(getRowSymbols(7-i));
			boardMap.append(NEWLINE);
		}
		return boardMap.toString();
	}
	
	public void displayBoard() {
		StringBuilder boardMap = new StringBuilder();
		for(int i=0;i<8;i++) {
			boardMap.append(getRowSymbols(7-i));
			boardMap.append(NEWLINE);
		}
		System.out.println(boardMap.toString());
	}

	public int getNumOfPawns() {
		
		return numOfPawns;
	}
}
