/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.RecruitController;
import java.sql.*;

/**
 *
 * @author PC PRAKTIKUM
 */
public class RecruitModel {
    private RecruitModel rec;
    ConnectorDB ConnDB = new ConnectorDB();
    
    public RecruitModel(RecruitController R){
        
    }
    
    class ConnectorDB {
        String DBurl = "jdbc:mysql://localhost/recruit_db";
        String DBusername = "root";
        String DBpassword = "";

        Connection conn;
        Statement statement;

        public ConnectorDB(){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = (Connection) DriverManager.getConnection(DBurl, DBusername, DBpassword);
                System.out.println("Connection Success");
            }catch(Exception ex){
                System.out.println("Connection Failed " + ex.getMessage());
            }
        }
    }
    
    //Input Data Process
    //parameter: what the user input (name, score)
    public void insertData(String name, String path, float wScore, float cScore, float iScore){
        try{
            float finalScore = 0;
            String status;
            
            //Determining the final score base on the score from user's input
            if (path == "Android Dev"){
                finalScore = ((wScore * 0.2f)+(cScore * 0.5f)+(iScore * 0.25f));
            }
            else if(path == "Web Dev"){
                finalScore = ((wScore * 0.4f)+(cScore * 0.35f)+(iScore * 25f));
            }
            
            //Determining the status based on final score
            if(finalScore >= 85){
                status = "ACCEPTED";
            }
            else{
                status = "NOT ACCEPTED";
            }
            
            String query = "INSERT INTO `recruitment`(`name`,`path`,`writing`,`coding`,`interview`,`score`,`status`) VALUES ('" + name + "','" + path + "','" + wScore + "','" + cScore + "','" + iScore + "','" + finalScore + "','" + status + "')";
            
            ConnDB.statement = ConnDB.conn.createStatement();
            ConnDB.statement.executeUpdate(query);
            
            System.out.println("Input Success");
        }catch(Exception ex){
            System.out.println("Input Failed " + ex.getMessage());
        }
    }
    
    //Read Data Process
    public String[][] readData(){
        String data[][] = new String[20][7]; 
        try{
            int totalData = 0;
            String query = "SELECT * FROM recruitment";
                      
            ConnDB.statement = ConnDB.conn.createStatement();
            ResultSet resultSet = ConnDB.statement.executeQuery(query);
            while(resultSet.next()){
                data[totalData][0] = resultSet.getString("name");
                data[totalData][1] = resultSet.getString("path");
                data[totalData][2] = resultSet.getString("writing");
                data[totalData][3] = resultSet.getString("coding");
                data[totalData][4] = resultSet.getString("interview");
                data[totalData][5] = resultSet.getString("score");
                data[totalData][6] = resultSet.getString("status");
                totalData++;
            }
            ConnDB.statement.close();
        }catch(SQLException e){
            System.out.println("SQL Error" + e.getMessage());
        }finally{
            return data;
        }
    }
    
    //Update Data Process
    public void updateData(String name, String path, float wScore, float cScore, float iScore){
        try{
            float finalScore = 0;
            String status;
            
            //Determining the final score base on the score from user's input
            if (path == "Android Dev"){
                finalScore = ((wScore * 0.2f)+(cScore * 0.5f)+(iScore * 0.3f));
            }
            else if(path == "Web Dev"){
                finalScore = ((wScore * 0.4f)+(cScore * 0.35f)+(iScore * 0.25f));
            }
            
            //Determining the status based on final score
            if(finalScore >= 85){
                status = "ACCEPTED";
            }
            else{
                status = "NOT ACCEPTED";
            }
            
            String query = "UPDATE `recruitment` SET path= '" + path + "',"
                    + " writing= '" + wScore + "',"
                    + " coding= '" + cScore + "',"
                    + " interview= '" + iScore + "',"
                    + " score= '" + finalScore + "',"
                    + " status= '" + status + "' WHERE name = '" + name + "'";
            
            ConnDB.statement = ConnDB.conn.createStatement();
            ConnDB.statement.executeUpdate(query);
            
            System.out.println("Update Success");
        }catch(Exception ex){
            System.out.println("Update Failed : " + ex.getMessage());
        }
    }
    
    //Delete Data Process
    public void deleteData(String n){
        try{
            String query = "DELETE FROM `recruitment` WHERE name='" + n + "'";
            
            ConnDB.statement = ConnDB.conn.createStatement();
            ConnDB.statement.executeUpdate(query);
            
            System.out.println("Delete Success");
        }catch(Exception ex){
            System.out.println("Delete Failed : " + ex.getMessage());
        }
    }
}
