package Model;

import java.util.Objects;
import static com.google.common.base.MoreObjects.toStringHelper;

public class User {
	static long counter = 01;
	
	public long Id;
	public String FirstName;
	public String LastName; 
	public String Gender; 
	public String Occupation;
	public int Age;
	

	
public User(String FirstName, String LastName, String Gender, String Occupation, int Age)
{
	this.Id = counter++; 
	this.FirstName = FirstName; 
	this.LastName = LastName; 
	this.Gender = Gender; 
	this.Occupation = Occupation; 
	this.Age = Age;
}

public String toString()
{
	return toStringHelper(this).addValue(Id)
							   .addValue(FirstName)
							   .addValue(LastName)
							   .addValue(Gender)
							   .addValue(Occupation)
							   .addValue(Age)
							   .toString();
	
	
							   
}

@Override
public boolean equals(final Object obj)
{
	if (obj instanceof User)
	{
		final User other = (User) obj;
		return Objects.equals(Id, other.Id)
	    && Objects.equals(FirstName, other.FirstName)
	    && Objects.equals(LastName, other.LastName)
	    && Objects.equals(Gender, other.Gender)
	    && Objects.equals(Occupation, other.Occupation)
	    && Objects.equals(Age, other.Age);
		}
	else
	{
		return false;
				
	}
}
}
