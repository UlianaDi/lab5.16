package com.company;

public class Third {
    public static void main(String[] args) {
        int i = (int) (Math.random() * 101);
        System.out.println("Число-" + i);
        String string = Integer.toString(i);
        System.out.println("Кількість цифр у числі: " + string.length());
    }
}
