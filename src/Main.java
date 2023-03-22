public class Main {

    public static void main(String[] args) {
        Encounter encounter = new Encounter(5, 20);
        EncounterService encounterService = new EncounterService(encounter);
        encounterService.prepareBoards();
        System.out.println("\nHIDDEN BOARD:");
        encounterService.showBoard(encounter.getHIDDEN_BOARD());
        System.out.println("\nVISIBLE BOARD:");
        encounterService.showBoard(encounter.getVISIBLE_BOARD());
    }
}
