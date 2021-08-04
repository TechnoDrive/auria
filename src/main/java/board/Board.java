package board;

public class Board {
    public Board(String fen) {
        String[] parts = fen.split(" ");
        String content = parts[0];
    }

    public static void main(String[] args) {
        Piece BLACK_BISHOP = new Piece(1, PieceType.BISHOP);
        System.out.println("0b" + Integer.toBinaryString(BLACK_BISHOP.self()));
    }
}