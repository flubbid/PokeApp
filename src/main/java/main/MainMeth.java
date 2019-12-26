package main;

import java.util.List;
import java.util.Scanner;

import model.Pokemon;
import service.PokemonService;

public class MainMeth {

	public static void main(String[] args) {

//	
		Pokemon c = PokemonService.getPokemon(8);
//		
		System.out.println(c);
//		
//		List<Pokemon> pokemon = PokemonService.getAllPokemon();
//		
//		pokemon.forEach(System.out::println);
		
//		PokemonService.updatePokemon("BubbaJeake", "JimbePop", 11);
		
		
//		PokemonService.deleteCar(11);
//	
//		Scanner reader = new Scanner(System.in);
//		System.out.println("Enter Name");
//		String name = reader.nextLine();
//		System.out.println("Enter Type");
//		String type = reader.nextLine();
//		
//		Pokemon p2 = new Pokemon(name, type);
//		
//		PokemonService.createPokemon(p2);
//		
		PokemonService.getAllPokemon().forEach(System.out::println);
		
		
	}

}
