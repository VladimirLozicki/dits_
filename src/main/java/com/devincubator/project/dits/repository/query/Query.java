package com.devincubator.project.dits.repository.query;

/**
 * @author roma.zamoiski@gmail.com
 */
public enum Query {

    SELECT_ANSWER("from Answer a"),

    SELECT_LINK("from Link l"),

    SELECT_LITERATURE("from Literature l"),

    SELECT_QUESTION("from Question q"),

    SELECT_ROLE("from Role r"),

    SELECT_STATISTIC("from Statistic s"),

    SELECT_TEST("from Test t"),

    SELECT_TOPIC("from Topic t"),

    SELECT_USER("from User u"),
    SELECT_USER_BY_LOGIN("from User u where u.login = :login"),
    SELECT_USER_BY_LOGIN_AND_PASSWORD("select u from User where u.login = :login and password = :password");

    private String query;

    Query(String query){
        this.query = query;
    }

    public String getQuery() {
        return query;
    }
}
