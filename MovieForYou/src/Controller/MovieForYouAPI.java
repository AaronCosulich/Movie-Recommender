package Controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import com.google.common.base.Objects;
import javax.jws.soap.SOAPBinding.Use;

import Model.Movie;
import Model.Rating;
import Model.User;

public class MovieForYouAPI {
	
	private Map<Long, Movie> movieindex = new HashMap<>();
	private Map<Long, User> userindex = new HashMap<>();
	private Map<Long, Rating> ratingindex = new HashMap<>();
	
	public Collection<Movie> getMovies()
	{
		return movieindex.values();
	}
	
	public Collection<User> getUsers()
	{
		return userindex.values();
	}
	
	public Collection<Rating> getRatings()
	{
		return ratingindex.values();
	}
	
	public Movie getMovie(Long MovieId)
	{
		return movieindex.get(MovieId);
	}
	
	public Movie getMovieByTitle(String title)
	{
		return movieindex.get(title);
	}
	
	public Movie removeMovie (Movie movie)
	{
		return movieindex.remove(movie.GetMovieId());
	}

	public User getUser(Long Id)
	{
		return userindex.get(Id);
	}
	
	public User removeUser(User user)
	{
		return userindex.remove(user.userId);
	}
	
	public User addUser(String FirstName, String LastName, String Gender, String occupation, int Age)
	{
		User users;
		users = new User(FirstName, LastName, Gender,occupation, Age);
		userindex.put(users.Id,users);
		return users;
	}
	
	public Rating addRating(int Rating , Long Id , Long MovieId)
	{
		User users;
		Rating ratings;
		ratings = new Rating(Rating,Id,MovieId);
		ratingindex.put(users.Id,ratings);
		return ratings;
		
		
		
	}
	
	public Movie addMovie(String Url, String Title, int Year)
	{
		Movie movies = new Movie(Url, Title, Year);
		movieindex.put(movies.MovieId, movies);
		return movies;
	}
	
	public Rating getRating(Long userId)
	{
		return ratingindex.get(userId);
	}
	
}
