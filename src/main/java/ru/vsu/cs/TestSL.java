package ru.vsu.cs;

import ru.cs.vsu.multithreading.annotation.StripedLock;

public class TestSL {

    public TestSL() {

    }

    public TestSL(int i, String aaa) {

    }

    @StripedLock(lockIdentifier = "l")
    public String el(String l) {
        System.out.println("1");
        return "s";
    }

    @StripedLock(lockIdentifier = "l")
    public String el2(String l) {
        System.out.println("1");
        return "s";
    }
}
