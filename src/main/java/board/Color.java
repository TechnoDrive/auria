package board;

public enum Color {
    WHITE(0b001),
    BLACK(0b010);

    public final int value;

    Color(int value) {
        this.value = value;
    }
}
