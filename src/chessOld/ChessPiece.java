package chessOld;

import java.util.HashSet;
import java.util.LinkedList;

public enum ChessPiece implements Piece {
	KING(1){
		
		@Override
		public LinkedList<Move> possibleMoves() {
			// TODO Auto-generated method stub
			return null;
		}
		
	},
	
	QUEEN(8) {

		@Override
		public LinkedList<Move> possibleMoves() {
			// TODO Auto-generated method stub
			return null;
		}
		
	},
	
	ROOK(8) {

		@Override
		public LinkedList<Move> possibleMoves() {
			// TODO Auto-generated method stub
			return null;
		}
		
	},
	
	NIGHT(){

		@Override
		public LinkedList<Move> possibleMoves() {
			// TODO Auto-generated method stub
			return null;
		}
		
	},
	
	BISHOP(8){

		@Override
		public LinkedList<Move> possibleMoves() {
			// TODO Auto-generated method stub
			return null;
		}
		
	},
	
	PAWN(1){

		@Override
		public LinkedList<Move> possibleMoves() {
			// TODO Auto-generated method stub
			return null;
		}
		
	};
	
	private int maxRange;
	private int x;
	private int y;
	private Color c;
	
	private ChessPiece(int range) {
		this();
		this.maxRange = range;
	}
	
	private ChessPiece() {
		this.x = 0;
		this.y = 0;
		this.c = Color.WHITE;
	}
	
	private ChessPiece(int x, int y) {
		this.x = x;
		this.y = y;
		this.c = Color.WHITE;
	}
	
	@Override
	public void setPiece(int x, int y, Color c){
		this.setPosition(x, y);
		this.setColor(c);
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
	public void setColor(Color c) {
		this.c = c;
	}

	@Override
	public Color getColor() {
		return this.c;
	}
	
	public int getMaxRange() {
		return this.maxRange;
	}
	
	
	private HashSet<Move> straightLine(ChessPiece p){
		HashSet<Move> moves = new HashSet<Move>();
		return moves;
	}
	
	private HashSet<Move> diagonalLine(ChessPiece p){
		HashSet<Move> moves = new HashSet<Move>();
		return moves;
	}

}
