package org.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "book")

@Getter
@Setter
@ToString

@NamedQueries(
        {@NamedQuery(name = "BookPublishedMoreThanOneYear",
        query = "from Book where id < 10")}
)
public class Book {
    @Id
    int id;

    @Column(name = "title")
    String title;

//    @Column(name = "author_id")
//    int authorID;

    @ManyToOne
    @JoinColumn(name = "author_id")
    Author author;

    @Column(name = "publisher_id")
    int publisherID;

    @Column(name = "date_and_time")
    Date dateAndTime;

}
