
import implementations.Queue;
import implementations.Stack;

public class Main {
    public static Queue<String> queue = new Queue<>();
    public static Stack<String> stack = new Stack<>(); 
    public static void main(String[] args) throws Exception {
        System.out.println("Please enter your message: ");
        String[] inputMessage = Methods.SendMessage();
        double begin = System.currentTimeMillis();
        Methods.TransferMessage(inputMessage, queue);
        Methods.ProcessMessage(queue, stack);
        Methods.PrintMessage(stack);
        double end = System.currentTimeMillis();
        double time = end - begin;
        System.out.printf("\nTime: %.1f ms ", time);
    }
}


