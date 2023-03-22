public class EncounterService {

    final private Encounter ENCOUNTER;

    public EncounterService(Encounter encounter) {
        ENCOUNTER = encounter;
    }

    void prepareBoards() {
        for(int i = 0; i < ENCOUNTER.getBOARD_HEIGHT(); i++) {
            for(int j = 0; j < ENCOUNTER.getBOARD_WIDTH(); j++) {
                ENCOUNTER.getHIDDEN_BOARD()[i][j] = '~';
                ENCOUNTER.getVISIBLE_BOARD()[i][j] = '~';
            }
        }
    }

    void showBoard(Character[][] board) {
        String label = " ";
        for(int i = 65; i < 65 + ENCOUNTER.getBOARD_WIDTH(); i++) {
            label += " " + (char)i;
        }
        System.out.println(label);
        for(int i = 0; i < ENCOUNTER.getBOARD_HEIGHT(); i++) {
            System.out.print(i + 1 + " ");
            for(int j = 0; j < ENCOUNTER.getBOARD_WIDTH(); j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
