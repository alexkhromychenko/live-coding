package com.wearebrain.livecoding.service;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MultithreadingTaskService {
    public void doWork() {

    }

    @SneakyThrows
    private void doSomeWork() {
        log.info("Started some work");
        Thread.sleep(2000);
        log.info("Finished some work");
    }

    @SneakyThrows
    private void doAnotherWork() {
        log.info("Started another work");
        Thread.sleep(2500);
        log.info("Finished another work");
    }
}
