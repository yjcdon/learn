package org.example.service.impl;

import org.example.chain.StateHandler;
import org.example.context.NormalContext;
import org.example.context.NotPassContext;
import org.example.factory.ProcessHandlerFactory;
import org.example.processEnum.ProcessEnum;
import org.example.service.ProcessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProcessServiceImpl implements ProcessService {
    @Resource
    private ProcessHandlerFactory processHandlerFactory;

    @Override
    public String submit() {
        StateHandler stateHandler = processHandlerFactory.getStateHandler(ProcessEnum.SUBMIT.getName());
        NormalContext normalContext = new NormalContext();
        normalContext.setStateName(ProcessEnum.SUBMIT.getName());
        stateHandler.start(normalContext);
        return ProcessEnum.SUBMIT.getDesc() + "完成";
    }

    @Override
    public String test() {
        StateHandler stateHandler = processHandlerFactory.getStateHandler(ProcessEnum.TEST.getName());
        NormalContext normalContext = new NormalContext();
        normalContext.setStateName(ProcessEnum.TEST.getName());
        stateHandler.start(normalContext);
        return ProcessEnum.TEST.getDesc() + "完成";
    }

    @Override
    public String release() {
        StateHandler stateHandler = processHandlerFactory.getStateHandler(ProcessEnum.RELEASE.getName());
        NormalContext normalContext = new NormalContext();
        normalContext.setStateName(ProcessEnum.RELEASE.getName());
        stateHandler.start(normalContext);
        return ProcessEnum.RELEASE.getDesc() + "完成";
    }

    @Override
    public String notPass() {
        StateHandler stateHandler = processHandlerFactory.getStateHandler(ProcessEnum.NOT_PASS.getName());
        NotPassContext notPassContext = new NotPassContext();
        notPassContext.setStateName(ProcessEnum.NOT_PASS.getName());
        stateHandler.notPass(notPassContext);
        return ProcessEnum.NOT_PASS.getDesc() + "完成";
    }
}
