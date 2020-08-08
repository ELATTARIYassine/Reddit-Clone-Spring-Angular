package com.shanks.redditclone.repositories;

import com.shanks.redditclone.models.Comment;
import com.shanks.redditclone.models.Post;
import com.shanks.redditclone.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
