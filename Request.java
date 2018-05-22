package demo;

public class Request {
		String filename;
		
		//constructor that accepts string
		
		public Request(String request ) {                              
			String lines[] = request.split("\n"); //getting all lines of request separately
			filename= lines[0].split(" ")[1];     //this line basically splits the first line using space and then chooses second item
			
		}
		
	

}
