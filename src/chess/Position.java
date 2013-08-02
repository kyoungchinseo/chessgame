package chess;

public class Position {
	private int row = 0;
	private int col = 0;
	Position() {
	}
	
	Position(String pos) {
		setPosition(pos);
	}
	
	public void setPosition (String pos) {
		row = Character.getNumericValue(pos.charAt(1))-1; // start from 0
		col = Character.getNumericValue(pos.charAt(0))-10;  // 'a' is 10
	}
	
	public int getPostionRow() {
		return row;
	}
	
	public int getPostionCol() {
		return col;
	}
	
}
