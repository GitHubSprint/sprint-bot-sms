package pl.sprint.sms;

public interface SmsInterface {
    public String sendSimpleMessage(String from, String to, String text, String symbol);
}
