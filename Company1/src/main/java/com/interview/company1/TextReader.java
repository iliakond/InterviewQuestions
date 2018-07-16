package com.interview.company1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class TextReader {
    public List<Word> countWord(String text){

        Map<String, Long> collect = Arrays.stream(text.split(" ")).filter(m -> !m.isEmpty()).collect(groupingBy(Function.identity(), counting()));

        List<Word> words = new ArrayList<>();

        for (Map.Entry<String, Long> entry: collect.entrySet()){
            Word word = new Word(entry.getValue(), entry.getKey());
            words.add(word);
        }

        Collections.sort(words, (o1, o2) -> o2.getCount().compareTo(o1.getCount()));

        return words;
    }
}


