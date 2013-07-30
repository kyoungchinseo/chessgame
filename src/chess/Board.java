package chess;

import java.util.ArrayList;

import static util.StringUtil.NEWLINE;
import pieces.COLOR;
import pieces.Row;
import static pieces.Piece.COLOR_WHITE;
import static pieces.Piece.COLOR_BLACK;
import static pieces.Piece.COLOR_EMPTY;

/**
 * 
 * class for chess board
 * 
 * @author kyoungchin seo
 *
 */
public class Board {
	
	private ArrayList<Row> chessBoard  = new ArrayList<Row>();
	
	private int numOfPawns = 0;
	
	public static final int FRONT_LINE = 1; // eight pawns
	public static final int BACK_LINE = 2;  // RNBQKBNR
	public static final int EMPTY_LINE = 0; // empty
	
	Board () {
		
	}

	public void initialize() {	
		for(int row=0;row<8;row++) {
			switch(row) {
			case 0:
				chessBoard.add(new Row(COLOR.WHITE,BACK_LINE));
				break;
			case 1:
				chessBoard.add(new Row(COLOR.WHITE,FRONT_LINE));
				break;
			case 6:
				chessBoard.add(new Row(COLOR.BLACK,FRONT_LINE));
				break;
			case 7:
				chessBoard.add(new Row(COLOR.BLACK,BACK_LINE));
				break;
			default:
				chessBoard.add(new Row(COLOR.EMPTY,EMPTY_LINE));
				break;
			}
			// calculate total number of pawns in chessboard
			this.numOfPawns += chessBoard.get(row).getNumOfPawns(); 
		}
	}
	
	public String getRowSymbols(int index) {
		return chessBoard.get(index).getRow();
	}

	public String print() {
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

	public int pieceCount() {	
		return numOfPawns;
	}
}
