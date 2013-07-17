package chess;
import java.util.ArrayList;

/**
 * 
 * class for chess board
 * 
 * @author kyoungchin seo
 *
 */
class Board {
	
	private ArrayList<Pawn> pawns =  new ArrayList<Pawn>();
	
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
}
