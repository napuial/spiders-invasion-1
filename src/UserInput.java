import java.util.Scanner;

public class UserInput {

    final private Encounter ENCOUNTER;
    private String cords;
    private UserInputArrangement userInputArrangement;

    public UserInput(Encounter encounter) {
        ENCOUNTER = encounter;
        cords = takeInput().toUpperCase();
        userInputArrangement = new UserInputArrangement(cords);
    }

    private String takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(TextsStorage.AWAITING_COORDINATES);
        return scanner.nextLine();
    }

    public String arrangementCords() {
        return userInputArrangement.arrangementCoordinates();
    }

    public String getCords() {
        return cords;
    }

    public void setCords(String cords) {
        this.cords = cords;
    }

    public Integer getIndexRow() {
        return Integer.parseInt("" + cords.charAt(0)) - 1;
    }

    public Integer getIndexColumn() {
        int intLetter = 65;
        for(int i = 0; i < ENCOUNTER.getBOARD_WIDTH(); i++) {
            if(intLetter == (int) cords.charAt(1)) {
                return i;
            }
            intLetter++;
        }
        return null;
    }

    public Encounter getENCOUNTER() {
        return ENCOUNTER;
    }
}
