package org.example.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.entity.Blog;
import org.example.mapper.BlogMapper;
import org.example.mapper.BlogVoMapper;
import org.example.service.BlogService;
import org.example.vo.BlogVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Resource
    private BlogMapper blogMapper;
    @Resource
    private BlogVoMapper blogVoMapper;

    public int addBlog(Blog blog){
        return blogMapper.insertSelective(blog);
    }

    @Override
    public PageInfo<BlogVo> getBlog(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<BlogVo> blogVoList = blogVoMapper.getBlogVoList();
        PageInfo<BlogVo> blogVoPageInfo = new PageInfo<>(blogVoList);
        return blogVoPageInfo;
    }
}
