package com.candlefires.mindmap.backend.repository;

import com.candlefires.mindmap.backend.entity.Thought;
import com.candlefires.mindmap.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
