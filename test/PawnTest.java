import junit.framework.TestCase;


public class PawnTest extends TestCase {
	public void testCreate() throws Exception {
		Pawn pawn = new Pawn("white");
		String color = pawn.getColor();
		assertEquals("white", color);
		
		Pawn secondPawn = new Pawn("black");
		String secondColor = secondPawn.getColor();
		assertEquals("black", secondColor);
	}
}
