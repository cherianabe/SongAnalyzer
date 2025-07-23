import java.util.List;

public class SongGenerator
{
	public static void generateSong(List<Song> songs)
	{
		for(Song song : songs)
		{
			System.out.println("Artist = " + song.getArtist() 
							+"\nTitle = " + song.getTitle()
							+"\nGenre = " + song.getGenre()
							+"\nYear Released = " + song.getYearReleased()
							+"\nDuration = " + song.getDuration()); 
		}
	
	}



}