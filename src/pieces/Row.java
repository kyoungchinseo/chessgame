package pieces;

import java.util.ArrayList;

import pieces.Piece;

import static pieces.COLOR.*;
import static pieces.Piece.Type.*;


import static pieces.Piece.COLOR_BLACK;
import static pieces.Piece.COLOR_WHITE;
import static pieces.Piece.COLOR_EMPTY;
import static pieces.Piece.NAME_EMPTY;
import static pieces.Piece.NAME_BISHOP;
import static pieces.Piece.NAME_KING;
import static pieces.Piece.NAME_KNIGHT;
import static pieces.Piece.NAME_PAWN;
import static pieces.Piece.NAME_QUEEN;
import static pieces.Piece.NAME_ROOK;

import static chess.Board.FRONT_LINE;
import static chess.Board.BACK_LINE;

public class Row {
	private ArrayList<Piece> rowPieces = new ArrayList<Piece>(); 
	
	private int numOfPawns = 0;
	
	public Row(COLOR color, int lineChoice) {
		
		String [] piece_list = {NAME_ROOK,NAME_KNIGHT,NAME_BISHOP,NAME_QUEEN,
							 	NAME_KING,NAME_BISHOP,NAME_KNIGHT,NAME_ROOK};
		
		
		if (color == EMPTY) {
			for(int i=0;i<8;i++) {
				Piece piece = Piece.create(color,NOPIECE.getName());
				rowPieces.add(piece);
			}
		} else if (color == WHITE){			
			for(int i=0;i<8;i++) {
				Piece piece = null;
				if (lineChoice == BACK_LINE) {
					piece = Piece.create(WHITE, piece_list[i]);
				} else if (lineChoice == FRONT_LINE) {
					piece = Piece.create(WHITE, PAWN.getName());
				}
				rowPieces.add(piece);
				numOfPawns++;
			}
		} else {
			for(int i=0;i<8;i++) {
				Piece piece = null;
				if (lineChoice == BACK_LINE) {
					piece = Piece.create(BLACK, piece_list[i]);
				} else if (lineChoice == FRONT_LINE) {
					piece = Piece.create(BLACK, PAWN.getName());
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
