package com.skillsoft.springboot;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SimpleScheduler {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRateString = "${scheduler.rate}", initialDelayString = "${scheduler.initial.delay}")
    public void scheduledLookup() throws InterruptedException, IllegalArgumentException {
        System.out.println("The time is now: " + dateFormat.format(new Date()));

        Thread.sleep(5000);
    }
}
