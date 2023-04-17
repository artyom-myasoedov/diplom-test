package ru.vsu.cs;

import ru.cs.vsu.multithreading.annotation.Scheduled;
import ru.cs.vsu.multithreading.annotation.StripedLock;

public class TestSchedulable {

    @Scheduled
    public static void mm() {
        System.out.println("sssss");
    }

    @StripedLock(lockIdentifier = "l")
    public String el2(String l) {
        System.out.println("1");
        return "s";
    }
}
