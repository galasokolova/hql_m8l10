package org.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "publisher")

@Getter
@Setter
@ToString
public class Publisher {

    @Id
    int id;

    @Column(name = "name")
    String name;
}
