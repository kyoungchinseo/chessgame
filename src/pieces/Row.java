package pieces;

import java.util.ArrayList;

import pieces.Piece;
import pieces.Piece.Type;
import static pieces.COLOR.*;
import static pieces.Piece.Type.*;

import static chess.Board.FRONT_LINE;
import static chess.Board.BACK_LINE;

public class Row {
	private ArrayList<Piece> rowPieces = new ArrayList<Piece>(); 
	
	private int numOfPawns = 0;
	
	public Row(COLOR color, int lineChoice) {
		
		Type [] type_list = {ROOK,KNIGHT,BISHOP,QUEEN,KING,BISHOP,KNIGHT,ROOK};
		
		if (color == EMPTY) {
			for(int i=0;i<8;i++) {
				Piece piece = Piece.create(color,NOPIECE);
				rowPieces.add(piece);
			}
		} else if (color == WHITE){			
			for(int i=0;i<8;i++) {
				Piece piece = null;
				if (lineChoice == BACK_LINE) {
					piece = Piece.create(WHITE, type_list[i]);
				} else if (lineChoice == FRONT_LINE) {
					piece = Piece.create(WHITE, PAWN);
				}
				rowPieces.add(piece);
				numOfPawns++;
			}
		} else {
			for(int i=0;i<8;i++) {
				Piece piece = null;
				if (lineChoice == BACK_LINE) {
					piece = Piece.create(BLACK, type_list[i]);
				} else if (lineChoice == FRONT_LINE) {
					piece = Piece.create(BLACK, PAWN);
				}
				rowPieces.add(piece);
				numOfPawns++;
			}
		}
	}
	
	public String getRow() {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<rowPieces.size();i++) {
			sb.append(rowPieces.get(i).getLabel());
		}
		return sb.toString();
	}
	
	public int getNumOfPawns() {
		return numOfPawns;
	}

}
