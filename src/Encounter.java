public class Encounter {

    final private Integer BOARD_HEIGHT;
    final private Integer BOARD_WIDTH;
    final private Character[][] HIDDEN_BOARD;
    final private Character[][] VISIBLE_BOARD;

    public Encounter(Integer boardHeight, Integer boardWidth) {
        BOARD_HEIGHT = boardHeight;
        BOARD_WIDTH = boardWidth;
        HIDDEN_BOARD = new Character[boardHeight][boardWidth];
        VISIBLE_BOARD = new Character[boardHeight][boardWidth];
    }

    public Integer getBOARD_HEIGHT() {
        return BOARD_HEIGHT;
    }

    public Integer getBOARD_WIDTH() {
        return BOARD_WIDTH;
    }

    public Character[][] getHIDDEN_BOARD() {
        return HIDDEN_BOARD;
    }

    public Character[][] getVISIBLE_BOARD() {
        return VISIBLE_BOARD;
    }
}
