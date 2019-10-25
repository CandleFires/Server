package com.candlefires.mindmap.backend.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class Category implements Serializable {

    private static final long serialVersionUID = 8413437413982417580L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

}
