package board;

public class Piece {
    private final PieceType type;
    private final int color;

    private static final int typeMask = 0b00111;
    private static final int blackMask = 0b10000;
    private static final int whiteMask = 0b01000;
    private static final int colorMask = whiteMask | blackMask;

    public Piece(int color, PieceType type) {
        // 00 000
        // ^  ^
        // |  Type bits
        // Color bits

        this.color = color;
        this.type = type;
    }

    public int self() {
        switch (color)  {
            case 0:
                return whiteMask + type.value;
            default:
                return blackMask + type.value;
        }
    }
}