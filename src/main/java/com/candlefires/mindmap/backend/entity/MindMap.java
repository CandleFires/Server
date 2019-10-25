package com.candlefires.mindmap.backend.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class MindMap implements Serializable {

    private static final long serialVersionUID = -6900300976463568258L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

}
