package ru.vsu.cs;

import static ru.cs.vsu.multithreading.util.SchedulingIntersectionStrategy.RUN_IMMEDIATELY;

import ru.cs.vsu.multithreading.core.schedule.Schedulable;
import ru.cs.vsu.multithreading.core.schedule.task.ScheduleTask;

public class TestSchedulableMmScheduledInit implements Schedulable {
    public ScheduleTask initScheduleTask() {
        return ScheduleTask.of(RUN_IMMEDIATELY, 1000, "DEFAULT", () -> TestSchedulable.mm(), "11111111-1111-1111-1111-111111111111", 100);
    }
}
