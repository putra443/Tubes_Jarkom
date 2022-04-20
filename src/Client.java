import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class Client {

    public static void main (String[] args) throws IOException{
        InetAddress ip =InetAddress.getLocalHost();
        int port = 4444;
        Scanner sc = new Scanner(System.in);


        Socket s = new Socket(ip,port);


        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        while(true){
            System.out.println("Masukkan bilangan bulat");

            String input = sc.next();

            if(input.equals("0")){
                break;
            }


            dos.writeUTF(input);


            String ans = dis.readUTF();
            System.out.println("Answer = " + ans);

        }
    }

}
