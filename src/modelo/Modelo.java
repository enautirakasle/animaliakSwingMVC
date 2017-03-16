package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Modelo extends Conector{

	public ArrayList <Animal> select(){
		ArrayList<Animal> animales = new ArrayList<Animal>(); 
		try {
			Statement st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from animales");
			while(rs.next()){
				Animal animal = new Animal();
				animal.setId(rs.getInt("id"));
				animal.setNombre(rs.getString("nombre"));
				
				animales.add(animal);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return animales;
	}
	
	
	public void insert(Animal animal){
		try {
			PreparedStatement ps = this.conexion.prepareStatement("insert into animales (nombre) values(?)");
			ps.setString(1, animal.getNombre()); 
		
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
