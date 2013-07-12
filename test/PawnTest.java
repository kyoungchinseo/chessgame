import junit.framework.TestCase;


public class PawnTest extends TestCase {
	public void testCreate() throws Exception {
		final String firstColor = "white";
		final String secondColor = "black";
		
		Pawn firstPawn = new Pawn(firstColor);
		String firstPawncolor = firstPawn.getColor();
		assertEquals(firstColor, firstPawncolor);
		
		Pawn secondPawn = new Pawn(secondColor);
		String secondPawnColor = secondPawn.getColor();
		assertEquals(secondColor, secondPawnColor);
	}
}
