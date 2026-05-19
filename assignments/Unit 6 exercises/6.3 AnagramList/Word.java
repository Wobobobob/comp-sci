public class Word {


    private String originalWord;
    private String sortedWord;

    public Word(String originalWord){
        this.originalWord = originalWord;
        this.sortedWord = sortWord(originalWord);
    }
    /**
     * @return the originalWord
     */
    public String getOriginalWord() {
        return originalWord;
    }

    /**
     * @param originalWord the originalWord to set
     */
    public void setOriginalWord(String originalWord) {
        this.originalWord = originalWord;
    }

    /**
     * @return the sortedWord
     */
    public String getSortedWord() {
        return sortedWord;
    }

    /**
     * @param sortedWord the sortedWord to set
     */
    public void setSortedWord(String sortedWord) {
        this.sortedWord = sortedWord;
    }

    public String sortWord(String word) {
        word = word.toLowerCase();
        char[] letters = word.toCharArray();
        for (int j = letters.length; j > 1; j--) {
            for (int i = letters.length - 1; i > 0; i--) {

                if (letters[i] < letters[i - 1]) {
                    char storedChar = letters[i - 1];
                    letters[i - 1] = letters[i];
                    letters[i] = storedChar;
                    
                }
            }
        }
        return new String(letters);
    }
}