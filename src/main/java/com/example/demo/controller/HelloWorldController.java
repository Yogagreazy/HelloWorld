/**
 * Copyright (C), 2015-2019, 中信银行有限公司
 * FileName: HelloWorld
 * Author:   willem
 * Date:     2019-06-16 12:42
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author willem
 * @create 2019-06-16
 * @since 1.0.0
 */
@RestController
public class HelloWorldController {

    /**
     * 功能描述: <br>
     * 〈http://localhost:8080/hello〉
     *
     * @param:
     * @return:
     * @since: 1.0.0
     * @Author:willem
     * @Date: 2019-06-16 12:51
     */

    @GetMapping("/hello")
    public String helloworld(){
        return "HelloWorld";
    }

}
