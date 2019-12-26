package service;

import java.util.List;

import dao.PokemonDAO;
import dao.PokemonDAOImpl;
import model.Pokemon;

public class PokemonService {

	public static PokemonDAO pd = new PokemonDAOImpl();
	
	public static Pokemon getPokemon(int p_id) {
		return pd.getPokemon(p_id);
		
	}
	
	public static boolean updatePokemon(String name, String type, int p_id) {
		return pd.updatePokemon(name, type, p_id);
	}
	
	public static boolean deleteCar(int p_id) {
		return pd.deletePokemon(p_id);
	}
	
	public static boolean createPokemon(Pokemon p) {
		return pd.createPokemon(p);
	}

	public static List<Pokemon> getAllPokemon() {
		// TODO Auto-generated method stub
		return pd.getAllPokemon();
	}

}
