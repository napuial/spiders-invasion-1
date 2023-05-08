public class Main {
    public static void main(String[] args) {
        try {
            Animation.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Encounter encounter = new Encounter(5, 20);
        EncounterService encounterService = new EncounterService(encounter); 
        encounterService.prepareBoards();
        encounterService.fillBoardWithSpiders();
        while(encounter.getSpidersInGame().size() > 0) {
            encounterService.showBoard(encounter.getVISIBLE_BOARD());
            encounterService.takeCoordinates();
            if(encounterService.getUserInput().getCords().equals(TextsStorage.BREAKING_GAME)) {
                System.out.println(TextsStorage.generateForfeit());
                break;
            }
            encounterService.actionOnCell();
            System.out.println();
        }
        if(encounter.getSpidersInGame().size() == 0) {
            encounterService.showBoard(encounter.getVISIBLE_BOARD());
            System.out.println(TextsStorage.ELIMINATED_SPIDERS);
            System.out.println();
            System.out.println(TextsStorage.makeSpaces(10) + TextsStorage.COMPLETE_GAME);
        }
    }
}
