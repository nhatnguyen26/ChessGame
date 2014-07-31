package chess;

import java.util.HashSet;

public class PawnPiece extends ChessPiece {
	
	public PawnPiece(){
		super(ChessPieceType.PAWN, 0, 0, Color.WHITE);
	}
	
	public PawnPiece(int x, int y, Color c){
		super(ChessPieceType.PAWN,x,y,Color.WHITE);
	}

	@Override
	public HashSet<Move> possibleMoves() {
		// TODO Auto-generated method stub
		return null;
	}

}
