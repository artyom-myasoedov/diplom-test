package ru.vsu.cs;

import java.lang.Override;
import java.lang.String;
import ru.cs.vsu.multithreading.core.stripedlock.DefaultLocker;

public class TestSLStripedLockProxy extends TestSL {
    public TestSLStripedLockProxy() {
        super();
    }

    public TestSLStripedLockProxy(int i, String aaa) {
        super(i, aaa);
    }

    @Override
    public String el(String l) {
        DefaultLocker.getInstance().lock(l);
        var returnValueGenerated = super.el(l);
        DefaultLocker.getInstance().unlock(l);
        return returnValueGenerated;
    }

    @Override
    public String el2(String l) {
        DefaultLocker.getInstance().lock(l);
        var returnValueGenerated = super.el2(l);
        DefaultLocker.getInstance().unlock(l);
        return returnValueGenerated;
    }
}
