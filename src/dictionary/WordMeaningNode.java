/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dictionary;

/**
 *
 * @author Zain
 */
public class WordMeaningNode {
    private WordMeaning word;
    WordMeaningNode next;


    public WordMeaningNode(String word, String meaning) {
        this.word.setWord(word);
        this.word.setMean(meaning);
    }

    public String getWord() {
        return word.getWord();
    }

    public void setWord(String word) {
        this.word.setWord(word);
    }

    public String getMeaning() {
        return word.getMean();
    }

    public void setMeaning(String meaning) {
        this.word.setMean(meaning);
    }

    public WordMeaningNode getNext() {
        return next;
    }

    public void setNext(WordMeaningNode next) {
        this.next = next;
    }
}


