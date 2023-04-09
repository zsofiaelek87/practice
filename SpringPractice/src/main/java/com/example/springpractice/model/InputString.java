package com.example.springpractice.model;

import java.util.Objects;

public class InputString {
    private String inputString;

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InputString textStore = (InputString) o;
        return Objects.equals(inputString, textStore.inputString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputString);
    }

    @Override
    public String toString() {
        return "TextStore{" +
                "inputString='" + inputString + '\'' +
                '}';
    }
}
