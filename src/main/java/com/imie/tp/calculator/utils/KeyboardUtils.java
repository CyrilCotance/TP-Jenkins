package com.imie.tp.calculator.utils;

import java.util.Scanner;

public final class KeyboardUtils {

    public static String readFromKeyboard() {
        Scanner keyboard = new Scanner(System.in);

        return keyboard.nextLine();
    }
}
