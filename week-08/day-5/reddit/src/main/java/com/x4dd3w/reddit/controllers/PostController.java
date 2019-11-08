package com.x4dd3w.reddit.controllers;

import com.x4dd3w.reddit.models.Post;
import com.x4dd3w.reddit.repositories.PostRepo;
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
  private PostRepo postRepo;

  @Autowired
  private PostService postService;

  public PostController(PostRepo postRepo) {
    this.postRepo = postRepo;
  }

  @GetMapping({"", "/",})
  public String mainPage(Model model) {
    model.addAttribute("posts", postService.listAllPostsById());
    return "index";
  }

  @GetMapping("/submit")
  public String submitNewPost(Model model, @ModelAttribute Post post) {
    model.addAttribute("post", post);
    return "addpost";
  }

  @PostMapping("/submit")
  public String saveNewPost(@ModelAttribute Post post) {
    postRepo.save(post);
    return "redirect:/";
  }

  @GetMapping("/{id}/upvote")
  public String upVotePost(@PathVariable Long id) {
    postRepo.findById(id).orElse(null).setRating(postRepo.findById(id).orElse(null).getRating() + 1);
    postRepo.save(postRepo.findById(id).orElse(null));
    return "redirect:/";
  }

  @GetMapping("/{id}/downvote")
  public String downVotePost(@PathVariable Long id) {
    postRepo.findById(id).orElse(null).setRating(postRepo.findById(id).orElse(null).getRating() - 1);
    postRepo.save(postRepo.findById(id).orElse(null));
    return "redirect:/";
  }
}
