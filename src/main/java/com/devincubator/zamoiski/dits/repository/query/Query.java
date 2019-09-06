package com.devincubator.zamoiski.dits.repository.query;

public enum Query {

    SELECT_ANSWER("from Answer a"),
    SELECT_LINK("from Link l"),
    SELECT_LITERATURE("from Literature l"),
    SELECT_QUESTION("from Question q"),
    SELECT_ROLE("from Role r"),
    SELECT_STATISTIC("from Statistic s"),
    SELECT_TEST("from Test t"),
    SELECT_TOPIC("from Topic t"),
    SELECT_USER("from User u");

    private String query;

    Query(String query){
        this.query = query;
    }

    public String getQuery() {
        return query;
    }
}
