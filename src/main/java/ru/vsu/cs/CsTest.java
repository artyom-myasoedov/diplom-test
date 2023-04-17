package ru.vsu.cs;

import ru.cs.vsu.multithreading.annotation.CrossSemaphore;

public class CsTest {

    public CsTest() {

    }

    public CsTest(int i, String aaa) {

    }


    @CrossSemaphore(semophoreId = "11121311-1611-1611-1111-111111111111", permits = 5)
    public void mtest() {


        System.out.println("sdsdsds");

    }
}
