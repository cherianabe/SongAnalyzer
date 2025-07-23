import java.util.*;
import java.io.*; 

public class Main
{
	public static void main(String[] args) throws IOException
	{
		List<Song> favoriteSongs = SongReader.readSongs("favorite_songs.csv");
		SongGenerator.generateSong(favoriteSongs);





	}
}