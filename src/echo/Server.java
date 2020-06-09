package echo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException
	{
		ServerSocket SK = new ServerSocket();
		SK.bind(new InetSocketAddress("192.168.0.134",10001));
		
		System.out.println("<서버 시작>");
		System.out.println("======================");
		
		//반복적으로 소켓을 만들어서 여러명 만들기.
		
		while(true)
		{
			System.out.println("[연결을 기다리고 있습니다.]");

			Socket s = SK.accept();
			Thread t = new ServerThread(s);
			t.start();
		}
		
		
	
	//	System.out.println("<서버를 종료합니다.>");
		
	}

}
