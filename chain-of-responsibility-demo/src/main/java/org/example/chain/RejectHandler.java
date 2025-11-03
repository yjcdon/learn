package org.example.chain;

import lombok.extern.slf4j.Slf4j;
import org.example.context.NormalContext;
import org.example.context.RejectContext;
import org.springframework.stereotype.Component;

/**
 * 测试不通过
 **/
@Component(value = "reject")
@Slf4j
public class RejectHandler implements StateHandler {
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
    public void reject(RejectContext rejectContext) {
        log.info("{} 开始处理", rejectContext.getStateName());

        // 结束处理，发送通知给相关人员
        log.info("发送通知，{} 处理完毕", rejectContext.getStateName());
    }
}
