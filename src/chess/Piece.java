package chess;

import java.util.HashSet;


public interface Piece {
	
	public enum Color{WHITE,BLACK;}
	public enum ChessPieceType{KING,QUEEN,ROOK,NIGHT,BISHOP,PAWN;}
	
	public void setPosition(int x, int y);
	public int getX();
	public int getY();
	public Color getColor();
	public HashSet<Move> possibleMoves();
	public ChessPieceType getType();

}
