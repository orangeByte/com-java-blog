package org.example.service;

import com.github.pagehelper.PageInfo;
import org.example.entity.Blog;
import org.example.vo.BlogVo;

public interface BlogService {
    int addBlog(Blog blog);
    PageInfo<BlogVo> getBlog(Integer pageNum, Integer pageSize);

}
