public class Main {

    public static void main(String[] args) {
        Encounter encounter = new Encounter(5, 20);
        EncounterService encounterService = new EncounterService(encounter);
        encounterService.prepareBoards();
        encounterService.fillBoardWithSpiders();
        while(encounter.getSpidersInGame().size() > 0) {
            encounterService.showBoard(encounter.getHIDDEN_BOARD());
            encounterService.takeCoordinates();
            encounterService.actionOnCell();
        }
    }
}
