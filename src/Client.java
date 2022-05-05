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

            //PERTANYAAN 1
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

            //PERTANYAAN 2

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

            //PERTANYAAN 3

            String question_3 = dis.readUTF();
            System.out.println(question_3);

            String question_3_opt = dis.readUTF();
            System.out.println(question_3_opt);

            input = sc.next();
            System.out.println(input);
            dos.writeUTF(input);
            dos.flush();
            String res3 = dis.readUTF();

            if(res3.equals("Correct!")){
                System.out.println(res3);
                point++;
            }
            else{
                System.out.println(res3);
                point--;
            }

            //PERTANYAAN 4

            String question_4 = dis.readUTF();
            System.out.println(question_4);

            String question_4_opt = dis.readUTF();
            System.out.println(question_4_opt);

            input = sc.next();
            System.out.println(input);
            dos.writeUTF(input);
            dos.flush();
            String res4 = dis.readUTF();

            if(res4.equals("Correct!")){
                System.out.println(res4);
                point++;
            }
            else{
                System.out.println(res4);
                point--;
            }

            //PERTANYAAN 5

            String question_5 = dis.readUTF();
            System.out.println(question_5);

            String question_5_opt = dis.readUTF();
            System.out.println(question_5_opt);

            input = sc.next();
            System.out.println(input);
            dos.writeUTF(input);
            dos.flush();
            String res5 = dis.readUTF();

            if(res5.equals("Correct!")){
                System.out.println(res5);
                point++;
            }
            else{
                System.out.println(res5);
                point--;
            }

            //PERTANYAAN 6

            String question_6 = dis.readUTF();
            System.out.println(question_6);

            String question_6_opt = dis.readUTF();
            System.out.println(question_6_opt);

            input = sc.next();
            System.out.println(input);
            dos.writeUTF(input);
            dos.flush();
            String res6 = dis.readUTF();

            if(res6.equals("Correct!")){
                System.out.println(res6);
                point++;
            }
            else{
                System.out.println(res6);
                point--;
            }

            //PERTANYAAN 7

            String question_7 = dis.readUTF();
            System.out.println(question_7);

            String question_7_opt = dis.readUTF();
            System.out.println(question_7_opt);

            input = sc.next();
            System.out.println(input);
            dos.writeUTF(input);
            dos.flush();
            String res7 = dis.readUTF();

            if(res7.equals("Correct!")){
                System.out.println(res7);
                point++;
            }
            else{
                System.out.println(res7);
                point--;
            }

            //PERTANYAAN 8

            String question_8 = dis.readUTF();
            System.out.println(question_8);

            String question_8_opt = dis.readUTF();
            System.out.println(question_8_opt);

            input = sc.next();
            System.out.println(input);
            dos.writeUTF(input);
            dos.flush();
            String res8 = dis.readUTF();

            if(res8.equals("Correct!")){
                System.out.println(res8);
                point++;
            }
            else{
                System.out.println(res8);
                point--;
            }

            //PERTANYAAN 4

            String question_9 = dis.readUTF();
            System.out.println(question_9);

            String question_9_opt = dis.readUTF();
            System.out.println(question_9_opt);

            input = sc.next();
            System.out.println(input);
            dos.writeUTF(input);
            dos.flush();
            String res9 = dis.readUTF();

            if(res9.equals("Correct!")){
                System.out.println(res9);
                point++;
            }
            else{
                System.out.println(res9);
                point--;
            }

            //PERTANYAAN 10

            String question_10 = dis.readUTF();
            System.out.println(question_10);

            String question_10_opt = dis.readUTF();
            System.out.println(question_10_opt);

            input = sc.next();
            System.out.println(input);
            dos.writeUTF(input);
            dos.flush();
            String res10 = dis.readUTF();

            if(res10.equals("Correct!")){
                System.out.println(res10);
                point++;
            }
            else{
                System.out.println(res10);
                point--;
            }

            String overall_point = Integer.toString(point);
            point= 0;
            System.out.println("Your final score: "+overall_point);

            client.close();
        }
    }

}
