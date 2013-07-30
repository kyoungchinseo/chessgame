package chess;

import java.util.ArrayList;

import static util.StringUtil.NEWLINE;
import pieces.COLOR;
import pieces.Piece;
import pieces.Piece.Type;
import pieces.Row;
import static pieces.COLOR.*;

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
				chessBoard.add(new Row(WHITE,BACK_LINE));
				break;
			case 1:
				chessBoard.add(new Row(WHITE,FRONT_LINE));
				break;
			case 6:
				chessBoard.add(new Row(BLACK,FRONT_LINE));
				break;
			case 7:
				chessBoard.add(new Row(BLACK,BACK_LINE));
				break;
			default:
				chessBoard.add(new Row(EMPTY,EMPTY_LINE));
				break;
			}
			// calculate total number of pawns in chessboard
			this.numOfPawns += chessBoard.get(row).getNumOfPawns(); 
		}
	}
	
	public void initializeWithEmpty() {
		for(int row=0;row<8;row++) {
			chessBoard.add(new Row(EMPTY,EMPTY_LINE));
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

	public int getNumOfPieces(COLOR c, Type t) {
		int total = 0;
		for(int i=0;i<8;i++) {
			total += chessBoard.get(i).getNumOfPieces(c,t);
		}
		return total;
	}

	public Piece getPiece(String pos) {
		int row = Character.getNumericValue(pos.charAt(1))-1; // start from 0
		int col = Character.getNumericValue(pos.charAt(0))-10;  // 'a' is 10
		
		return chessBoard.get(row).getPiece(col);
	}
	
	public void addPiece(String pos, Piece piece) {
		int row = Character.getNumericValue(pos.charAt(1))-1; // start from 0
		int col = Character.getNumericValue(pos.charAt(0))-10;  // 'a' is 10
		
		chessBoard.get(row).addPiece(col,piece);
		
	}

}
