package chess;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import chess.Piece.ChessPieceType;
import chess.Piece.Color;

public class PieceFactoryTest {

	@Test
	public void testGetPiece() {
		PieceFactory pf = new PieceFactory();
		for (ChessPieceType p : ChessPieceType.values()) {
			Piece piece = pf.getPiece(p, 0, 0, Color.WHITE);
			assertEquals("not correct type", piece.getType(),p);
		}
		
		Piece p = pf.getPiece(ChessPieceType.KING, 0, 0, Color.WHITE);
		assertTrue("not correct instance",p instanceof chess.KingPiece);
	}

}
