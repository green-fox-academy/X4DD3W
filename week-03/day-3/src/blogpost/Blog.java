package blogpost;

import java.util.ArrayList;
import java.util.List;

public class Blog {

  //Create a Blog class which can
  // store a list of BlogPosts
  // add BlogPosts to the list
  // delete(int) one item at given index
  // update(int, BlogPost) one item at the given index and update it with another BlogPost

  List<BlogPost> allPost;  // <> belül az  h mit tartalmaz (blogpost)

  public Blog() {
    this.allPost = new ArrayList<>();
  }

  public void add(BlogPost newPost){
    allPost.add(new BlogPost());
  }

  public void delete(int deleteThisBlogPost) {
    allPost.remove(deleteThisBlogPost);
  }

  public void update(int updateItemIndex, BlogPost updateWithIt) {
    allPost.set(updateItemIndex, updateWithIt);
  }

}
