package unidad_12_BBDD;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Conexion2 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
        try {
        	//jdbc:mysql://localhost;database=mywebsitedb;user=sa;password=thatstrue;
            String connection =  "jdbc:mysql://localhost/mydb?user=root&password=2505&useLegacyDatetimeCode=false&serverTimezone=UTC";
                    //"jdbc:mysql://localhost/javi user=root&password=";
            Connection con = DriverManager.getConnection(connection);
            Statement s= con.createStatement();
            ResultSet rs = s.executeQuery("SELECT COD_DEP, NOMBRE, LOC FROM DEPART");
			
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2)+" "+ rs.getString(3)+" ");
			}
        }catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getErrorCode());
            
        }
        
    }

}
