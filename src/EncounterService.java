public class EncounterService {

    final private Encounter ENCOUNTER;

    private UserInput userInput;

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

    void fillBoardWithSpiders() {
        for(SpidersCatalog spider : SpidersCatalog.values()) {
            putSpidersPopulation(spider);
        }
    }

    void putSpidersPopulation(SpidersCatalog spider) {
        int population = spider.getPOPULATION();
        while(population > 0) {
            putOneSpider(spider);
            population--;
        }
    }

    void putOneSpider(SpidersCatalog spider) {
        int randomRow = RandomizationUtility.randomRow(ENCOUNTER.getBOARD_HEIGHT());
        if(checkIfLineIsEmpty(randomRow)) {
            int randomIndex = RandomizationUtility.randomIndex(spider, ENCOUNTER.getBOARD_WIDTH());
            int skinIndex = 0;
            for(int j = randomIndex; j < randomIndex + spider.getSKIN_PATTERN().length(); j++) {
                ENCOUNTER.getHIDDEN_BOARD()[randomRow][j] = spider.getSKIN_PATTERN().charAt(skinIndex);
                skinIndex++;
            }
            ENCOUNTER.getSpidersInGame().add(new Spider(randomRow, spider));
        } else {
            putOneSpider(spider);
        }
    }

    boolean checkIfLineIsEmpty(Integer rowNumber) {
        for(int j = 0; j < ENCOUNTER.getBOARD_WIDTH(); j++) {
            if(ENCOUNTER.getHIDDEN_BOARD()[rowNumber][j] != '~') {
                return false;
            }
        }
        return true;
    }

    void takeCoordinates() {
        UserInputValidation userInputValidation;
        boolean validationStatus;
        do {
            userInput = new UserInput(ENCOUNTER);
            userInputValidation = new UserInputValidation(userInput);
            validationStatus = userInputValidation.validate();
        } while(validationStatus != true);
        userInput.setCords(userInput.arrangementCords());
    }

    void actionOnCell() {
       switch(ENCOUNTER.getHIDDEN_BOARD()[userInput.getIndexRow()][userInput.getIndexColumn()]) {
           case '~':
               System.out.println("empty");
               ENCOUNTER.getHIDDEN_BOARD()[userInput.getIndexRow()][userInput.getIndexColumn()] = 'X';
               break;
           case 'X':
               System.out.println("repeat");
               break;
           default:
               ENCOUNTER.getHIDDEN_BOARD()[userInput.getIndexRow()][userInput.getIndexColumn()] = 'X';
               for(Spider spider : ENCOUNTER.getSpidersInGame()) {
                   if (spider.getID() == userInput.getIndexRow()) {
                       spider.setHEALTH(spider.getHEALTH() - 1);
                       if (spider.getHEALTH() == 0) {
                           ENCOUNTER.getSpidersInGame().remove(spider);
                           System.out.println("the spider has been eliminated");
                           return;
                       }
                   }
               }
               System.out.println("hit");
       }
    }
}
