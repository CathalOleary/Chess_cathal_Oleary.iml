package Chess.Board;

import Chess.Piece.Piece;
import java.util.*;

/**
 * Created by Cathal OLeary
 * I Learned how to use abstract Classes from javatpoint.com/abstract-class-in-java and from Alex Lee Youtube
 */

public abstract class ChessTile {
   private final int TileCord;

   private static final Map<Integer, EmptyTile> EMPTY_T_MAP_CACHE = AllPossibleET();

   private static Map<Integer, EmptyTile> AllPossibleET(){
       final Map<Integer, EmptyTile> ETMap=new HashMap<>();
       int i;

       for(i=0;i<64;i++){
         ETMap.put(i, new EmptyTile(i));
       }

       return ETMap;
   }

   public static ChessTile CreateTile(final int TileCord, final Piece piece){
       return piece !=null ? new OccupiedTile(TileCord, piece) : EMPTY_T_MAP_CACHE.get(TileCord);
   }

    private ChessTile(int TileCord) {
        this.TileCord=TileCord;
    }

    public abstract boolean isTileOccupied();

    public abstract Piece getPiece();

    public static final class EmptyTile extends ChessTile{

        private EmptyTile(final int Coord){
            super(Coord);
        }

        public boolean isTileOccupied(){
            return false;
        }

        public Piece getPiece(){
            return null;
        }
    }

    public static final class OccupiedTile extends ChessTile{

       private final Piece PieceOnT;

       private OccupiedTile(int TileCord, Piece PieceOnTile){
            super(TileCord);
            this.PieceOnT=PieceOnTile;
        }

        public boolean isTileOccupied(){
            return true;
        }

        public Piece getPiece(){
            return this.PieceOnT;
        }
    }
}
