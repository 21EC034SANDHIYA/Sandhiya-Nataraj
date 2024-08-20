import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Prj1{
    public static void main(String[] args){
        String URL="jdbc:mysql://localhost:3306/Students";
        String USER="root";
        String PASSWORD="sandy";
        try{
            Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Success");
            Statement selectStatement=con.createStatement();
            //create table
            String createTableSQL="CREATE TABLE Person("
            +"renewalId INT AUTO_INCREMENT PRIMARY KEY,"
            +"F_Name VARCHAR(20) NOT NULL,"
            +"L_Name VARCHAR(18)NOT NULL,"
            +"Email VARCHAR(35)NOT NULL,"
            +"Rnw_date DATE NOT NULL"+")";
            selectStatement.executeUpdate(createTableSQL);
            System.out.println("Table created successfully");

        }
        catch(SQLException exx){
            System.out.println(exx);
        }
    }
}