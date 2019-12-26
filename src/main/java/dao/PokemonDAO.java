package dao;

import java.util.List;

import model.Pokemon;

public interface PokemonDAO {
	public Pokemon getPokemon(int p_id);
	public List<Pokemon> getAllPokemon();
	public boolean updatePokemon(String name, String type, int p_id);
	public boolean deletePokemon(int p_id);
	public boolean createPokemon(Pokemon p);
	
}
