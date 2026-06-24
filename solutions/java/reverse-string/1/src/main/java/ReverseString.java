class ReverseString {

    String reverse(String inputString) {
        String reversedString = "";

        // inputString = "robot"
        // Start: 5
        // Stop: 0
        for (int i=inputString.length()-1; i>=0; i--) {
            reversedString += inputString.charAt(i);
        }
        return reversedString;
    }
  
}
