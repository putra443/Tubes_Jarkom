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
            
            //PERTANYAAN 1
            String question_1 = "Berapa hasil 1+1?";
            String question_1_opt_1 = "2";
            String question_1_opt_2 = "3";
            String question_1_opt_3 = "5";
            String question_1_opt_4 = "11";
            String res1="";
            dos.writeUTF(question_1);
            dos.flush();
            dos.writeUTF("A. " + question_1_opt_1 + " , " + "B. " + question_1_opt_2 + " , " + "C. " + question_1_opt_3 + " , " + "D. " + question_1_opt_4);
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

            //PERTANYAAN 2
            String question_2 = "Berapa hasil 2 pangkat 2?";
            String question_2_opt_1 = "2";
            String question_2_opt_2 = "4";
            String question_2_opt_3 = "5";
            String question_2_opt_4 = "7";
            String res2 = "";
            dos.writeUTF(question_2);
            dos.flush();
            dos.writeUTF("A. " + question_2_opt_1 + " , " + "B. " + question_2_opt_2 + " , " + "C. " + question_2_opt_3 + " , " + "D. " + question_2_opt_4);
            dos.flush();

            String input2 = dis.readUTF();

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

            //PERTANYAAN 3
            String question_3 = "Berapa hasil 4 x 2 - 1?";
            String question_3_opt_1 = "2";
            String question_3_opt_2 = "3";
            String question_3_opt_3 = "5";
            String question_3_opt_4 = "7";
            String res3 = "";
            dos.writeUTF(question_3);
            dos.flush();
            dos.writeUTF("A. " + question_3_opt_1 + " , " + "B. " + question_3_opt_2 + " , " + "C. " + question_3_opt_3 + " , " + "D. " + question_3_opt_4);
            dos.flush();

            String input3 = dis.readUTF();

            if(input3.equals("d") || input3.equals("D")){
                res3 = "Correct";
                dos.writeUTF(res3);
                dos.flush();
                System.out.println(res3);
            }
            else {
                res3 = "U are wrong, Better luck Next Time";
                dos.writeUTF(res3);
                dos.flush();
                System.out.println(res3);
            }

            //PERTANYAAN 4
            String question_4 = "Berapa akar dari 9?";
            String question_4_opt_1 = "2";
            String question_4_opt_2 = "3";
            String question_4_opt_3 = "5";
            String question_4_opt_4 = "9";
            String res4 = "";
            dos.writeUTF(question_4);
            dos.flush();
            dos.writeUTF("A. " + question_4_opt_1 + " , " + "B. " + question_4_opt_2 + " , " + "C. " + question_4_opt_3 + " , " + "D. " + question_4_opt_4);
            dos.flush();

            String input4 = dis.readUTF();

            if(input4.equals("b") || input4.equals("B")){
                res4 = "Correct";
                dos.writeUTF(res4);
                dos.flush();
                System.out.println(res4);
            }
            else {
                res4 = "U are wrong, Better luck Next Time";
                dos.writeUTF(res4);
                dos.flush();
                System.out.println(res4);
            }

            //PERTANYAAN 5
            String question_5 = "Berapa hasil 7 dibagi 2?";
            String question_5_opt_1 = "2.5";
            String question_5_opt_2 = "3.5";
            String question_5_opt_3 = "4.5";
            String question_5_opt_4 = "0";
            String res5 = "";
            dos.writeUTF(question_5);
            dos.flush();
            dos.writeUTF("A. " + question_5_opt_1 + " , " + "B. " + question_5_opt_2 + " , " + "C. " + question_5_opt_3 + " , " + "D. " + question_5_opt_4);
            dos.flush();

            String input5 = dis.readUTF();

            if(input5.equals("b") || input5.equals("B")){
                res5 = "Correct";
                dos.writeUTF(res5);
                dos.flush();
                System.out.println(res5);
            }
            else {
                res5 = "U are wrong, Better luck Next Time";
                dos.writeUTF(res5);
                dos.flush();
                System.out.println(res5);
            }

            //PERTANYAAN 6
            String question_6 = "Berapa hasil 10 modulo 2?";
            String question_6_opt_1 = "2";
            String question_6_opt_2 = "3";
            String question_6_opt_3 = "0";
            String question_6_opt_4 = "7";
            String res6 = "";
            dos.writeUTF(question_6);
            dos.flush();
            dos.writeUTF("A. " + question_6_opt_1 + " , " + "B. " + question_6_opt_2 + " , " + "C. " + question_6_opt_3 + " , " + "D. " + question_6_opt_4);
            dos.flush();

            String input6 = dis.readUTF();

            if(input6.equals("c") || input6.equals("C")){
                res6 = "Correct";
                dos.writeUTF(res6);
                dos.flush();
                System.out.println(res6);
            }
            else {
                res6 = "U are wrong, Better luck Next Time";
                dos.writeUTF(res6);
                dos.flush();
                System.out.println(res6);
            }

             //PERTANYAAN 7
            String question_7 = "Berapa 5 dikali 0.5?";
            String question_7_opt_1 = "2.5";
            String question_7_opt_2 = "3.5";
            String question_7_opt_3 = "5";
            String question_7_opt_4 = "5.5";
            String res7 = "";
            dos.writeUTF(question_7);
            dos.flush();
            dos.writeUTF("A. " + question_7_opt_1 + " , " + "B. " + question_7_opt_2 + " , " + "C. " + question_7_opt_3 + " , " + "D. " + question_7_opt_4);
            dos.flush();

            String input7 = dis.readUTF();

            if(input7.equals("a") || input7.equals("A")){
                res7 = "Correct";
                dos.writeUTF(res7);
                dos.flush();
                System.out.println(res7);
            }
            else {
                res7 = "U are wrong, Better luck Next Time";
                dos.writeUTF(res7);
                dos.flush();
                System.out.println(res7);
            }

             //PERTANYAAN 8
            String question_8 = "Berapa hasil 34 + 35?";
            String question_8_opt_1 = "70";
            String question_8_opt_2 = "69";
            String question_8_opt_3 = "67";
            String question_8_opt_4 = "66";
            String res8 = "";
            dos.writeUTF(question_8);
            dos.flush();
            dos.writeUTF("A. " + question_8_opt_1 + " , " + "B. " + question_8_opt_2 + " , " + "C. " + question_8_opt_3 + " , " + "D. " + question_8_opt_4);
            dos.flush();

            String input8 = dis.readUTF();

            if(input8.equals("b") || input8.equals("B")){
                res8 = "Correct";
                dos.writeUTF(res8);
                dos.flush();
                System.out.println(res8);
            }
            else {
                res8 = "U are wrong, Better luck Next Time";
                dos.writeUTF(res8);
                dos.flush();
                System.out.println(res8);
            }

             //PERTANYAAN 9
            String question_9 = "Berapa hasil 23 + 24 x 0?";
            String question_9_opt_1 = "27";
            String question_9_opt_2 = "47";
            String question_9_opt_3 = "24";
            String question_9_opt_4 = "23";
            String res9 = "";
            dos.writeUTF(question_9);
            dos.flush();
            dos.writeUTF("A. " + question_9_opt_1 + " , " + "B. " + question_9_opt_2 + " , " + "C. " + question_9_opt_3 + " , " + "D. " + question_9_opt_4);
            dos.flush();

            String input9 = dis.readUTF();

            if(input9.equals("d") || input9.equals("D")){
                res9 = "Correct";
                dos.writeUTF(res9);
                dos.flush();
                System.out.println(res9);
            }
            else {
                res9 = "U are wrong, Better luck Next Time";
                dos.writeUTF(res9);
                dos.flush();
                System.out.println(res9);
            }

             //PERTANYAAN 10
            String question_10 = "Berapa 45 - 77 + 33?";
            String question_10_opt_1 = "34";
            String question_10_opt_2 = "1";
            String question_10_opt_3 = "-1";
            String question_10_opt_4 = "-32";
            String res10 = "";
            dos.writeUTF(question_10);
            dos.flush();
            dos.writeUTF("A. " + question_10_opt_1 + " , " + "B. " + question_10_opt_2 + " , " + "C. " + question_10_opt_3 + " , " + "D. " + question_10_opt_4);
            dos.flush();

            String input10 = dis.readUTF();

            if(input10.equals("b") || input10.equals("B")){
                res10 = "Correct";
                dos.writeUTF(res10);
                dos.flush();
                System.out.println(res10);
            }
            else {
                res10 = "U are wrong, Better luck Next Time";
                dos.writeUTF(res10);
                dos.flush();
                System.out.println(res10);
            }
        }
    }
}
