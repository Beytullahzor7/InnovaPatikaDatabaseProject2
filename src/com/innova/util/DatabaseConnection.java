package com.innova.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection extends DatabaseInformation{
    //Database Connection
    private Connection connection;

    //Database Connection Information
    private String url=this.getUrl();
    private String userName=this.getUserName();
    private String userPassword=this.getUserPassword();

    //Singleton Design Pattern
    private static DatabaseConnection instance;

    //Private Constructor
    private DatabaseConnection(){
        try{
            Class.forName(this.getForNameData());
            System.out.println("Driver Success !!!");
            this.connection= DriverManager.getConnection(url, userName, userPassword);
            System.out.println("Connection Success ...");
        }catch (Exception e){
            System.out.println("Error Connection Failed !!!");
            e.printStackTrace();
        }
    }
    //Amacım eger baglantı varsa onu kullanmak
    //Eğer baglantı kapatılmış veya baglantı yoksa instance yapmak
    public static DatabaseConnection getInstance() {
        try{
            if (instance == null){
                instance = new DatabaseConnection();
            }else if(instance.connection.isClosed()){
                instance = new DatabaseConnection();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public DatabaseConnection setConnection(Connection connection) {
        this.connection = connection;
        return this;
    }
}
