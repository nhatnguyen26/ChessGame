package chessOld;

import static org.junit.Assert.*;

import org.junit.Test;

import chessOld.Piece.Color;

public class ChessPieceTest {

	@Test
	public void testSetPosition() {
		//fail("Not yet implemented");
		ChessPiece king = ChessPiece.KING;
		king.setPiece(0, 8, Color.WHITE);
		assertEquals("not correct x position",0,king.getX());
		assertEquals("not correct y position",8,king.getY());
		
		for(ChessPiece p : ChessPiece.values()){
			System.out.print(p);
			System.out.println(p.getMaxRange());
		}
		
		ChessPiece king1 = ChessPiece.KING;
		ChessPiece king2;
		(king2 = ChessPiece.KING).setColor(Color.BLACK);
		System.out.print(king1 == king2);
	}

}
