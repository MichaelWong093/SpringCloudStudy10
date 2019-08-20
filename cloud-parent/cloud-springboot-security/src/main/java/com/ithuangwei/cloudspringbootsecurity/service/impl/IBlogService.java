package com.ithuangwei.cloudspringbootsecurity.service.impl;

import com.ithuangwei.cloudspringbootsecurity.domain.Blog;

import java.util.List;

/**
 * @author Huangw
 * @projectName workspace_study
 * @description: TODO
 * @date 2019/8/16 15:39
 */
public interface IBlogService {
    List<Blog> getBlogs();

    void deleteBlog(long id);
}
