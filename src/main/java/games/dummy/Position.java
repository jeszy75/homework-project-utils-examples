package games.dummy;

/**
 * Represents the coordinates of a square of a two-dimensional game board.
 *
 * @param row the row coordinate
 * @param col the column coordinate
 */
public record Position(int row, int col) {

    @Override
    public String toString() {
        return String.format("(%d,%d)", row, col);
    }

}
