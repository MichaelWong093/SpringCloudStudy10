package com.ithuangwei.cloudspringbootsecurity.service;

import com.ithuangwei.cloudspringbootsecurity.domain.Blog;
import com.ithuangwei.cloudspringbootsecurity.service.impl.IBlogService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Huangw
 * @projectName workspace_study
 * @description: TODO
 * @date 2019/8/16 15:39
 */
@Service
public class BlogService implements IBlogService {

    private List<Blog> list = new ArrayList<>();

    public BlogService() {
        list.add(new Blog(1L, "spring in action", "good!"));
        list.add(new Blog(2L, "spring boot in action", "nice!"));
    }

    @Override
    public List<Blog> getBlogs() {
        return list;
    }

    @Override
    public void deleteBlog(long id) {
        list.removeIf(blog -> blog.getId() == id);
    }
}
