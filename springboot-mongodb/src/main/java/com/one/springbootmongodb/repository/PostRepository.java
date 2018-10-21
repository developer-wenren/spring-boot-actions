package com.one.springbootmongodb.repository;

import com.one.springbootmongodb.entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author One
 * @description Post 实体对应的存储对象
 * @date 2018/10/20
 */
public interface PostRepository extends MongoRepository<Post,Long> {
    Post findByTitle(String title);
}
