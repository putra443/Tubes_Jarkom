import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

public class Server extends Thread {

    public static void main(String [] args) throws IOException {


        ServerSocket ss = new ServerSocket(4444);
        Socket s = ss.accept();


        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        while(true){

            String question_1 = "what is black";
            String question_1_opt_1 = "black";
            String question_1_opt_2 = "yellow";
            String question_1_opt_3 = "purple";
            dos.writeUTF(question_1);
            dos.flush();
            dos.writeUTF("a. " + question_1_opt_1 + " , " + "b. " + question_1_opt_2 + " , " + "c. " + question_1_opt_3);
            dos.flush();

            String input = dis.readUTF();

            if(input.equals("a")){
                dos.writeUTF("Correct!");
            }
            else if(!input.equals("a")){
                dos.writeUTF("U are wrong, Better luck Next Time");
            }


        }
    }
}
