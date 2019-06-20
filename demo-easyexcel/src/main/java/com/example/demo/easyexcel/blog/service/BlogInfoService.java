package com.example.demo.easyexcel.blog.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.easyexcel.blog.domain.BlogInfo;
import com.example.demo.easyexcel.blog.mapper.BlogInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogInfoService {

    @Autowired
    BlogInfoMapper blogInfoMapper;

    /**
     *
     * @return
     */
    public List<BlogInfo> queryAll() {
        QueryWrapper<BlogInfo> wrapper = new QueryWrapper<>();
        wrapper.select(BlogInfo.class, item -> !item.getColumn().equals("cell_style_map"));
        return blogInfoMapper.selectList(wrapper);
    }

}
