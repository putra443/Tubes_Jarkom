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
        int point =0;



        System.out.println("Connecting to " + ip + " on port " + port);
        Socket client = new Socket(ip,port);
        System.out.println("Just connected to" + client.getRemoteSocketAddress());


        DataInputStream dis = new DataInputStream(client.getInputStream());
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());

        while(true){
            System.out.println("Welcome to quizies");
            System.out.println("Wait for 5 seconds for the server to load up your questions");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            String question_1 = dis.readUTF();
            System.out.println(question_1);

            String question_1_opt = dis.readUTF();
            System.out.println(question_1_opt);

            String input = sc.next();
            System.out.println(input);
            dos.writeUTF(input);
            dos.flush();


            String res1 = dis.readUTF();

            if(res1.equals("Correct!")){
                System.out.println(res1);
                point++;
            }
            else {
                System.out.println(res1);
                point--;
            }


            String question_2 = dis.readUTF();
            System.out.println(question_2);

            String question_2_opt = dis.readUTF();
            System.out.println(question_2_opt);

            input = sc.next();
            System.out.println(input);
            dos.writeUTF(input);
            dos.flush();
            String res2 = dis.readUTF();

            if(res2.equals("Correct!")){
                System.out.println(res2);
                point++;
            }
            else{
                System.out.println(res2);
                point--;
            }


            String overall_point = Integer.toString(point);
            point= 0;
            System.out.println("Your final score: "+overall_point);

        }
    }

}
