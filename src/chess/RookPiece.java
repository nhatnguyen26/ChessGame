package chess;

import java.util.HashSet;

public class RookPiece extends ChessPiece {
	
	public RookPiece(){
		super(ChessPieceType.ROOK, 0, 0, Color.WHITE);
	}
	
	public RookPiece(int x, int y, Color c){
		super(ChessPieceType.ROOK,x,y,c);
	}

	@Override
	public HashSet<Move> possibleMoves() {
		// TODO Auto-generated method stub
		return null;
	}

}
