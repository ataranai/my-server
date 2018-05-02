package test.simple.server;

import java.net.Socket;
import java.net.ServerSocket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;

public class App 
{
    	private static final int SERVER_PORT = 8080;
	 
	public static void main(String args[]) {
		ServerSocket serverSocket = null;
		Socket socket = null;
	    try {
	      serverSocket = new ServerSocket(SERVER_PORT);
	      while (true) {
	    	  System.out.println("-- simple SampleServer start");
	    	  socket = serverSocket.accept();
	    	  socket.close();
	    	  System.out.println("-- simple SampleServer end");
	      }
	    }catch (IOException e) {
			e.printStackTrace();
		}
	}
}
