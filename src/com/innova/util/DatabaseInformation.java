package com.innova.util;

abstract public class DatabaseInformation {
    //Object Variables
    private String url;
    private String userName;
    private String userPassword;
    private String forNameData; //In order to show class location

    //Constructor without parameter
    public DatabaseInformation() {
        /*this.url="jdbc:postgresql://localhost:5432/innova_patika_project_1";
        this.userName="postgres";
        this.userPassword="12345";
        this.forNameData="org.postgresql.Driver";*/

        this.url="jdbc:mysql://localhost:3306/innova_patika_project1";
        this.userName="root";
        this.userPassword="1234";
        this.forNameData="com.mysql.jdbc.Driver";
    }

    //Constructor with parameter
    public DatabaseInformation(String url, String userName, String userPassword, String forNameData) {
        this.url = url;
        this.userName = userName;
        this.userPassword = userPassword;
        this.forNameData = forNameData;
    }

    @Override
    public String toString() {
        return "DatabaseInformation{" +
                "url='" + url + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", forNameData='" + forNameData + '\'' +
                '}';
    }

    //Getter and Setter
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getForNameData() {
        return forNameData;
    }

    public void setForNameData(String forNameData) {
        this.forNameData = forNameData;
    }
}
