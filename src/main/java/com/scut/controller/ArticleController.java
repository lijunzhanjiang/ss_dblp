package com.scut.controller;/**
 * @author yejh
 * @create 2020-02_07 13:46
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description: TODO
 **/

@Controller
public class ArticleController {

    @RequestMapping(value = "/test")
    public String test(@RequestParam(value = "aid", defaultValue = "none")String aid, Model model){
        model.addAttribute("aid", aid);
        return "article_list";

    }
}
