package org.example.chain;

import lombok.extern.slf4j.Slf4j;
import org.example.context.NormalContext;
import org.example.context.RejectContext;
import org.springframework.stereotype.Component;

/**
 * 发布
 **/
@Component(value = "release")
@Slf4j
public class ReleaseHandler implements StateHandler {

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
        log.info("发送通知，{} 处理完毕", normalContext.getStateName());
    }

    @Override
    public void reject(RejectContext rejectContext) {
        throw new RuntimeException("错误阶段");
    }
}
