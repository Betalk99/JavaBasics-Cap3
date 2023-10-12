public class extractor {

    private static String input;
    private static int index;

    public extractor(String input, int index) {
        this.input = input;
        this.index = index;
    }

    public static String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public static int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    public static String getUnicodeCharacter() {
        if (getIndex() >= 0 && getIndex() < getInput().length()) {
            char character = getInput().charAt(getIndex());
            System.out.println(character);
            return "Il carattere in Unicode all'indice " + getIndex() + " è: " + charToUnicode(character);
        } else {
            return "Errore: l'indice specificato è fuori dal range della stringa.";
        }

    }
    private static String charToUnicode(char character) {
        StringBuilder unicodeStringBuilder = new StringBuilder();
        unicodeStringBuilder.append("U+").append(String.format("%04X", (int) character));  //"%04X" significa stampare 4 cifre esadecimale
        return unicodeStringBuilder.toString();
    }

}
