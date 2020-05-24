package unidad_12_BBDD;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.sun.jdi.connect.spi.Connection;

public class Conexion {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Apéndice de método generado automáticamente
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String conUrl = "jdbc:mysql://localhost:3306/mydb?useLegacyDatetimeCode=false&serverTimezone=UTC";
			String user      = "root";
		    String pass  = "2505";
			//obtener la conexión
			Connection con = (Connection) DriverManager.getConnection(conUrl,user,pass);
			
			/*Statement s = ((java.sql.Connection) con).createStatement();
			
			ResultSet rs = s.executeQuery("SELECT COD_DEP, NOMBRE, LOC FROM DEPART");
			
			while (rs.next()) {
				System.out.println(rs.getString("NOMBRE") + " " + rs.getString(2)+" "+ rs.getString(3)+" "+ rs.getString(4));
			}*/

		}catch (SQLException e) {
			System.out.println("SQL Exception: "+e.toString());
		}
	}

}
