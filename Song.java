public class Song
{
	private String title;
	private String artist;
	private String genre;
	private int duration;
	private int yearReleased;

	public Song(String title, String artist, String genre, int duration, int yearReleased)
	{
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		this.duration = duration;
		this.yearReleased = yearReleased;
	}

	public String getTitle()
	{
		return title;
	}

	public String getArtist()
	{
		return artist;
	}

	public String getGenre()
	{
		return genre;
	}

	public int getDuration()
	{
		return duration;
	}

	public int getYearReleased()	
	{
		return yearReleased;
	}
}