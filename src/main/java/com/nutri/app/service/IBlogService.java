package com.nutri.app.service;

import java.util.List;

import com.nutri.app.entity.Blog;

public interface IBlogService {
    void createBlog(Blog blog);

    void updateBlog(Long id, Blog blog);

    void deleteBlog(Long id);

    Blog getBlog(Long id);

    List<Blog> getAllBlogs();
}
