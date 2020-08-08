package com.shanks.redditclone.repositories;

import com.shanks.redditclone.models.Post;
import com.shanks.redditclone.models.Subreddit;
import com.shanks.redditclone.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
