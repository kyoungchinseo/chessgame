package chess;
import junit.framework.TestCase;

import pieces.Piece;

import static pieces.COLOR.*;
import static pieces.Piece.Type.*;

import util.StringUtil;

public class BoardTest extends TestCase {
	
	private Board board;
	
	protected void setUp() {
		board = new Board();
	}
	
	public void testCreate() throws Exception {
		// test generated number of pawns inside the board
		board.initialize();
		assertEquals(32,board.pieceCount());
		
		String blankRank = StringUtil.appendNewLine("........");
		
		assertEquals(
				StringUtil.appendNewLine("RNBQKBNR") +
				StringUtil.appendNewLine("PPPPPPPP") +
				blankRank + blankRank + blankRank + blankRank + 
				StringUtil.appendNewLine("pppppppp") +
				StringUtil.appendNewLine("rnbqkbnr"),
				board.print());
		
		board.displayBoard(); // display board
		
	}	
	
	public void testNumPieces() throws Exception {
		board.initialize();
		assertEquals(32,board.pieceCount());
		
		
		assertEquals(8, board.getNumOfPieces(WHITE,PAWN));
		assertEquals(2, board.getNumOfPieces(BLACK,ROOK));
		assertEquals(1, board.getNumOfPieces(WHITE,KING));
		
		Piece piece = board.getPiece("a8");
		assertEquals(ROOK, piece.getType());
		
		assertEquals(KING,board.getPiece("e1").getType());
		
	}
	
	public void testPosition() throws Exception {
		board.initializeWithEmpty();
		String blankRank = StringUtil.appendNewLine("........");
		assertEquals(
				blankRank + blankRank + blankRank + blankRank +
				blankRank + blankRank + blankRank + blankRank,
				board.print());
		board.displayBoard();
		
		board.addPiece("b6", Piece.createKing(BLACK));
		board.addPiece("b5", Piece.createRook(BLACK));
		board.addPiece("c4", Piece.createKing(WHITE));
		board.displayBoard();
		
	}
	
	public void testStatusValue() throws Exception {
		board.initializeWithEmpty();
		board.displayBoard();
		
		board.addPiece("a7", Piece.createPawn(BLACK));
		assertEquals(1.0, board.getStatusValue(BLACK));
		board.addPiece("c7", Piece.createPawn(BLACK));
		assertEquals(2.0, board.getStatusValue(BLACK));
		board.addPiece("b6", Piece.createPawn(BLACK));
		assertEquals(3.0, board.getStatusValue(BLACK));
		board.addPiece("c8", Piece.createRook(BLACK));
		assertEquals(8.0, board.getStatusValue(BLACK));
		board.addPiece("d7", Piece.createBishop(BLACK));
		assertEquals(11.0, board.getStatusValue(BLACK));
		board.addPiece("e6",Piece.createQueen(BLACK));
		assertEquals(20.0, board.getStatusValue(BLACK));
		board.addPiece("b8", Piece.createKing(BLACK));
		assertEquals(20.0, board.getStatusValue(BLACK));
		
		board.addPiece("e1", Piece.createRook(WHITE));
		assertEquals(5.0, board.getStatusValue(WHITE));
		board.addPiece("f1", Piece.createKing(WHITE));
		assertEquals(5.0, board.getStatusValue(WHITE));
		board.addPiece("f2", Piece.createPawn(WHITE));
		assertEquals(6.0, board.getStatusValue(WHITE));
		board.addPiece("g2", Piece.createPawn(WHITE));
		assertEquals(7.0, board.getStatusValue(WHITE));
		board.addPiece("f3", Piece.createPawn(WHITE));
		assertEquals(7.0, board.getStatusValue(WHITE));
		board.addPiece("h3", Piece.createPawn(WHITE));
		assertEquals(8.0, board.getStatusValue(WHITE));
		board.addPiece("f4", Piece.createKnight(WHITE));
		assertEquals(10.5, board.getStatusValue(WHITE));
		board.addPiece("g4", Piece.createQueen(WHITE));
		assertEquals(19.5, board.getStatusValue(WHITE));
		
		board.displayBoard();
		
		board.generatePieceList();
		assertEquals("qrnppppk", board.getPieceList(WHITE));
		assertEquals("QRBPPPK", board.getPieceList(BLACK));
		board.printPieceList(WHITE);
		board.printPieceList(BLACK);
		
		
	}
}
