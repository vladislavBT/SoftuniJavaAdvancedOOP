package DesignPatternsExercise.SingeltonPattern;

import DesignPatternsExercise.SingeltonPattern.Hashcode;

public class Main {
    public static void main(String[] args) {
        Hashcode hashcode = Hashcode.getInstance();
        System.out.println(hashcode.getInstance().getPoint());

    }
}
