package Chess.Piece;

/**
 * I learn about the Enum class from https://www.w3schools.com/java/java_enums.as amd from https://jenkov.com/tutorials/java/enums.html;
 */
public enum Alliance {
    White{
        public int getDirection(){
            return -1;
        }
    },
    Black{
        public int getDirection(){
            return 1;
        }
    };

    public abstract int getDirection();

}
