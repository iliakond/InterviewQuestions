package com.interview.company1;

import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ReadTextTest {

    private TextReader textReader;

    @Before
    public void init() throws Exception {
        textReader = new TextReader();
    }

    @Test
    public void when_blank_text_is_used_then_return_empty_list() throws Exception {
        String text = "";
        assertTrue(textReader.countWord(text).isEmpty());
    }

    @Test
    public void when_get_text_then_return_list_count_word_descent_order() throws Exception {
        List<Word> words = Arrays.asList(
                new Word(3, "ipsum"),
                new Word(2, "dolor"),
                new Word(1, "Lorem"));

        String text = "Lorem ipsum dolor dolor ipsum ipsum";

        List<Word> result = textReader.countWord(text);

        assertEquals(words.get(0), result.get(0));
        assertEquals(words.get(1), result.get(1));
        assertEquals(words.get(2), result.get(2));
    }


    @Test(expected = NullPointerException.class)
    public void when_get_null_then_throw_null_point_exception() throws Exception {
        textReader.countWord(null);
    }
}