package com.wearebrain.livecoding.controller;

import com.wearebrain.livecoding.service.MultithreadingTaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MultithreadingTaskController {
    private final MultithreadingTaskService multithreadingTaskService;

    @PostMapping("/multithreading/do-work")
    public void doWork() {
        multithreadingTaskService.doWork();
    }
}
