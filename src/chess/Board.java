package chess;

import java.util.ArrayList;

import pieces.Pawn;

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
					p.add(new Pawn("empty","."));
				}
				break;
			case 1:
				for(int i=0;i<8;i++) {
					p.add(new Pawn("white","p"));
				}
				break;
			case 6:
				for(int i=0;i<8;i++) {
					p.add(new Pawn("black","P"));
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
			boardMap.append("\n");
		}
		return boardMap.toString();
	}
	
	public void displayBoard() {
		StringBuilder boardMap = new StringBuilder();
		for(int i=0;i<8;i++) {
			boardMap.append(getRowLabels(7-i));
			boardMap.append("\n");
		}
		System.out.println(boardMap.toString());
	}
	
	
}
