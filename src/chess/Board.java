package chess;

import java.util.ArrayList;

import static util.StringUtil.NEWLINE;
import pieces.COLOR;
import pieces.Piece;
import pieces.Piece.Type;
import pieces.Row;
import static pieces.COLOR.*;
import static pieces.Piece.Type.*;

/**
 * 
 * class for chess board
 * 
 * @author kyoungchin seo
 *
 */
public class Board {
	
	private ArrayList<Row> chessBoard  = new ArrayList<Row>();
	
	private ArrayList<Position> positionList = new ArrayList<Position>();
	
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
		Position p= new Position(pos);
		return chessBoard.get(p.getPostionRow()).getPiece(p.getPostionCol());
	}
	
	public void addPiece(String pos, Piece piece) {
		Position p= new Position(pos);
		positionList.add(p);
		chessBoard.get(p.getPostionRow()).addPiece(p.getPostionCol(),piece);
		
	}
	
	public double getStatusValue(COLOR color) {
		double statusValue = 0.0;
		for(int i=0;i<positionList.size();i++) {
			int row = positionList.get(i).getPostionRow();
			int col = positionList.get(i).getPostionCol();
			if (chessBoard.get(row).getPiece(col).getColor() == color) {
				statusValue += chessBoard.get(row).getPiece(col).getType().getPoint();
			}
		}
		
		// check pawns on the same column
		for(int i=0;i<8;i++) {
			int numOfPawnsOnSameColumn = 0;
			for(int j=0;j<8;j++) {
				if (chessBoard.get(j).getPiece(i).getColor() == color) {
					if (chessBoard.get(j).getPiece(i).getType() == PAWN) {
						numOfPawnsOnSameColumn++;
					}
				}
			}
			if (numOfPawnsOnSameColumn > 1) {
				statusValue = statusValue - (double)numOfPawnsOnSameColumn*0.5;
			}
		}
		
		return statusValue;
	}

}
