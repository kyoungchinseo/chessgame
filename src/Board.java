import java.util.ArrayList;


class Board {
	
	private ArrayList<Pawn> pawns =  new ArrayList<Pawn>();
	
	Board () {
		
	}

	public int addPiece(Pawn pawn) {
		pawns.add(pawn);
		return pawns.size();
	}
	
	public Pawn getPawn(int index) {
		return pawns.get(index);
	}
}
