package org.example.mapper;

import org.example.vo.BlogVo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BlogVoMapper extends Mapper<BlogVo> {
    List<BlogVo> getBlogVoList();

}
