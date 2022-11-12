package Chess.Piece;

import Chess.Board.*;

import java.util.List;

/**
 * Created by Cathal OLeary
 */

public abstract class Piece {
    private final int PiecePosition;
    private final Alliance PieceAlliance;

    Piece(final int PiecePosition, final Alliance PieceAlliance){
        this.PiecePosition=PiecePosition;
        this.PieceAlliance=PieceAlliance;
    }

   public abstract List<Move> CalLegaMoves(final Board board);
}
