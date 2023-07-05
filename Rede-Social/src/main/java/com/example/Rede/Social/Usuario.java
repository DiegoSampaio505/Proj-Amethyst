package com.example.Rede.Social;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;

@SpringBootApplication

public class Usuario {
	private int id;
	private String nome;
	private String foto;
	private String localizacao;
	private List<String> interesses;
	private List<Usuario> amigos;
	private List<Grupo> grupos;
	private List<Usuario> seguidores;
	
	public Usuario (int id, String nome, String foto, String localizacao, List<String> interesses, List<Usuario> amigos, List<Usuario> seguidores ) {
		this.id = id;
		this.foto = foto;
		this.localizacao = localizacao;
		this.interesses = interesses;
		this.amigos = amigos;
		this.grupos = grupos;
		this.seguidores = seguidores;
	}
	
	public void adicionarAmigo(Usuario amigo) {
		if (this == amigo || amigos.contains(amigo)) {
            System.out.println("Essa pessoa ja é sua amiga");
            return;
        }
		
		amigos.add(amigo);
		System.out.println("Amigo adicionado");
	}
	
}

