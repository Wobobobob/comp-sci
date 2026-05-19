
import java.util.AbstractList;
import java.util.ArrayList;

public class AnagramList extends AbstractList{
    
    private Word[] wordList;
    public AnagramList(){
        this.wordList = null;
    }

    public void add(Word word){
        if (wordList == null){
            wordList = new Word[]{word};
        }else {
            Word[] newList = new Word[wordList.length + 1];
            for (int i = 0; i<wordList.length; i++){
                newList[i] = wordList[i];
            }
            newList[wordList.length] = word;
            wordList = newList;
        }
    }

    @Override
    public Word get(int index){
        return wordList[index];
    }

    @Override
    public int size(){
        return wordList == null ? 0 : wordList.length;
    }

    public boolean checkAnagram(Word word1, Word word2){
        String compare1= word1.getSortedWord();
        String compare2= word2.getSortedWord();
        return compare1.equals(compare2);
    }

    public ArrayList<Word> searchAnagrams(String key){
        ArrayList<Word> words = new ArrayList<Word>();
        Word word = new Word(key);
        for(Word word1 : this.wordList){
            if(this.checkAnagram(word1, word)){
                words.add(word1);
            }
        }
        return words;
    }

    
}
