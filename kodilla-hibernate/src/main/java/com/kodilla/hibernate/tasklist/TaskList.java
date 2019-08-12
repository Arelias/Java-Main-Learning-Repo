package com.kodilla.hibernate.tasklist;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "TASKLISTS")
public final class TaskList {

    private int id;
    private String listNAme;
    private String description;

    public TaskList() {
    }

    public TaskList(String listNAme, String description) {
        this.listNAme = listNAme;
        this.description = description;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }
    @NotNull
    @Column(name = "LISTNAME")
    public String getListNAme() {
        return listNAme;
    }

    private void setListNAme(String listNAme) {
        this.listNAme = listNAme;
    }
    @NotNull
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }
}
