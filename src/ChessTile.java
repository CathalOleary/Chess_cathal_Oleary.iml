public abstract class ChessTile {

    int TileCord;

    ChessTile(int TileCord) {
        this.TileCord=TileCord;
    }

    public abstract boolean isTileOccupied();

    public abstract Piece getPiece();

    public static final class EmptyT extends ChessTile{

        EmptyT(int Coord){
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

        Piece PieceOnT;

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
