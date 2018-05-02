package com.cloud.sericefeign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author chen lian
 * @date 18/4/27 下午12:42
 */

@FeignClient(value = "sidecar")
public interface PythonService {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHiFromClientOne();
}

