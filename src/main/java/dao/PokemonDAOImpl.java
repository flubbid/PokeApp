package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Pokemon;
import utils.JDBC;

public class PokemonDAOImpl implements PokemonDAO {

		public static Connection conn = JDBC.getConnection();
	

	public Pokemon getPokemon(int p_id) {
	
		try {
			String sql = "SELECT * FROM Pokemon WHERE p_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, Integer.toString(p_id));
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				return new Pokemon(
						rs.getInt("P_ID"),
						rs.getString("NAME"),
						rs.getString("TYPE"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null; 
		
	}


	public List<Pokemon> getAllPokemon() {
		List<Pokemon> p = new ArrayList<Pokemon>();
		
		try {
			String sql = "SELECT * FROM Pokemon";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				p.add(new Pokemon(
						rs.getInt("P_ID"),
						rs.getString("NAME"),
						rs.getString("TYPE")
						
						));
				
			}
			return p;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	
	public boolean updatePokemon(String name, String type, int p_id) {
		String sql = "UPDATE Pokemon SET name = ?, type = ? WHERE p_id = ?";
		
		try {
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, type);
			ps.setInt(3, p_id);
		
			ps.executeQuery();
			return true;
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}


	public boolean deletePokemon(int p_id) {
		String sql = "DELETE pokemon where p_id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, Integer.toString(p_id));
			ps.executeQuery();
			
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
		
	}


	public boolean createPokemon(Pokemon p) {
		String sql = "CALL add_pokemon(?,?)";
		
		try {
			CallableStatement cs = conn.prepareCall(sql);
			cs.setString(1, p.getName());
			cs.setString(2, p.getType());
			
			cs.execute();
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
