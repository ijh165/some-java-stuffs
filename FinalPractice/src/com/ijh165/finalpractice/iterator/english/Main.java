package com.ijh165.finalpractice.iterator.english;

public class Main {
    public static void main(String[] args) {
        String[] englishWords = {"apple", "banana", "candle", "door", "entrance", "fragrance", "great", "holiday", "instant"};
        String[] givenWords = {"instant", "apple", "candle", "great"};
        CustomIterator it = new CustomIterator(englishWords, givenWords);
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}