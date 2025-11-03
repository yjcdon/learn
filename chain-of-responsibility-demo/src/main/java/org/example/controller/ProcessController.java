package org.example.controller;

import org.example.service.ProcessService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ProcessController {
    @Resource
    private ProcessService processService;

    @PostMapping("/submit")
    public String submit() {
        return processService.submit();
    }

    @PostMapping("/test")
    public String test() {
        return processService.test();
    }

    @PostMapping("/release")
    public String release() {
        return processService.release();
    }

    @PostMapping("/notPass")
    public String notPass() {
        return processService.notPass();
    }
}
