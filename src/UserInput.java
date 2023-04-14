import java.util.Scanner;

public class UserInput {

    final private Encounter ENCOUNTER;
    private String cords;

    public UserInput(Encounter encounter) {
        ENCOUNTER = encounter;
        this.cords = takeInput();
    }

    private String takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coordinates: ");
        return scanner.nextLine();
    }

    public String getCords() {
        return cords;
    }

    public Encounter getENCOUNTER() {
        return ENCOUNTER;
    }
}
