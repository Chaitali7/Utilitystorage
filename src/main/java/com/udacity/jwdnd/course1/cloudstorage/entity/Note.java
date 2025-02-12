package com.udacity.jwdnd.course1.cloudstorage.entity;

import javax.persistence.Entity;

@Entity
public class Note extends BaseUserRelatedEntity {

    private String noteTitle;
    private String noteDescription;

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteDescription() {
        return noteDescription;
    }

    public void setNoteDescription(String noteDescription) {
        this.noteDescription = noteDescription;
    }
}
