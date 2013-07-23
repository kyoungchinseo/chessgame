package pieces;

import java.util.ArrayList;
import pieces.Piece;
import static pieces.Piece.COLOR_BLACK;
import static pieces.Piece.COLOR_WHITE;

public class Row {
	private ArrayList<Piece> rowPawns = new ArrayList<Piece>(); 
	
	private int numOfPawns = 0;
	
	public Row(String color, String symbol) {		
		for(int i=0;i<8;i++) {
			rowPawns.add(new Piece(color,symbol));
			if (color == COLOR_BLACK || color == COLOR_WHITE) {
				numOfPawns++;
			}
			
		}
	}
	
	public String getRow() {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<rowPawns.size();i++) {
			sb.append(rowPawns.get(i).getLabel());
		}
		return sb.toString();
	}
	
	public int getNumOfPawns() {
		return numOfPawns;
	}

}
