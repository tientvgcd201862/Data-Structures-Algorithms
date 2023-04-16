import java.io.*;

import implementations.Queue;
import implementations.Stack;

public class Methods {
    public static Queue<String> queue;
    public static Stack<String> stack;

    public static String[] SendMessage() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputMessage = br.readLine().split("\\.");
        int i = 0;
        while (inputMessage.length > i){
            if(inputMessage[i].length() <= 0){
                System.out.println("The message is empty. Please enter again!!!");
                inputMessage = br.readLine().split("\\.");
            }else if(inputMessage[i].length() > 250){
                System.out.println("Messages longer than 250 characters. Please enter again!!!");
                inputMessage = br.readLine().split("\\.");
            }else break;
        }
        br.close();
        return inputMessage;
    }

    public static void TransferMessage(String[] transferMessage,Queue<String> queue){
        int i = 0;
        while (i < transferMessage.length){
            queue.enqueue(transferMessage[i]);
            i++;
        }
        System.out.println("\nMessage length: " + transferMessage.length + " sentences(s)");
    }

    public static void ProcessMessage(Queue<String> queue, Stack<String> stack) {
        String character;
        while (!queue.isEmpty()) {
            character = queue.peek();
            stack.push(character);
            queue.dequeue();
        }
    }

    public static void PrintMessage(Stack<String> stack){
        String printMessage;
        System.out.println("Message received: ");
        while (!stack.isEmpty()){
            printMessage = stack.peek();
            System.out.println(printMessage + ".");
            stack.pop();
        }
    }
}
