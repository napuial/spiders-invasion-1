public class UserInputValidation {

    final private UserInput USER_INPUT;

    final private Integer EXPECTED_CORDS_LENGTH = 2;

    public UserInputValidation(UserInput userInput) {
        USER_INPUT = userInput;
    }

    public boolean validate() {
        if (!checkCordsLength()) {
            return false;
        }
        int numberIndex = giveIndexContainsNumber();
        if (numberIndex == 2) return false;
        int letterIndex = numberIndex == 0 ? 1 : 0;
        if (!checkIfNumberIsInScope(numberIndex, USER_INPUT.getENCOUNTER().getBOARD_HEIGHT())) {
            return false;
        }
        if (!checkIfLetterIsInScope(letterIndex, USER_INPUT.getENCOUNTER().getBOARD_WIDTH())) {
            return false;
        }
        return true;
    }

    private boolean checkCordsLength() {
        return USER_INPUT.getCords().length() == EXPECTED_CORDS_LENGTH;
    }

    private Integer giveIndexContainsNumber() {
        try {
            Integer.parseInt("" + USER_INPUT.getCords().charAt(0));
            return 0;
        } catch (Exception e) {
            try {
                Integer.parseInt("" + USER_INPUT.getCords().charAt(1));
                return 1;
            } catch (Exception ee) {
                return 2;
            }
        }
    }

    private boolean checkIfNumberIsInScope(Integer numberIndex, Integer boardHeight) {
        for(int i = 1; i <= boardHeight; i++) {
            if (Integer.parseInt("" + USER_INPUT.getCords().charAt(numberIndex)) == i) {
                return true;
            }
        }
        return false;
    }

   private boolean checkIfLetterIsInScope(Integer letterIndex, Integer boardWidth) {
        for(int i = 65; i <= 65 + boardWidth; i++) {
            if (USER_INPUT.getCords().toUpperCase().charAt(letterIndex) == (char) i) {
                return true;
            }
        }
        return false;
    }
}
