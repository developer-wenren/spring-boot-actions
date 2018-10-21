package com.one.springbootmongodb;

import com.one.springbootmongodb.entity.Post;
import com.one.springbootmongodb.repository.PostRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMongodbApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private PostRepository postRepository;

    @Test
    public void testInsert() {
        Post post = new Post(1L, "sayhi", "hi,mongodb");
        postRepository.insert(post);
        List<Post> all = postRepository.findAll();
        System.out.println(all);
        // [Post{id=1, title='sayhi', content='hi,mongodb', createTime=Sat Oct 20 20:55:15 CST 2018}]
        Assert.assertEquals(all.size(), 1);
    }

    @Test
    public void testUpdate() {

        Post post = new Post();
        post.setId(1L);
        post.setTitle("sayHi");
        post.setContent("hi,springboot");
        post.setCreateTime(new Date());
//        postRepository.save(post);
        Post updatedPost = postRepository.findByTitle("sayHi");
        Assert.assertEquals(updatedPost.getId(), post.getId());
        Assert.assertEquals(updatedPost.getTitle(), post.getTitle());
        Assert.assertEquals(updatedPost.getContent(), "hi,springboot");
    }


}
