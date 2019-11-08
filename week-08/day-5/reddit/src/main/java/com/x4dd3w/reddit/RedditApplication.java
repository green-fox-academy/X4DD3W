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
      /*Post post1 = new Post("Facebook", "www.facebook.com");
      Post post2 = new Post("BGG", "www.boardgamegeek.com");
      Post post3 = new Post("OpenProcessing", "www.openprocessing.org");
      Post post4 = new Post("Facebook", "www.facebook.com");
      Post post5 = new Post("BGG", "www.boardgamegeek.com");
      Post post6 = new Post("OpenProcessing", "www.openprocessing.org");
      Post post7 = new Post("Facebook", "www.facebook.com");
      Post post8 = new Post("BGG", "www.boardgamegeek.com");
      Post post9 = new Post("OpenProcessing", "www.openprocessing.org");
      Post post10 = new Post("Facebook", "www.facebook.com");
      Post post11 = new Post("BGG", "www.boardgamegeek.com");
      Post post12 = new Post("OpenProcessing", "www.openprocessing.org");
      Post post13 = new Post("Facebook", "www.facebook.com");
      Post post14 = new Post("BGG", "www.boardgamegeek.com");
      Post post15 = new Post("OpenProcessing", "www.openprocessing.org");
      postRepo.save(post1);
      postRepo.save(post2);
      postRepo.save(post3);
      postRepo.save(post4);
      postRepo.save(post5);
      postRepo.save(post6);
      postRepo.save(post7);
      postRepo.save(post8);
      postRepo.save(post9);
      postRepo.save(post10);
      postRepo.save(post12);
      postRepo.save(post13);
      postRepo.save(post14);
      postRepo.save(post15);*/
  }
}
