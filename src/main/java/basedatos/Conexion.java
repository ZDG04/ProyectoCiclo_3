package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

Connection cnn;

public Connection conexionbd() {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try {
			cnn=DriverManager.getConnection("jdbc:mysql://localhost/tienda","root","");
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"Conexion ok");
		}
	} catch (ClassNotFoundException e) {
			e.printStackTrace();
	}
return cnn;	
	
}

}
