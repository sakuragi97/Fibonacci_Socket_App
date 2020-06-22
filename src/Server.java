/*************
 *
 * Developped by: YASSER EL BACHIRI
 * E-mail: yasser.elbachiri@gmail.com
 *
 *
 */


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{

    static ServerSocket serverSocket;
    static Socket socket;
    static BufferedReader bufferedReader;
    static PrintWriter printWriter;

    public static void main(String[] args) throws IOException {

        serverSocket = new ServerSocket(5757);
        socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        OutputStream outputStream = socket.getOutputStream();
        printWriter = new PrintWriter(outputStream,true);

        System.out.println("The server started, waiting client actions...");


        if(true){
            System.out.println(("Wait a little bit..."));
            String input = bufferedReader.readLine();
            System.out.println(input);
            Integer value = Integer.valueOf(input);
            System.out.println(value);
            printWriter.println("Your fibonachi number is: " + Fibonachi.fibonachi(value));
        }
    }

}