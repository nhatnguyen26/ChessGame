package chess;

import java.util.HashSet;

public class KingPiece extends ChessPiece {

	public KingPiece(){
		super(ChessPieceType.KING, 0, 0, Color.WHITE);
	}
	
	public KingPiece(int x, int y, Color c){
		super(ChessPieceType.KING,x,y,Color.WHITE);
	}
	
	@Override
	public HashSet<Move> possibleMoves() {
		// TODO Auto-generated method stub
		return null;
	}

}
