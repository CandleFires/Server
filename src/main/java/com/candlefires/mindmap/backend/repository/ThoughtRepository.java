package com.candlefires.mindmap.backend.repository;

import com.candlefires.mindmap.backend.entity.Relation;
import com.candlefires.mindmap.backend.entity.Thought;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThoughtRepository extends JpaRepository<Thought, Long> {
}
