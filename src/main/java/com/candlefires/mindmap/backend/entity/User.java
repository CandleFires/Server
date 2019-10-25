package com.candlefires.mindmap.backend.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 6725689352112054521L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

}
