package chess;

public class Move {
	
	private String pieceToMove;
	private int fromX;
	private int fromY;
	private int toX;
	private int toY;
	
	public Move(String piece, int fromX, int fromY, int toX, int toY) {
		this.pieceToMove = piece;
		this.fromX = fromX;
		this.fromY = fromY;
		this.toX = toX;
		this.toY = toY;
	}
	
	public boolean equals(Move m){
		return this.toString().equals(m.toString());
	}
	
	public int hashCode(){
		return this.toString().hashCode();
	}
	
	public String toString(){
		char fcol = (char) ('a' + this.fromX);
		char tcol = (char) ('a' + this.toX);
		char p = pieceToMove.charAt(0);
		return String.format("%c%c%d-%c%c%d", p, fcol, this.fromY+1, p, tcol, this.toY+1);
	}

}
