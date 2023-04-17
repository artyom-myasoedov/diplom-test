package ru.vsu.cs;

import java.lang.Override;
import java.lang.String;
import ru.cs.vsu.multithreading.core.stripedlock.DefaultLocker;

public class TestSchedulableStripedLockProxy extends TestSchedulable {
    public TestSchedulableStripedLockProxy() {
        super();
    }

    @Override
    public String el2(String l) {
        DefaultLocker.getInstance().lock(l);
        var returnValueGenerated = super.el2(l);
        DefaultLocker.getInstance().unlock(l);
        return returnValueGenerated;
    }
}
