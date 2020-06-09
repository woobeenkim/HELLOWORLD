package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ServerThread extends Thread{
	
	private Socket s;
	
	public ServerThread(Socket s)
	{
		this.s = s;
	}
	
	public void run()
	{
		try {
		//서버 메세지 받기용 스트림		
		InputStream is = s.getInputStream();
		InputStreamReader isr = new InputStreamReader(is,"UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		
		//서버 메세지 보내기용 스트림
		OutputStream os = s.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os,"UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);

		while(true)
		{
			//서버 메세지 받기
			String msg = br.readLine();
			System.out.println("받은메세지 : "+ msg);
			
			if(msg == null)
			{
				System.out.println("클라이언트 접속 종료");
				break;
			}
			
			//서버메세지 보내기
			bw.write(msg);
			bw.newLine();
			bw.flush();
		}
		System.out.println("<서버를 종료합니다.>");
		bw.close();
		br.close();
		}
		catch(IOException e)
		{
			System.out.println("예외상황발생");
		}
		System.out.println("[클라이언트가 연결되었습니다.]");
	}
	
	
}
