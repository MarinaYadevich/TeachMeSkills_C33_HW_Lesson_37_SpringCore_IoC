package applicationWithXML;

public class MessageService {
    private String name;

    public void printMessage(String name){
        System.out.println("To: " + name + "\nHello from Spring! This is a bean created via XML.");
    }
}
