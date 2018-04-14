package com.workflow.main;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Version;
import java.time.ZonedDateTime;

@Entity
@Table(name = "todos")
public class Todo {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
 

 
    @Column(name = "description", length = 500)
    public String description;
 

 
    @Column(name = "title", nullable = false, length = 100)
    public String title;
 
    @Version
    public long version;
     
    //The constructor, builder, and other methods are omitted
}