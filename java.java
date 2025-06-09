public class GreetUniverse {
    public static void main(String[] args) {
        MessageDispatcher.send("Salutations from the Maven Galaxy!");
    }
}

class MessageDispatcher {
    public static void send(String message) {
        System.out.println("[SYSTEM BROADCAST] >> " + message);
    }
}
