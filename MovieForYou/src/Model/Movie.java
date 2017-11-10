package Model;

import static com.google.common.base.MoreObjects.toStringHelper;
import com.google.common.base.Objects;

public class Movie {
	
	static Long counter = 0l;
	public String Url; 
	public String Title; 
	public String date;
	public Long MovieId;
	
	public Movie(String Url, String Title, String date) 
	{
		this.Url = Url;
		this.Title = Title;
		this.date = date; 
		this.MovieId = counter++;
	}
	
	public String toString() 
	{
		return toStringHelper(this).addValue(Url)
				                   .addValue(Title)
				                   .addValue(date)
				                   .toString();
	}
	
	public String GetMovieTitle()
	{
		return Title;
	}
	
	public Long GetMovieId()
	{
		return MovieId;
	}
	  @Override
	  public boolean equals(final Object obj)
	  {
	    if (obj instanceof Movie)
	    {
	      final Movie other = (Movie) obj;
	      return Objects.equal(Url, other.Url) 
	          && Objects.equal(Title,  other.Title)
	          && Objects.equal(date,     other.date)
	          && Objects.equal(MovieId,  other.MovieId);
	          
	    }
	    else
	    {
	      return false;
}
	    
}
	
	
}
