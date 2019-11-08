package com.x4dd3w.reddit;

import com.x4dd3w.reddit.models.Post;
import com.x4dd3w.reddit.repositories.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

  private PostRepo postRepo;

  @Autowired
  public RedditApplication(PostRepo postRepo) {
    this.postRepo = postRepo;
  }

  public static void main(String[] args) {
    SpringApplication.run(RedditApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Post post1 = new Post("Facebook", "www.facebook.com");
    Post post2 = new Post("BGG", "www.boardgamegeek.com");
    Post post3 = new Post("OpenProcessing", "www.openprocessing.org");

    postRepo.save(post1);
    postRepo.save(post2);
    postRepo.save(post3);
  }
}
