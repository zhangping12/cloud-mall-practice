package com.imooc.cloud.mall.practice.zuul.feign;

import com.imooc.cloud.mall.practice.user.model.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述：UserFeignClient
 */
@FeignClient(value = "cloud-mall-user")
public interface UserFeignClient {

    /**
     * 校验是否是管理员
     * @param user
     * @return
     */
    @PostMapping("/checkAdminRole")
    public Boolean checkAdminRole(@RequestParam User user);
}
