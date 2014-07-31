package chessOld;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoveTest {

	@Test
	public void testToString() {
		Move move = new Move(ChessPiece.ROOK.toString(),0,0,0,7);
		System.out.println(move);
		assertEquals("not correct format",move.toString(),"Ra1-Ra8");
	}
	
	@Test
	public void testEqualMove() {
		Move move1 = new Move(ChessPiece.ROOK.toString(),0,0,0,7);
		Move move2 = new Move(ChessPiece.ROOK.toString(),0,0,0,7);
		System.out.println(move1.equals(move2));
	}

}
