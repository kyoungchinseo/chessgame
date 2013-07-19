package chess;

import junit.framework.TestCase;

public class CharacterTest extends TestCase {
	public void testWhitespace() throws Exception {
		assertEquals(true, Character.isWhitespace('\t'));
		assertEquals(true, Character.isWhitespace('\n'));
		assertEquals(true, Character.isWhitespace(' '));
	}
	
	public void testIdentifier() throws Exception {
		assertEquals(false, Character.isJavaIdentifierPart('^'));
		assertEquals(false, Character.isJavaIdentifierPart(' '));
		assertEquals(true, Character.isJavaIdentifierPart('a'));
		
		assertEquals(true, Character.isJavaIdentifierStart('a'));
		assertEquals(false, Character.isJavaIdentifierStart('1'));
	}
}

