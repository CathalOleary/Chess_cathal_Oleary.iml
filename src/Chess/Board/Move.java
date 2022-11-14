package Chess.Board;

import Chess.Piece.Piece;

public abstract class Move {
    final Board board;
    final Piece MovedPiece;
    final int DestinationCord;

   private Move(final Board board, final Piece MovedPiece, final int DestinationCord){
        this.MovedPiece=MovedPiece;
        this.DestinationCord=DestinationCord;
        this.board=board;
    }

    public static final class MainMove extends Move{
        public MainMove(final Board board, final Piece MovedPiece, final int DestinationCord) {
            super(board, MovedPiece, DestinationCord);
        }
    }

    public static final class AttackMove extends Move{
        final Piece AttackedPiece;
       public AttackMove(final Board board, final Piece MovedPiece, final int DestinationCord, final Piece AttackedPiece, Piece attackedPiece) {
            super(board, MovedPiece, DestinationCord);
            this.AttackedPiece = attackedPiece;
        }
    }
}
