package ru.vsu.cs;

import java.lang.Override;
import java.lang.String;
import java.util.UUID;
import ru.cs.vsu.multithreading.core.crosssync.CrossSyncSemaphore;
import ru.cs.vsu.multithreading.core.crosssync.CrossSyncSemaphoreUtils;

public class CsTestCrossSemaphoreProxy extends CsTest {
    public CsTestCrossSemaphoreProxy() {
        super();
    }

    public CsTestCrossSemaphoreProxy(int i, String aaa) {
        super(i, aaa);
    }

    @Override
    public void mtest() {
        CrossSyncSemaphoreUtils.getDefaultDaoInstance().createIfNotExists(CrossSyncSemaphore.newInstance(UUID.fromString("11121311-1611-1611-1111-111111111111"), 5, 5));
                CrossSyncSemaphoreUtils.getDefaultDaoInstance().acquire(UUID.fromString("11121311-1611-1611-1111-111111111111"));
        super.mtest();
        CrossSyncSemaphoreUtils.getDefaultDaoInstance().release(UUID.fromString("11121311-1611-1611-1111-111111111111"));
    }
}
