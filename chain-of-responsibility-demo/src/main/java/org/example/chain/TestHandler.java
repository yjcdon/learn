package org.example.chain;

import lombok.extern.slf4j.Slf4j;
import org.example.context.NormalContext;
import org.example.context.RejectContext;
import org.example.factory.ProcessHandlerFactory;
import org.example.processEnum.ProcessEnum;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 开始测试
 */
@Component(value = "test")
@Slf4j
public class TestHandler implements StateHandler {
    @Resource
    private ProcessHandlerFactory processHandlerFactory;

    @Override
    public void preStart(NormalContext normalContext) {
        log.info("{} 开始处理", normalContext.getStateName());

        // 结束处理，发送通知给相关人员
        log.info("发送通知，{} 预处理完毕", normalContext.getStateName());
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
        normalContext.setStateName(ProcessEnum.RELEASE.getName());
        processHandlerFactory.getStateHandler(normalContext.getStateName()).preStart(normalContext);
    }

    @Override
    public void reject(RejectContext rejectContext) {
        throw new RuntimeException("错误阶段");
    }
}
