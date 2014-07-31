package chess;

import chess.Piece.ChessPieceType;
import chess.Piece.Color;

public class PieceFactory {
	
	public Piece getPiece(ChessPieceType type, int x, int y, Color c) {
		switch (type) {
			case KING:
				return new KingPiece(x,y,c);
			case QUEEN:
				return new QueenPiece(x,y,c);
			case BISHOP:
				return new BishopPiece(x,y,c);
			case NIGHT:
				return new NightPiece(x,y,c);
			case PAWN:
				return new PawnPiece(x,y,c);
			case ROOK:
				return new RookPiece(x,y,c);
			default:
				return null;
		}
	}

}
