package org.example.chain;

import lombok.extern.slf4j.Slf4j;
import org.example.context.NormalContext;
import org.example.context.NotPassContext;
import org.springframework.stereotype.Component;

/**
 * 测试不通过
 **/
@Component(value = "notPass")
@Slf4j
public class NotPassHandler implements StateHandler {
    @Override
    public void preStart(NormalContext normalContext) {
        throw new RuntimeException("错误阶段");
    }

    @Override
    public void start(NormalContext normalContext) {
        throw new RuntimeException("错误阶段");
    }

    @Override
    public void complete(NormalContext normalContext) {
        throw new RuntimeException("错误阶段");
    }

    @Override
    public void notPass(NotPassContext notPassContext) {
        log.info("{} 开始处理", notPassContext.getStateName());

        // 结束处理，发送通知给相关人员
        log.info("发送通知，{} 处理完毕", notPassContext.getStateName());
    }
}
