package Chess.Piece;

import Chess.Board.*;

import java.util.*;

/**
 * Created by Cathal OLeary
 */

public abstract class Piece {
    public final int PiecePosition;
    private final Alliance PieceAlliance;

    Piece(final int PiecePosition, final Alliance PieceAlliance){
        this.PiecePosition=PiecePosition;
        this.PieceAlliance=PieceAlliance;
    }

    public Alliance getPieceAlliance(){
        return this.PieceAlliance;
    }

   public abstract Collection<Move> CalLegaMoves(final Board board);
}
