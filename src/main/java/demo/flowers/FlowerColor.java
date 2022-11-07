package demo.flowers;

public enum FlowerColor {
    RED,
    BLUE,
    WHITE;

    @Override
    public String toString() {
        return switch (this) {
            case RED -> "#FF0000";
            case BLUE -> "#0000FF";
            case WHITE -> "FFFFFF";
        };
    }
}
