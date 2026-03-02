package exs.ex2;

public class testaStreaming {
    public static void main(String[] args){
        Streaming streaming = new Streaming("caue", "Premium");

        streaming.assistirFilme("Interestrelar");
        System.out.println(streaming.toString());

    }
}
