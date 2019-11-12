package com.x4dd3w.reddit.repositories;

import com.x4dd3w.reddit.models.Post;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PostRepo extends CrudRepository<Post, Long> {

  @Query(value = "SELECT * FROM post ORDER BY rating DESC LIMIT ?1, ?2", nativeQuery = true)
  List<Post> sortPostByRating(@Param("page") int from, int to);
  // LIMIT ?1, ?2 ---> LIMIT ?2 OFFSET ?1

 /* @Query(value = "SELECT * FROM post", nativeQuery = true)
  List<Post> findAllPosts();*/
}
