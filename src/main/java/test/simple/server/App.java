package test.simple.server;

import java.net.*;
import java.io.*;
import java.util.*;

public class App 
{
    private static final int SERVER_PORT = 8080;
    
    public static String messages[]  = {
	"********************************",
	"****  Welcome to My Server! ****",
	"********************************",
    };
    
    public static void main(String args[]) {
	ServerSocket serverSocket = null;
	Socket socket = null;
	try {
	    serverSocket = new ServerSocket(SERVER_PORT);
	    while (true) {
		System.out.println("-- simple SampleServer start");
		socket = serverSocket.accept();
                BufferedWriter bufwriter
		    = new BufferedWriter(
					 new OutputStreamWriter(socket.getOutputStream()));
		for(int i=0; i<messages.length; i++ ){
		    bufwriter.write(messages[i], 0, messages[i].length());
		    bufwriter.newLine();
		}
		bufwriter.close();
		socket.close();
		System.out.println("-- simple SampleServer end");
	    }
	}catch (IOException e) {
	    e.printStackTrace();
	}
    }
}
