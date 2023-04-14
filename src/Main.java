 public class Main {

    public static void main(String[] args) {
        Encounter encounter = new Encounter(5, 20);
        UserInput userInput = new UserInput(encounter);
        UserInputValidation userInputValidation = new UserInputValidation(userInput);
        System.out.println("Validation result: " + userInputValidation.validate());
    }
}
