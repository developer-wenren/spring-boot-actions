package com.one.swagger.controller;

import com.one.swagger.domain.BaseResult;
import com.one.swagger.domain.Message;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Api(value = "消息", description = "消息操作 API", position = 100, protocols = "http ")
@RestController
@RequestMapping("/")
public class MessageController {

    @ApiOperation(value = "消息列列表", notes = "完整的消息内容列列表", produces = "application/json, application/xml", consumes = "application/json, application/xml", response = List.class)
    @GetMapping(value = "messages")
    public List<Message> list() {
        return new ArrayList<>();
    }

    @ApiOperation(value = "添加消息", notes = "根据参数创建消息")
    @ApiImplicitParams({@ApiImplicitParam(name = "id", value = "消息 ID", required = true, dataType = "Long", paramType = "query"),
            @ApiImplicitParam(name = "text", value = "正文", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "summary", value = "摘要", required = false, dataType = "String", paramType = "query"),})
    @PostMapping(value = "message")
    public Message create(Message message) {
        return message;
    }

    @ApiOperation(value = "修改消息", notes = "根据参数修改消息")
    @PutMapping(value = "message")
    @ApiResponses({@ApiResponse(code = 100, message = "请求参数有误"),
            @ApiResponse(code = 101, message = "未授权"),
            @ApiResponse(code = 103, message = "禁⽌止访问"),
            @ApiResponse(code = 104, message = "请求路路径不不存在"),
            @ApiResponse(code = 200, message = "服务器器内部错误")})
    public Message modify(Message message) {
        return message;
    }

    @PatchMapping(value = "/message/text")
    public BaseResult<Message> patch(Message message) {
        return BaseResult.successWithData(message);
    }
}