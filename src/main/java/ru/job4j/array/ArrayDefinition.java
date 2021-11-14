package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        Object o = System.lineSeparator();
        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Stas Korobeinikov";
        names[2] = "Elena Kartashova";
        names[3] = "Arcady Parfenov";
        System.out.print(names[0] + o + names[1] + o + names[2] + o + names[3]);
    }
}
