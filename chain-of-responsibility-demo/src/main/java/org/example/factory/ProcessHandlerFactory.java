package org.example.factory;

import org.example.chain.StateHandler;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ProcessHandlerFactory {
    @Resource
    private ApplicationContext applicationContext;

    public StateHandler getStateHandler(String stateName) {
        return applicationContext.getBean(stateName, StateHandler.class);
    }
}
