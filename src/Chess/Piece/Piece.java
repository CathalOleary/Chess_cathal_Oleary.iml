package Chess.Piece;

/**
 * Created by Cathal OLeary
 */

public class Piece {
    private final int PiecePosition;
    private final Alliance PieceAlliance;

    Piece(final int PiecePosition, final Alliance PieceAlliance){
        this.PiecePosition=PiecePosition;
        this.PieceAlliance=PieceAlliance;
    }
}
