package pieces;
//import pieces.Pawn;
import junit.framework.TestCase;

import static pieces.Pawn.BLACK;
import static pieces.Pawn.WHITE;

public class PawnTest extends TestCase {
	
	private Pawn firstPawn;
	private Pawn secondPawn;
	
	private final String whiteColor = WHITE;
	private final String blackColor = BLACK;
	
	
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
		assertEquals(WHITE, pawn.getColor());
	}
}
