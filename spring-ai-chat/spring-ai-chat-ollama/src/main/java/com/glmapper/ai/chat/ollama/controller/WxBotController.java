package com.glmapper.ai.chat.ollama.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @description：
 * @author：dxs
 * @date：2026/1/15 09:11
 */
@Slf4j
@RestController
@RequestMapping("/wxbot")
public class WxBotController {
    @PostMapping("/callBack")
    public String callBack(@RequestBody Map<String, Object> msg) {
        log.info("接收到微信消息：{}", msg);
        return "success";
    }
}
