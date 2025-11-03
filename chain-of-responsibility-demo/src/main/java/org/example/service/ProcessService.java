package org.example.service;

import org.springframework.stereotype.Service;

@Service
public interface ProcessService {

    String submit();

    String test();

    String release();

    String notPass();
}
