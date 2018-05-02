package com.cloud.sericefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chen lian
 * @date 18/4/27 下午12:42
 */

@RestController
public class PythonController {

    @Autowired
    PythonService pythonService;
    @RequestMapping(value = "/python",method = RequestMethod.GET)
    public String sayHi(){
        return pythonService.sayHiFromClientOne();
    }
}

