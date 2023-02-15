package com.project.blogappapis.Services;

import com.project.blogappapis.Entity.Post;
import com.project.blogappapis.Payloads.PostDto;

import java.util.List;

public interface PostService {

    // Create
    PostDto createPost(PostDto  postDto, Integer userId, Integer categoryId);

    // Update
    Post updatePost(PostDto postDto, Integer postId);

    // Delete
    void deletePost(Integer postId);

    // Get all post
    List<Post> getAllPost();

    // Get single post
    Post getPostById(Integer postId);

    // Get all post by Category
    List<Post> getPostsByCategory(Integer categoryId);

    // Get all Posts by User
    List<Post> getPostsByUser(Integer userId);

    // Search posts
    List<Post> searchPosts(String keyword);
}
