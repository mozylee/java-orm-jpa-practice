package practice.jpa1.domain;

import javax.persistence.Entity;

@Entity
public class Book extends Item {

    private String author;

    private String isbn;

}