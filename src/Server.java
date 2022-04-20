import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

public class Server {

    public static void main(String [] args) throws IOException {


        ServerSocket ss = new ServerSocket(4444);
        Socket s = ss.accept();


        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        while(true){


            String input = dis.readUTF();

            if(input.equals("0")){
                break;
            }

            System.out.println("Bilangan bulat yang didapatkan :" + input);
            String res = "";



            StringTokenizer st = new StringTokenizer(input);

            int input_number = Integer.parseInt(st.nextToken());



            System.out.println("Mengirim Hasil...");

            dos.writeUTF(res);
        }
    }
}
