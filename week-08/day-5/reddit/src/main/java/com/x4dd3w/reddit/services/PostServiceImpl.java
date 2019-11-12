package com.x4dd3w.reddit.services;

import com.x4dd3w.reddit.models.Post;
import com.x4dd3w.reddit.repositories.PostRepo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

  @Autowired
  private PostRepo postRepo;

  @Override
  public List<Post> listAllPostsById(Integer page) {
    List<Post> posts = new ArrayList<>();
    posts.addAll(postRepo.sortPostByRating(10 * (page - 1), 10 * page));
    return posts;
  }

  @Override
  public void savePost(Post post) {
    postRepo.save(post);
  }

  @Override
  public void upvoteAndSaveThePost(Long id) {
    postRepo.findById(id).orElse(null)
        .setRating(postRepo.findById(id).orElse(null).getRating() + 1);
    postRepo.save(postRepo.findById(id).orElse(null));
  }

  @Override
  public void downvoteAndSaveThePost(Long id) {
    postRepo.findById(id).orElse(null)
        .setRating(postRepo.findById(id).orElse(null).getRating() - 1);
    postRepo.save(postRepo.findById(id).orElse(null));
  }

 /* @Override
  public int pageSizeChecker() {
    // page nem lehet nagyobb a posts mérete % modulo 10-zel
    return postRepo.findAllPosts().size() / 10;
  }*/

}
