package org.example.chain;

import org.example.context.NormalContext;
import org.example.context.RejectContext;

public interface StateHandler {
    /**
     * 下个阶段开始前的处理
     *
     * @param normalContext
     */
    void preStart(NormalContext normalContext);

    /**
     * 开始处理本阶段
     *
     * @param normalContext
     */
    void start(NormalContext normalContext);

    /**
     * 本阶段处理完毕
     *
     * @param normalContext
     */
    void complete(NormalContext normalContext);

    /**
     * 专门处理不通过阶段
     *
     * @param rejectContext
     */
    void reject(RejectContext rejectContext);
}
