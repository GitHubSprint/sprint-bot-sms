package pl.sprint.sms;

public class Main implements SmsInterface {
    public static void main(String[] args) {
        SmsInterface m = new Main();
        System.out.println(m.sendSimpleMessage("123456789","883382826","test", "sprint"));
    }


    @Override
    public String sendSimpleMessage(String from, String to, String text, String symbol) {
        return "OK";
    }

}