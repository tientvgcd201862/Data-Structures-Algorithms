import java.io.*;

import implementations.Queue;
import implementations.Stack;

public class Methods {
    public static Queue<String> queue;
    public static Stack<String> stack;

    public static String[] SendMessage() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputMessage = null;

        boolean valid = false;
        while (!valid) {
            try {
                inputMessage = br.readLine().split("\\.");
                for (String message : inputMessage) {
                    if (message.length() >= 250) {
                        throw new Exception("Max length is 250. Please try again.");
                    } else if (message.length() == 0) {
                        throw new Exception("Invalid input. Please try again.");
                    }
                }
                valid = true;
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
            }
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
