package chess;

import java.util.HashSet;

public class NightPiece extends ChessPiece {
	
	public NightPiece(){
		super(ChessPieceType.NIGHT, 0, 0, Color.WHITE);
	}
	
	public NightPiece(int x, int y, Color c){
		super(ChessPieceType.NIGHT,x,y,Color.WHITE);
	}

	@Override
	public HashSet<Move> possibleMoves() {
		// TODO Auto-generated method stub
		return null;
	}

}
