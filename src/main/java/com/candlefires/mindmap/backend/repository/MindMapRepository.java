package com.candlefires.mindmap.backend.repository;

import com.candlefires.mindmap.backend.entity.Category;
import com.candlefires.mindmap.backend.entity.MindMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MindMapRepository extends JpaRepository<MindMap, Long> {
}
