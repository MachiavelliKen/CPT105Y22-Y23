package week6StringArray;

public class WarandPeace {
    public static void main(String[] args) {
    }



    public static boolean warAndPeaceSubString(String text) {
        boolean result;// declare a boolean variable for us to return.
        int warCounter = 0; // creat an integer variable with initialize value 0.
        // we are going to use this variable to count how many "war"s are
        int peaceCounter = 0;// similarly creat an integer variable with initialize value 0.
        // we are going to use this variable to count how many "peace"s are
        int length = text.length();// creat an integer variable to store the length of text.
        for (int i = 0; i < length - 2; i++) {
            if (text.substring(i, i + 3).equals("war")) {
                warCounter++;
            }
        }
        for (int i = 0; i < length - 4; i++) {
            if (i + 5 <= length && text.substring(i, i + 5).equals("peace")) {
                peaceCounter++;
            }
        }
        result = warCounter == peaceCounter;
        return result;
    }

    public static boolean warAndPeaceIndexOf(String text) {
        int indexWar = 0;
        int countWar = 0;
        while (indexWar != -1) {
            indexWar = text.indexOf("war", indexWar);
            if (indexWar != -1) {
                countWar++;
                indexWar += "war".length();
            }
        }
        int indexPeace = 0;
        int countPeace = 0;
        while (indexPeace != -1) {
            indexPeace = text.indexOf("peace", indexPeace);
            if (indexPeace != -1) {
                countPeace++;
                indexPeace += "peace".length();
            }
        }
        return countWar == countPeace;
    }


}
