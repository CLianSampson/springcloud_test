package com.cloud.sericefeign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chen lian
 * @date 18/4/25 下午12:05
 */
@FeignClient(value = "client")
public interface SchedualServiceHi {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHiFromClientOne();
}
