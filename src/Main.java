public class Main {

    public static void main(String[] args) {
        Encounter encounter = new Encounter(5, 20);
        EncounterService encounterService = new EncounterService(encounter);
        encounterService.prepareBoards();
        encounterService.fillBoardWithSpiders();
        while(encounter.getSpidersInGame().size() > 0) {
            encounterService.showBoard(encounter.getVISIBLE_BOARD());
            encounterService.takeCoordinates();
            encounterService.actionOnCell();
            System.out.println();
        }
        encounterService.showBoard(encounter.getVISIBLE_BOARD());
        System.out.println("ALL SPIDERS HAVE BEEN ELIMINATED");
    }
}
