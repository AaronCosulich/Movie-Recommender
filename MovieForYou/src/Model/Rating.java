package Model;

import java.util.Objects;

import static com.google.common.base.MoreObjects.toStringHelper;


public class Rating {
	public int Rating;
	public Long Id;
	public Long MovieId;
	


public Rating(int Rating, Long Id, Long MovieId)
{
	this.Rating = Rating;
	this.MovieId = MovieId; 
	this.Id = Id;
}
public String toString()
{
	return toStringHelper(this).addValue(Id)
			                   .addValue(Rating)
			                   .addValue(MovieId)
			                   .toString();
}



@Override
public boolean equals(final Object obj)
{
  if (obj instanceof Rating)
  {
    final Rating other = (Rating) obj;
    return Objects.equals(Rating, other.Rating) 
        && Objects.equals(Id,  other.Id)
        && Objects.equals(MovieId,  other.MovieId);
        
  }
  else
  {
    return false;
}
  
}



}