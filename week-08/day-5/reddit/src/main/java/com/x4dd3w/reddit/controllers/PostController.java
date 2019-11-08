package com.x4dd3w.reddit.controllers;

import com.x4dd3w.reddit.models.Post;
import com.x4dd3w.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

  @Autowired
  private PostService postService;

  public PostController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping({"", "/", "/{page}"})
  public String mainPage(Model model, @PathVariable(name = "page", required = false) Integer page) {
    if (page == null || page == 0) {
      page = 1;
    }
    model.addAttribute("posts", postService.listAllPostsById(page));
    model.addAttribute("page", page);
    return "index";
  }

  @GetMapping("/submit")
  public String submitNewPost(Model model, @ModelAttribute Post post) {
    model.addAttribute("post", post);
    return "addpost";
  }

  @PostMapping("/submit")
  public String saveNewPost(@ModelAttribute Post post) {
    postService.savePost(post);
    return "redirect:/";
  }

  @GetMapping("/{id}/upvote")
  public String upvotePost(@PathVariable Long id) {
    postService.upvoteAndSaveThePost(id);
    return "redirect:/";
  }

  @GetMapping("/{id}/downvote")
  public String downvotePost(@PathVariable Long id) {
    postService.downvoteAndSaveThePost(id);
    return "redirect:/";
  }
}