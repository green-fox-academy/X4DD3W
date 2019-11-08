package com.x4dd3w.reddit.repositories;

import com.x4dd3w.reddit.models.Post;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post, Long> {

  @Query(value = "SELECT * FROM post ORDER BY rating DESC", nativeQuery = true)
  List<Post> sortPostByRating();
}
