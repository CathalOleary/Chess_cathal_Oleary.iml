package Chess.Piece;

import Chess.Board.*;
import Chess.Piece.*;
import java.util.*;

/**
 * Created by Cathal OLeary
 */

public class Pawn extends Piece {
    private final int[] MoveCord={8};

    public Pawn(int piecePosition, Alliance pieceAl){
        super(piecePosition, pieceAl);
    }

    public Collection<Move> CalLegaMoves(Board board){
        final List<Move> LegalMoves=new ArrayList<>();

        for (final int CandidateOffset : MoveCord){
            int CandidateDestinationCord=this.PiecePosition+(this.getPieceAlliance().getDirection()*CandidateOffset);

            if (!BoardUtils.isValidCord(CandidateDestinationCord)){
               continue;
            }

            if (CandidateOffset==8 && !board.getChessTile(CandidateDestinationCord).isTileOccupied()){

            }

        }

        return LegalMoves;
    }
}
