package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int id;
    private final int postsQuantity;
    private final String username;
    private final char gender;
    private final LocalDate dateOfBirth;

    public ForumUser(int id, int postsQuantity, String username, char gender, LocalDate dateOfBirth) {
        this.id = id;
        this.postsQuantity = postsQuantity;
        this.username = username;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        if (id != forumUser.id) return false;
        if (postsQuantity != forumUser.postsQuantity) return false;
        if (gender != forumUser.gender) return false;
        if (!username.equals(forumUser.username)) return false;
        return dateOfBirth.equals(forumUser.dateOfBirth);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + postsQuantity;
        result = 31 * result + username.hashCode();
        result = 31 * result + (int) gender;
        result = 31 * result + dateOfBirth.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", postsQuantity=" + postsQuantity +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
