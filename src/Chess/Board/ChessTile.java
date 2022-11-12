package Chess.Board;

import Chess.Piece.Piece;
import java.util.*;

/**
 * Created by Cathal OLeary
 * I Learned how to use abstract Classes from javatpoint.com/abstract-class-in-java
 */

public abstract class ChessTile {
   private final int TileCord;

   private static final Map<Integer, EmptyT> EMPTY_T_MAP_CACHE = AllPossibleET();

   private static Map<Integer, EmptyT> AllPossibleET(){
       final Map<Integer, EmptyT> ETMap=new HashMap<>();
       int i;

       for(i=0;i<64;i++){
         ETMap.put(i, new EmptyT(i));
       }

       return ETMap;
   }

   public static ChessTile CreateT(final int TileCord, final Piece piece){
       return piece !=null ? new OccupiedT(TileCord, piece) : EMPTY_T_MAP_CACHE.get(TileCord);
   }

    private ChessTile(int TileCord) {
        this.TileCord=TileCord;
    }

    public abstract boolean isTileOccupied();

    public abstract Piece getPiece();

    public static final class EmptyT extends ChessTile{

        private EmptyT(final int Coord){
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

       private OccupiedT(int TileCord, Piece PieceOnT){
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
