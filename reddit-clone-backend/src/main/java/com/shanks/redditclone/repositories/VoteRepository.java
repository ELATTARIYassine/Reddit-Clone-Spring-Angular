package com.shanks.redditclone.repositories;

import com.shanks.redditclone.models.Post;
import com.shanks.redditclone.models.User;
import com.shanks.redditclone.models.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
