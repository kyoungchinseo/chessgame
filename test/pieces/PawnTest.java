package pieces;
//import pieces.Pawn;
import junit.framework.TestCase;

import static pieces.Pawn.COLOR_BLACK;
import static pieces.Pawn.COLOR_WHITE;

public class PawnTest extends TestCase {
	
	private Pawn firstPawn;
	private Pawn secondPawn;
	
	private final String whiteColor = COLOR_WHITE;
	private final String blackColor = COLOR_BLACK;
	
	
	public void setUp() {
		firstPawn = new Pawn(whiteColor,"p");
		secondPawn = new Pawn(blackColor,"P");
	}
	
	
	public void testCreate() throws Exception {
		String firstPawncolor = firstPawn.getColor();
		assertEquals(whiteColor, firstPawncolor);
		
		String secondPawnColor = secondPawn.getColor();
		assertEquals(blackColor, secondPawnColor);
	}
	
	public void testPawn() throws Exception {
		Pawn pawn = new Pawn();
		assertEquals(COLOR_WHITE, pawn.getColor());
	}
}
