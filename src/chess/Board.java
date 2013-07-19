package chess;

import java.util.ArrayList;
import pieces.Pawn;

import static pieces.Pawn.WHITE;
import static pieces.Pawn.BLACK;
import static pieces.Pawn.EMPTY;
import static pieces.Pawn.whitePawnLabel;
import static pieces.Pawn.blackPawnLabel;
import static pieces.Pawn.emptyLabel;

/**
 * 
 * class for chess board
 * 
 * @author kyoungchin seo
 *
 */
class Board {
	
	private ArrayList<Pawn> pawns =  new ArrayList<Pawn>();
	private ArrayList<ArrayList<Pawn>> chessBoard  = new ArrayList<ArrayList<Pawn>>();
	
	public static final String NEWLINE = System.getProperty("line.separator");
	
	Board () {
		
	}

	/**
	 * insert each chesspiece(pawn)
	 * @param pawn 
	 * @return number of totally added pawn
	 */
	public int addPiece(Pawn pawn) {
		pawns.add(pawn);
		return pawns.size();
	}
	
	public Pawn getPawn(int index) {
		return pawns.get(index);
	}

	public String getLabel(int index) {
		return pawns.get(index).getLabel();
	}
	
	public void initialize() {	
		for(int row=0;row<8;row++) {
			ArrayList<Pawn> p = new ArrayList<Pawn>();
			switch(row) {
			case 0:
			case 2:
			case 3:
			case 4:
			case 5:
			case 7:
				for(int i=0;i<8;i++) {
					p.add(new Pawn(EMPTY,emptyLabel));
				}
				break;
			case 1:
				for(int i=0;i<8;i++) {
					p.add(new Pawn(WHITE,whitePawnLabel));
				}
				break;
			case 6:
				for(int i=0;i<8;i++) {
					p.add(new Pawn(BLACK,blackPawnLabel));
				}
				break;
			}
			chessBoard.add(p);
		}
	}
	
	public String getRowLabels(int index) {
		StringBuilder rowLabel = new StringBuilder();
		for(int i=0;i<8;i++) {
			rowLabel.append(chessBoard.get(index).get(i).getLabel());
		}
		return rowLabel.toString();
	}

	public String getBoard() {
		StringBuilder boardMap = new StringBuilder();
		for(int i=0;i<8;i++) {
			boardMap.append(getRowLabels(7-i));
			boardMap.append(NEWLINE);
		}
		return boardMap.toString();
	}
	
	public void displayBoard() {
		StringBuilder boardMap = new StringBuilder();
		for(int i=0;i<8;i++) {
			boardMap.append(getRowLabels(7-i));
			boardMap.append(NEWLINE);
		}
		System.out.println(boardMap.toString());
	}
	
	
}
