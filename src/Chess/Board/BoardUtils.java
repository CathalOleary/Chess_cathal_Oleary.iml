package Chess.Board;

/**
 * Created by Cathal OLeary
 */

public class BoardUtils {
    public static final boolean[] FirstColum=initColum(0);
    public static final boolean[] SecondColum=initColum(1);
    public static final boolean[] SeventhColum=initColum(6);
    public static final boolean[] EighthColum=initColum(7);
    public static final int NumTiles=64;
    public static final int NumTilesPerRow=8;

    private static boolean[] initColum(int ColumNumber) {
        final boolean[] Colum=new boolean[NumTiles];

        do {
            Colum[ColumNumber]=true;
            ColumNumber +=NumTilesPerRow;
        }while (ColumNumber<NumTiles);

        return Colum;
    }

    private BoardUtils(){
        throw new RuntimeException("You cannot Use Me!");
    }

    public static boolean isValidCord(int Coordinate){
        return Coordinate>=0 && Coordinate<NumTiles;
    }
}
