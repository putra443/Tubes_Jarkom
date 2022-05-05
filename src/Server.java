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

            String question_1 = "Berapa hasil 1+1?";
            String question_1_opt_1 = "2";
            String question_1_opt_2 = "3";
            String question_1_opt_3 = "5";
            String question_1_opt_4 = "11";
            String res1="";
            dos.writeUTF(question_1);
            dos.flush();
            dos.writeUTF("a. " + question_1_opt_1 + " , " + "b. " + question_1_opt_2 + " , " + "c. " + question_1_opt_3 + " , " + "d. " + question_1_opt_4);
            dos.flush();

            String input1 = dis.readUTF();

            if(input1.equals("a") || input1.equals("A")){
                res1 = "Correct!";
                dos.writeUTF(res1);
                dos.flush();
                System.out.println(res1);
            }
            else {
                res1 = "U are wrong, Better luck Next Time";
                dos.writeUTF(res1);
                dos.flush();
            }


            String question_2 = "Berapa hasil 2 pangkat 2?";
            String question_2_opt_1 = "2";
            String question_2_opt_2 = "4";
            String question_2_opt_3 = "5";
            String question_2_opt_4 = "7";
            String res2 = "";
            dos.writeUTF(question_2);
            dos.flush();
            dos.writeUTF("a. " + question_2_opt_1 + " , " + "b. " + question_2_opt_2 + " , " + "c. " + question_2_opt_3 + " , " + "d. " + question_2_opt_4);
            dos.flush();

            String input2 = dis.readUTF();
            System.out.println(input1);
            System.out.println(input2);
            if(input2.equals("b") || input2.equals("B")){
                res2 = "Correct";
                dos.writeUTF(res2);
                dos.flush();
                System.out.println(res2);
            }
            else {
                res2 = "U are wrong, Better luck Next Time";
                dos.writeUTF(res2);
                dos.flush();
                System.out.println(res2);
            }

        }
    }
}
