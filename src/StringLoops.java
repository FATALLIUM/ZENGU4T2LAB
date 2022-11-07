public class StringLoops {

    // default constructor; no instance variables
    public StringLoops() { }

    public int countCharacters(String character, String searchString) {
        int count = 0;
        for (int i = 0; i < searchString.length(); i ++) {
            if (searchString.substring(i, i+1).equalsIgnoreCase(character)) {
                count++;
            }
        }
        return count;
    }

    public String reverseString(String origString) {
        String newString = "";
        for (int i = origString.length()-1; i >=0; i--) {
            newString += origString.charAt(i);
        }
        return newString;
    }

}
