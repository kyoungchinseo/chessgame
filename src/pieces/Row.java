package pieces;

import java.util.ArrayList;
import pieces.Pawn;

public class Row {
	private ArrayList<Pawn> rowPawns = new ArrayList<Pawn>(); 
	
	public Row(String color, String symbol) {		
		for(int i=0;i<8;i++) {
			rowPawns.add(new Pawn(color,symbol));
		}
	}
	
	public String getRow() {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<rowPawns.size();i++) {
			sb.append(rowPawns.get(i).getLabel());
		}
		return sb.toString();
	}

}
