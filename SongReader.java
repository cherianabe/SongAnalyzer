import java.io.*;
import java.util.*;

public class SongReader{

	public static List<Song> readSongs(String filePath) throws IOException
	{
		List<Song> songs = new ArrayList<>();

		FileReader fr = new FileReader(filePath);

		BufferedReader br = new BufferedReader(fr);

		String line;

		br.readLine();

		while((line = br.readLine()) != null)
		{
			String[] parts = line.split(",");
			String title = parts[0].trim();
			String artist = parts[1].trim();
			String genre = parts[2].trim();	
			int duration = Integer.parseInt(parts[3].trim());
			int yearReleased = Integer.parseInt(parts[4].trim());

			songs.add(new Song(title, artist, genre, duration, yearReleased));
		}

		br.close();
		return songs;
	}



}