package com.x4dd3w.reddit.services;

import com.x4dd3w.reddit.models.Post;
import com.x4dd3w.reddit.repositories.PostRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

  @Autowired
  private PostRepo postRepo;

  @Override
  public List<Post> listAllPostsById() {
    return postRepo.sortPostByRating();
  }


}
