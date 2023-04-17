import java.util.Scanner;

public class UserInput {

    final private Encounter ENCOUNTER;
    private String cords;

    private UserInputArrangement userInputArrangement;

    public UserInput(Encounter encounter) {
        ENCOUNTER = encounter;
        cords = takeInput();
        userInputArrangement = new UserInputArrangement(cords);
    }

    private String takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Coordinates: ");
        return scanner.nextLine();
    }

    public String getCords() {
        return cords;
    }

    public String getArrangementCords() {
        return userInputArrangement.arrangementCoordinates().toUpperCase();
    }

    public Encounter getENCOUNTER() {
        return ENCOUNTER;
    }
}
