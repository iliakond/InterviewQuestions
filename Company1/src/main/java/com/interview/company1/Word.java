package com.interview.company1;

class Word{
    private final Long count;
    private final String text;

    public Word(long count, String text) {
        this.count = count;
        this.text = text;
    }

    public Long getCount() {
        return count;
    }

    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Word word = (Word) o;

        if (count != null ? !count.equals(word.count) : word.count != null) return false;
        return text != null ? text.equals(word.text) : word.text == null;
    }

    @Override
    public int hashCode() {
        int result = count != null ? count.hashCode() : 0;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Word{" +
                "count=" + count +
                ", text='" + text + '\'' +
                '}';
    }
}