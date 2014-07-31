package chess;

import java.util.HashSet;

public abstract class ChessPiece implements Piece {
	
	private ChessPieceType type;
	private int x;
	private int y;
	private Color c;
	
	public ChessPiece(ChessPieceType piece, int x, int y, Color c) {
		this.type = piece;
		this.x = x;
		this.y = y;
		this.c = c;
	}
	
	@Override
	public void setPosition(int x, int y) {
		// TODO Auto-generated method stub
		this.x = x;
		this.y = y;

	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return this.x;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return this.y;
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return this.c;
	}
	
	public ChessPieceType getType() {
		return this.type;
	}
	
	public abstract HashSet<Move> possibleMoves();

}
