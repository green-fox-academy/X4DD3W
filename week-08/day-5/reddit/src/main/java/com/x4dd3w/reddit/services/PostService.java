package com.x4dd3w.reddit.services;

import com.x4dd3w.reddit.models.Post;
import java.util.List;

public interface PostService {

  List<Post> listAllPostsById(Integer page);

  void savePost(Post post);

  void upvoteAndSaveThePost(Long id);

  void downvoteAndSaveThePost(Long id);

  /*int pageSizeChecker();*/

}
