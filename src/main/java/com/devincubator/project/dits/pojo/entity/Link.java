package com.devincubator.project.dits.pojo.entity;

import javax.persistence.*;

@Entity
public class Link {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long linkId;

    @Column
    private String link;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "literatureId")
    private Literature literature;

    public Link() {
    }

    public Link(String link, Literature literature) {
        this.link = link;
        this.literature = literature;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Literature getLiterature() {
        return literature;
    }

    public void setLiterature(Literature literature) {
        this.literature = literature;
    }
}
