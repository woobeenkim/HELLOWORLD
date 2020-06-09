package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws IOException
	{
	Socket s =new Socket();
		
		System.out.println("<클라이언트 시작>");
		System.out.println("======================");
		System.out.println("[서버에 연결을 요청합니다.]");

		s.connect(new InetSocketAddress("192.168.0.134",10001));
		System.out.println("서버연결 성공!");
		
		OutputStream os = s.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os,"UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		bw.write("hi 안녕하세요.");
		bw.newLine();
		bw.flush();
		
		
		//클라이언트 메세지 보내기용
		InputStream is = s.getInputStream();
		InputStreamReader isr = new InputStreamReader(is,"UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		
		//키보드 입력
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			String msg = sc.nextLine();
			if("/q".equals(msg))
			{
				System.out.println("[접속 종료되었습니다.]");
				break;
			}
			
			//클라이언트 메세지 보내기
			
			bw.write(msg);
			bw.newLine();
			bw.flush();
			
			//클라이언트 메세지 받기
			String reMsg = br.readLine();
			System.out.println("server : ["+reMsg+"]");
			
		}
		
		System.out.println("<클라이언트를 종료합니다.>");
		sc.close();
		br.close();
		bw.close();
		s.close();
	}
}
