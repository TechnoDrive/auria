package board;

public enum PieceType {
    PAWN(0b001),
    KNIGHT(0b010),
    BISHOP(0b011),
    ROOK(0b100),
    QUEEN(0b101),
    KING(0b110);

    public final int value;

    PieceType(int value) {
        this.value = value;
    }
}
// PieceType(BISHOP);
// type.value == PieceType.BISHOP.value
