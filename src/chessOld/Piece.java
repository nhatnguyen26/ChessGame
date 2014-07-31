package chessOld;

import java.util.LinkedList;

public interface Piece {
	
	
	public enum Color{
		WHITE,BLACK;
	}
	public void setPiece(int x, int y, Color c);
	public void setPosition(int x, int y);
	public int getX();
	public int getY();
	public void setColor(Color c);
	public Color getColor();
	public LinkedList<Move> possibleMoves();

}
