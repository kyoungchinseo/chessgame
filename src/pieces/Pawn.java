package pieces;

/**
 * class for Chess Pieces
 * 
 * @author kyoungchin seo
 *
 */
public class Pawn {

	private String color;
	private String label; // "P" for black, "p" for white
	
	public static final String COLOR_WHITE = "white";
	public static final String COLOR_BLACK = "black";
	
	public static final String SYMBOL_WHITE = "p";
	public static final String SYMBOL_BLACK = "P";
	
	public static final String COLOR_EMPTY = "";
	public static final String SYMBOL_EMPTY = ".";
	

	public Pawn(String color, String label) {
		this.color = color;
		this.label = label;
	}
	
	public Pawn() {
		this.color = COLOR_WHITE;
	}

	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}
	
	public String getLabel() {
		return label;
	}	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pawn other = (Pawn) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}

	

}
