package webservice;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import dao.PokemonDAOImpl;
import model.Pokemon;
import service.PokemonService;
import utils.JDBC;

public class PokemonWebService {
	
	public static Connection conn = JDBC.getConnection();
	
	public static void getPokemon(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("p_id"));
		PokemonDAOImpl pi = new PokemonDAOImpl();
//		System.out.println(pi.getAllPokemon());
//		System.out.println(id);
		PokemonService.getAllPokemon().forEach(System.out::println);
		
//		Pokemon p = PokemonService.getPokemon(id);
//		System.out.println(p);
		ObjectMapper om = new ObjectMapper();
		System.out.println("Working2");
//		try {
////			String pokemonJSON = om.writeValueAsString(p);
//			System.out.println("Working3");
////			response.getWriter().append(pokemonJSON);
//			System.out.println("Working4");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
	
//	We need another method in our webservice to handle
//	adding pokemon. We already have a Service method
//	to do such. We just need to convert the info.
	
	public static void addPokemon(HttpServletRequest request, HttpServletResponse response) {
		
		//First get all 3 parameters we passed in:
//		int id = 0;			//Change this
		String name = "";	//Change this
		String type = "";	//Change this
		
		//Then we will make a Pokemon from those fields:
		Pokemon p = new Pokemon(name, type);
		
		//Call your PokemonService to add it.
		//[replace this with your call]
		
		PokemonService.createPokemon(p);
		
		//Send a simple response back in the response
		//just indicating something like:
		
		//"Pokemon added to database"
	}
}
