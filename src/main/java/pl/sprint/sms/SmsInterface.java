package pl.sprint.sms;

public interface SmsInterface {
    String sendSimpleMessage(String from, String to, String text, String symbol);
}
