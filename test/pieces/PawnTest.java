package pieces;
//import pieces.Pawn;
import junit.framework.TestCase;


public class PawnTest extends TestCase {
	
	private Pawn firstPawn;
	private Pawn secondPawn;
	
	private String whiteColor = "white";
	private String blackColor = "black";
	
	
	public void setUp() {
		firstPawn = new Pawn(whiteColor);
		secondPawn = new Pawn(blackColor);
	}
	
	
	public void testCreate() throws Exception {
		String firstPawncolor = firstPawn.getColor();
		assertEquals(whiteColor, firstPawncolor);
		
		String secondPawnColor = secondPawn.getColor();
		assertEquals(blackColor, secondPawnColor);
	}
	
	public void testPawn() throws Exception {
		Pawn pawn = new Pawn();
		assertEquals("white", pawn.getColor());
	}
}
