package ch01.verify;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static void main(String[] args) {
		InputStream is;
		ObjectInputStream ois;
		OutputStream os;
		ObjectOutputStream oos;
		String msg;
		try {
			ServerSocket ss = new ServerSocket(7000); //7000 = 포트번호
			System.out.println("연결중...");
			while(true) {
				Socket socket = ss.accept();
				is = socket.getInputStream();
				ois = new ObjectInputStream(is);
				msg = (String)ois.readObject();
				System.out.println(msg);
				os = socket.getOutputStream();
				oos = new ObjectOutputStream(os);
				oos.writeObject(msg);
			}
		}catch (Exception e) {
			
		}
	}

}
