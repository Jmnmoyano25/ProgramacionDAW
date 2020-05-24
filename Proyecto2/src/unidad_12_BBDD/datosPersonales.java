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

public class datosPersonales {

	public static void main(String[] args) {
		

		try {
			//estableciendo conexión
            String connection =  "jdbc:mysql://localhost/bd1?user=root&password=2505&useLegacyDatetimeCode=false&serverTimezone=UTC";
            Connection con = DriverManager.getConnection(connection);            
            Statement s= con.createStatement();
            
            //insertando valores
           // s.executeUpdate("INSERT INTO datospersonales VALUES ('12345678Z', 'Luke', 'Skywalker Jedi', 35)");
           
            //borrar un registro
           s.executeUpdate("DELETE FROM datospersonales WHERE NOMBRE = 'Rosa' AND APELLIDO = 'López Sanjuan'");
            
            //actualizar un dato
           s.executeUpdate("UPDATE datospersonales SET edad=120 WHERE NOMBRE = 'Manolo' AND APELLIDO = 'González Ariza'");
            
            //mostramos valores....
            ResultSet rs3 = s.executeQuery("SELECT DNI, NOMBRE, APELLIDO, EDAD FROM DATOSPERSONALES");			
			while (rs3.next()) {
				System.out.println(rs3.getString(1) + " " + rs3.getString(2)+" "+ rs3.getString(3)+" "+ rs3.getInt(4)+" ");
			}
			con.commit();
            con.close();
        }catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getErrorCode());            
        }

	}
}