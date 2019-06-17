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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author willem
 * @create 2019-06-16
 * @since 1.0.0
 */
@Controller
public class HelloWorldController {

    /**
     * 功能描述: <br>
     * 〈返回字符串测试〉
     *
     * @param:
     * @return:
     * @since: 1.0.0
     * @Author:willem
     * @Date: 2019-06-16 14:42
     */

    @GetMapping("/hello1")
    @ResponseBody
    protected String helloworld1() {
        return "helloworld1";
    }

    /**
     * 功能描述: <br>
     * 〈测试访问 html，默认 resource 下的〉
     *
     * @param:
     * @return:
     * @since: 1.0.0
     * @Author:willem
     * @Date: 2019-06-16 14:43
     */

    @GetMapping("/hello")
    public String helloworld2() {
        return "/hello2";
    }

    /**
     * 功能描述: <br>
     * 〈测试访问自定义下的.jsp〉
     *
     * @param:
     * @return:
     * @since: 1.0.0
     * @Author:willem
     * @Date: 2019-06-16 14:45
     */

    @GetMapping("/hello3")
    public String helloworld3() {
        return "hello3";
    }

}
