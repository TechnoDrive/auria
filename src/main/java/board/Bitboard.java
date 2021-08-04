package board;

import java.util.HashMap;

public class Bitboard {
    // * The MSB is H8
    public HashMap<Square, Integer> squareMap = new HashMap<>();
    public long bits;

    public Bitboard() {
        this.bits = 0b00000000_00000000_00000000_00000000_00000000_00000000_00000000_00000000L;
    }

    public Bitboard(long bits) {
        this.bits = bits;
    }

    public int get(Square square) {
        int index = square.ordinal();
        return (int) ((bits >> index) & 1L);
    }

    public void set(Square square) {
        int index = square.ordinal();
        bits ^= (1L << index);
    }

    public void sync() {
        for (Square square : Square.values()) {
            squareMap.remove(square);
            squareMap.put(square, get(square));
        }
    }
}