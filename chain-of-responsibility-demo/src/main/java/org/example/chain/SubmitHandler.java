package org.example.chain;

import lombok.extern.slf4j.Slf4j;
import org.example.context.NormalContext;
import org.example.context.RejectContext;
import org.example.factory.ProcessHandlerFactory;
import org.example.processEnum.ProcessEnum;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 提交处理
 */
@Component(value = "submit")
@Slf4j
public class SubmitHandler implements StateHandler {
    @Resource
    private ProcessHandlerFactory processHandlerFactory;

    @Override
    public void preStart(NormalContext normalContext) {
        // 这是第一个阶段，所以进入这个方法是错误的
        throw new RuntimeException("错误阶段");
    }

    @Override
    public void start(NormalContext normalContext) {
        // 其他业务逻辑

        complete(normalContext);
    }

    @Override
    public void complete(NormalContext normalContext) {
        log.info("{} 开始处理", normalContext.getStateName());

        // 处理完毕，转到下个阶段
        normalContext.setStateName(ProcessEnum.TEST.getName());
        processHandlerFactory.getStateHandler(normalContext.getStateName()).preStart(normalContext);
    }

    @Override
    public void reject(RejectContext rejectContext) {
        throw new RuntimeException("错误阶段");
    }
}
