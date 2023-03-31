public class Main {

    public static void main(String[] args) {
        Encounter encounter = new Encounter(5, 20);
        EncounterService encounterService = new EncounterService(encounter);
        encounterService.prepareBoards();
        encounterService.fillBoardWithSpiders();
        encounterService.showBoard(encounter.getHIDDEN_BOARD());
    }
}
