import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     try (FileWriter fileWriter=new FileWriter("alphabet.txt")){
         StringBuilder stringBuilder = new StringBuilder();
         char A= 'A';
         char Z = 'Z';
         char a='a';
         char z= 'z';
         while (A<=Z && a<=z){
             stringBuilder.append(A+""+a+"\n");
             A++;
             a++;
         }
         fileWriter.write(String.valueOf(stringBuilder));

         for (int i = 0; i <=9 ; i++) {
             fileWriter.write(i+"\n");
         }
     }catch (IOException e){
        e.getMessage();
     }

     try (FileReader fileReader=new FileReader("alphabet.txt")){
         Scanner scanner=new Scanner(fileReader);
         int i = 0;
         while (scanner.hasNext()){
             i++;
             System.out.println(i+":"+scanner.nextLine());
         }

     }catch (IOException e){
         e.getMessage();
     }
    }
}