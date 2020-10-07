package org.example.controller;

import org.example.entity.Blog;
import org.example.entity.RespBean;
import org.example.service.BlogService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Resource
    private BlogService blogService;

    @PostMapping("addBlog")
    public RespBean addBlog(@RequestBody Blog blog){
        return blogService.addBlog(blog) > 0 ? RespBean.ok() : RespBean.error();
    }

    @GetMapping("getBlog")
    public RespBean getBlog(@RequestParam(defaultValue = "0") Integer pageNum,
                            @RequestParam(defaultValue = "3") Integer pageSize){
        return null != blogService.getBlog(pageNum, pageSize) ? RespBean.ok("okay", blogService.getBlog(pageNum, pageSize)) : RespBean.error();
    }
}
