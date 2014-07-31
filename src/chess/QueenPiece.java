package chess;

import java.util.HashSet;

public class QueenPiece extends ChessPiece {
	
	public QueenPiece(){
		super(ChessPieceType.QUEEN, 0, 0, Color.WHITE);
	}
	
	public QueenPiece(int x, int y, Color c){
		super(ChessPieceType.QUEEN,x,y,c);
	}

	@Override
	public HashSet<Move> possibleMoves() {
		// TODO Auto-generated method stub
		return null;
	}

}
