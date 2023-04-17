public class Main {

    public static void main(String[] args) {
        Encounter encounter = new Encounter(5, 20);
        EncounterService encounterService = new EncounterService(encounter);
        System.out.println("Coordinates to work: " + encounterService.takeCoordinatesFromUser());
    }
}
