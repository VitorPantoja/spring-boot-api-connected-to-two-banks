package com.multipledb.api.model.user;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "raul", schema = "public")
@Data
public class Raul {
    @Id
    private int id;

    private String name;
}
