package pieces;
//import pieces.Pawn;
import junit.framework.TestCase;

import static pieces.COLOR.*;


public class PieceTest extends TestCase {
	
	public void testCreate() throws Exception {
		verifyCreation(Piece.createPawn(WHITE), Piece.createPawn(BLACK),
				Piece.Type.PAWN, Piece.PAWN_REPRESENTATION);

		verifyCreation(Piece.createKnight(WHITE),Piece.createKnight(BLACK),
				Piece.Type.KNIGHT,Piece.KNIGHT_REPRESENTATION);
		
		verifyCreation(Piece.createRook(WHITE),Piece.createRook(BLACK),
				Piece.Type.ROOK,Piece.ROOK_REPRESENTATION);
		
		verifyCreation(Piece.createBishop(WHITE),Piece.createBishop(BLACK),
				Piece.Type.BISHOP,Piece.BISHOP_REPRESENTATION);
		
		verifyCreation(Piece.createQueen(WHITE),Piece.createQueen(BLACK),
				Piece.Type.QUEEN,Piece.QUEEN_REPRESENTATION);
		
		verifyCreation(Piece.createKing(WHITE),Piece.createKing(BLACK),
				Piece.Type.KING,Piece.KING_REPRESENTATION);
		
		Piece blank = Piece.noPiece();
		assertEquals('.',blank.getRepresentation());
		assertEquals(Piece.Type.NO_PIECE, blank.getType());
	}
	
	private void verifyCreation(Piece whitePiece, Piece blackPiece, Piece.Type type, char representation) {
		assertTrue(whitePiece.isWhite());
		assertEquals(type, whitePiece.getType());
		assertEquals(representation, whitePiece.getRepresentation());
		assertTrue(blackPiece.isBlack());
		assertEquals(type, blackPiece.getType());
		assertEquals(Character.toUpperCase(representation), blackPiece.getRepresentation());
	}
	
	
}
