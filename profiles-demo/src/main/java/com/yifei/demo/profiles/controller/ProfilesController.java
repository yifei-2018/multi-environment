package com.yifei.demo.profiles.controller;

import com.yifei.demo.profiles.model.Result;
import com.yifei.demo.profiles.util.PropertiesUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yifei
 * @date 2018/12/7
 */
@Controller
@RequestMapping("/profiles")
public class ProfilesController {

    private static final Logger logger = LoggerFactory.getLogger(ProfilesController.class);

    private static final String ENV_SUCCESS = PropertiesUtils.getValue("env.success");

    @RequestMapping("/test")
    @ResponseBody
    public Result Test() {
        logger.info(ENV_SUCCESS);

        Result result = new Result();
        result.setCode("200");
        result.setMsg(ENV_SUCCESS);

        return result;
    }
}
