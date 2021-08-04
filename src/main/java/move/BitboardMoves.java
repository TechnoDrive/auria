package move;

// ok so what am i looking at here

public class BitboardMoves {
    public static int NORTH =  8;
    public static int SOUTH = -8;
    public static int EAST  =  1;
    public static int WEST  = -1;

    public static int NORTH_EAST = NORTH + EAST;
    public static int NORTH_WEST = NORTH + WEST;
    public static int SOUTH_EAST = SOUTH + EAST;
    public static int SOUTH_WEST = SOUTH + WEST;

    public static final int[] KING_STEPS = new int[] { NORTH, NORTH_EAST, NORTH_WEST, SOUTH, SOUTH_EAST, SOUTH_WEST, EAST, WEST };
    public static final int[] QUEEN_STEPS = KING_STEPS;
    public static final int[] ROOK_STEPS = new int[] { NORTH, SOUTH, EAST, WEST };
    public static final int[] BISHOP_STEPS = new int[] { NORTH_EAST, NORTH_WEST, SOUTH_EAST, SOUTH_WEST };
    public static final int[] KNIGHT_STEPS = new int[] { SOUTH * 2 + WEST, SOUTH * 2 + EAST, NORTH * 2 + WEST, NORTH * 2 + EAST, EAST * 2 + NORTH, EAST * 2 + SOUTH, WEST * 2 + NORTH, WEST * 2 + SOUTH };

    public void generatePawnMoves() {

    }

    public void generateKnightMoves() {

    }

    public void generateBishopMoves() {

    }

    public void generateRookMoves() {

    }

    public void generateQueenMoves() {

    }

    public void generateKingMoves() {

    }
}
