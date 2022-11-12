package Chess.Board;

import Chess.Piece.Piece;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Cathal OLeary
 */

public abstract class ChessTile {

   private final int TileCord;

   private static Map<Integer, EmptyT> AllPossibleET(){
       final Map<Integer, EmptyT> ETMap=new HashMap<>();
       int i;

       for(i=0;i<64;i++){
         ETMap.put(i, new EmptyT(i));
       }

       return null;
   }

    ChessTile(int TileCord) {
        this.TileCord=TileCord;
    }

    public abstract boolean isTileOccupied();

    public abstract Piece getPiece();

    public static final class EmptyT extends ChessTile{

        EmptyT(final int Coord){
            super(Coord);
        }

        public boolean isTileOccupied(){
            return false;
        }

        public Piece getPiece(){
            return null;
        }
    }

    public static final class OccupiedT extends ChessTile{

       private final Piece PieceOnT;

        OccupiedT(int TileCord, Piece PieceOnT){
            super(TileCord);
            this.PieceOnT=PieceOnT;
        }

        public boolean isTileOccupied(){
            return true;
        }

        public Piece getPiece(){
            return this.PieceOnT;
        }
    }
}
