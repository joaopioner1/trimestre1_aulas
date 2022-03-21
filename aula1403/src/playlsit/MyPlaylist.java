package playlsit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class MyPlaylist {
	
	ArrayList<String> songNames = new ArrayList<>();

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner / 14/03/2022
		new MyPlaylist().showSongs();
	}
	
	public void readSongs() {
		try {
			File file = new File("minhas_musicas.txt");
			BufferedReader reader = new BufferedReader(new FileReader("minhas_musicas.txt"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				addSong(line);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addSong(String song) {
		String[] list = song.split("/");
		songNames.add(list[0]);
	}
	
	public void showSongs() {
		for (String a : songNames) {
			System.out.println(a);
		}
	}

}
