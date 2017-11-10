package Controller;

import java.io.File;

import Utils.XMLSerializer;

public class Main {
	
	public static void main(String[]args) throws Exception
	{
		File datastore = new File("datastorea.xml");
		XMLSerializer serializer = new XMLSerializer(datastore);
		
		RecommenderAPI Recommendor= new RecomenderAPI(serializer);
		if (datastore.isFile())
		{
			recommender.load())
		}
		else
		{
			recommender.InitialLoad();
		}
		
		RecommenderAPI.addUser("Aaron", "Cosulich", 22, "M", "President" , 21234);
		RecommenderAPI.addUser("Steve", "Irwin", 48, "M", "Crocodile Hunter", 22445);
		RecommenderAPI.addUser("Freddy", "Mercury", 64, "M", "Singer", 21224);
		
		
	}

}
