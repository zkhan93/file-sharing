import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

class FServer {
	public static int BUFFER_SIZE=16*1024;
	public static int PORT=8932;
	public static void main(String args[]) throws Exception{
		ServerSocket serverSocket=new ServerSocket(PORT);
		Socket socket =serverSocket.accept();
		System.out.println("Accepted connection"+socket);
		
		serveFile(socket,args[0]);
	}
	private static void serveFile(Socket socket,String filename) throws Exception {
        InputStream in = new FileInputStream(new File(filename));
		OutputStream out=socket.getOutputStream();
		byte[] buffer=new byte[BUFFER_SIZE];
		int bytesRead;
		while((bytesRead=in.read(buffer))>0){
			out.write(buffer,0,bytesRead);
		}
		out.close();
		in.close();
		socket.close();
    }
}