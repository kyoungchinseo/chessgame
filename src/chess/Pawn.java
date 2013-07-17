package chess;

/**
 * class for Chess Pieces
 * 
 * @author kyoungchin seo
 *
 */
class Pawn {

	private String color;
	
	private final String WHITE = "white";
	private final String BLACK = "black";

	Pawn(String color) {
		this.color = color;
	}
	
	public Pawn() {
		this.color = WHITE;
	}

	public String getColor() {
		// TODO Auto-generated method stub
		return color;
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
