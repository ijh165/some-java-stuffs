package com.ijh165.finalpractice.iterator.english;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CustomIterator implements Iterator<String>
{
    private int index;
    private List<String> englishWords;
    private List<String> givenWords;

    public CustomIterator(String[] englishWords, String[] givenWords) {
        index = 0;
        this.englishWords = Arrays.asList(englishWords);
        this.givenWords = Arrays.asList(givenWords);
    }

    @Override
    public boolean hasNext() {
        int tmpIndex = index;
        while(tmpIndex < englishWords.size() && givenWords.contains(englishWords.get(tmpIndex))) {
            tmpIndex++;
        }
        return tmpIndex < englishWords.size();
    }

    @Override
    public String next() {
        while(index < englishWords.size() && givenWords.contains(englishWords.get(index))) {
            index++;
        }
        return englishWords.get(index++);
    }
}