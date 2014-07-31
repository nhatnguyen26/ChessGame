package chess;

import java.util.HashSet;

public class BishopPiece extends ChessPiece {
	
	public BishopPiece(){
		super(ChessPieceType.BISHOP, 0, 0, Color.WHITE);
	}
	
	public BishopPiece(int x, int y, Color c){
		super(ChessPieceType.BISHOP,x,y,Color.WHITE);
	}

	@Override
	public HashSet<Move> possibleMoves() {
		// TODO Auto-generated method stub
		return null;
	}

}
