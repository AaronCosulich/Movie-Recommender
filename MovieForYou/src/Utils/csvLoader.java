package Utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import Model.Movie;
import Model.Rating;
import Model.User;
import edu.princeton.cs.introcs.In;

public class csvLoader {
	
	public List<Movie> loadMovie(String filename) throws Exception
	{
		File movieFile = new File(filename);
		In inmovie = new In(movieFile);
		String delims = "[|]";
		List<Movie> upmovie = new ArrayList<Movie>();
		while(!inmovie.isEmpty())
		{
			String moviedet = inmovie.readLine();
			String[] movieadd = moviedet.split(delims);
			if(movieadd.length == 23)
			{
				
				String Title = movieadd[1];
				String date = movieadd[2];
				String Url = movieadd[3];
			    upmovie.add(new Movie(Title, Url, date));
			    
			}
			else
				
			{
				throw new Exception("Invalid Movie length: "+movieadd.length);
			}
		}
		return upmovie;
	}
		
		
	public List<Rating> loadRating(String filename) throws Exception
		{
			File ratingFile = new File(filename);
			In inrating = new In(ratingFile);
			String delims = "[|]";
			List<Rating> uprating = new ArrayList<Rating>();
			while(!inrating.isEmpty())
			{
				String ratingdet = inrating.readLine();
				String[] ratingadd = ratingdet.split(delims);
				if(ratingadd.length == 4)
				{
					int Rating = Integer.valueOf(ratingadd[1]);
					Long Id = Long.valueOf(ratingadd[2]);
					Long MovieId = Long.valueOf(ratingadd[3]);
				    uprating.add(new Rating(Rating, Id, MovieId));
				    
				    
				}
				else
				{
					throw new Exception("Invalid Movie length: "+ratingadd.length);
				}
			}
			return uprating;
	}

	
	public List<User> loadUser(String filename) throws Exception
	{
		File userFile = new File(filename);
		In inuser = new In(userFile);
		String delims = "[|]";
		List<User> upuser = new ArrayList<User>();
		while(!inuser.isEmpty())
		{
			String userdet = inuser.readLine();
			String[] useradd = userdet.split(delims);
			if(useradd.length == 7)
			{
				String FirstName = useradd[1];
				String LastName = useradd[2];
				int Age = Integer.valueOf(useradd[3]);
				String Gender = useradd[4];
				String Occupation = useradd[5];	
			    upuser.add(new User(FirstName, LastName, Gender, Occupation, Age));
			    
			    
			}
			else
			{
				throw new Exception("Invalid Rating length: "+useradd.length);
			}
		}
		return upuser;
	}

	
	

}