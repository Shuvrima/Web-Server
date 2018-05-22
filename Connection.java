package demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Connection extends Thread {
	Socket s;
	PrintWriter p;
	BufferedReader b;
	public Connection(Socket s) throws Exception{
		this.s=s;
		b= new 	BufferedReader(new InputStreamReader(s.getInputStream()));
		p = new PrintWriter(s.getOutputStream());
	}

	@Override
	public void run() {
	try {	
		String req ="";
		
		while (b.ready() || req.length()== 0)
			req+= (char) b.read();
		System.out.println(req);
		
		Request req1 = new Request(req);
		Response res = new Response(req1);
		
		p.write(res.response.toCharArray());
		p.close();
		b.close();
		s.close();
		
	
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
}