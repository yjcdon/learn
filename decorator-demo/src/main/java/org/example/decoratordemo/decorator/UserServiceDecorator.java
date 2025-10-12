package org.example.decoratordemo.decorator;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.example.decoratordemo.dto.UserResponseDTO;
import org.example.decoratordemo.service.UserService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
@Primary // 关键注解，提高注入优先级
@Slf4j
public class UserServiceDecorator implements UserService {
    @Resource
    private UserService userService;

    @Resource
    private Gson gson;

    @Override
    public UserResponseDTO getById(int id) {
        log.info("开始查询用户，入参：{}", gson.toJson(id));
        UserResponseDTO result = userService.getById(id);
        log.info("查询用户结束，响应：{}", gson.toJson(result));
        return result;
    }
}
