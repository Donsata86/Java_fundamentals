package Hashmap;

import java.util.HashMap;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<String, String> trackList = new HashMap<String, String>();
		trackList.put("Track 1","esta es la letra del track1");
		trackList.put("Cancion 2","esta es la letra de la cancion 2" );
		trackList.put("Tema 3","esta es la letra del tema 3" );
		trackList.put("Rola 4","esta es la letra de la rola 4" );
		trackList.put("Intro","esta es la letra de la Intro" );
		trackList.put("Outro","esta es la letra del Outro" );
		
		String letra = trackList.get("Rola 4");
		System.out.println("letra de la cancion seleccionada " + letra);
		
		Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));    
        }
	}
}
