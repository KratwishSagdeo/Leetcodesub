class Solution {
    public boolean isValid(String word) {
        char[] ch = word.toCharArray();

        // Check if the length is at least 3 characters
        if (ch.length < 3) {
            return false;
        }
        
        boolean hasVowel = false;
        boolean hasConsonant = false;

        // Iterate through each character
        for (int i = 0; i < ch.length; i++) {
            char currentChar = ch[i];
            
            // Check if the character is a valid letter or digit
            if (Character.isLetter(currentChar)) {
                // Check if the character is a vowel
                if (isVowel(currentChar)) {
                    hasVowel = true;
                } else {
                    // It's a consonant if it's not a vowel
                    hasConsonant = true;
                }
            } else if (!Character.isDigit(currentChar)) {
                // If the character is not a letter or digit, return false
                return false;
            }
        }

        // The word is valid if it has at least one vowel and one consonant
        return hasVowel && hasConsonant;
    }

    // Helper method to check if a character is a vowel
    private boolean isVowel(char ch) {
        // Check for both lowercase and uppercase vowels
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}
