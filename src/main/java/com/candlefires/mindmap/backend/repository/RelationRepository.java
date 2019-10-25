package com.candlefires.mindmap.backend.repository;

import com.candlefires.mindmap.backend.entity.MindMap;
import com.candlefires.mindmap.backend.entity.Relation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelationRepository extends JpaRepository<Relation, Long> {
}
