package com.example.booksdemo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "demo_comment")
public class Comment {

    @Id
    private Long id;

    @Column(name="comment")
    private String comment;

    @Column(name="comment_date")
    private Date commentDate;

    @Column(name="who")
    private String who;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }
}
