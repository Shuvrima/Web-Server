package demo;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
	
	ServerSocket serverSocket;
	//entry point for our progress
	public static void main(String[] args) throws Exception{
		new Main().runServer(); // to avoid any problem with Static fields
		
	}
	public void runServer() throws Exception {
         serverSocket= new ServerSocket(8080);//port number at which server is running
	      acceptRequests();}
	public void acceptRequests() throws Exception{  //to accept requests
		while(true) {
			Socket s = serverSocket.accept();     //connections are in form of socket
			Connection ch = new Connection(s);   // for starting our thread
			ch.start(); //will call our run method
}
}
}