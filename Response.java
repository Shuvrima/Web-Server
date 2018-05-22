package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Response {
	Request req2;
	
	String response;  //final response generated
	
	String root = "C:/root"; //root path of the server
	
	public Response(Request request) {
		req2 = request;
		//open file in the request
		File f = new File(root + req2.filename); 
		try
		{
		
			response = "HTTP/1.1 200 OK \r\n"; //Version of http and 200 for status code
			FileInputStream f_input = new FileInputStream(f); //to read this file
			int s;
			while ((s = f_input.read()) != -1) {//-1 means end of file
			     response += (char) s;}
			}catch (FileNotFoundException e)
			{
				response = response.replace("HTTP/1.1 200 OK \r\n " , "HTTP/1.1 404 Not Found");
			
			} catch (Exception e) {
			response = response.replace("HTTP/1.1 200 OK \r\n ", "HTTP/1.1 400 Bad Request");
			
		}
		
	}

	}
