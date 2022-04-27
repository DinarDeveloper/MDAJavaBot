import answers.*;
import keyboard.Keyboard;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {

    final private String BOT_TOKEN = "5100316178:AAEoHO6GSNe-1SCRByMIPd-p87mqLc3H6Pg";
    final private String BOT_NAME = "MDAJavaBot";

    @Override
    public String getBotUsername() {
        return BOT_NAME;
    }

    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }

    @Override
    public void onUpdateReceived(Update update) {
        User userName = update.getMessage().getFrom();
        Message message;

        if (update.hasMessage()) {
            message = update.getMessage();
            String text = message.getText();
            switch (text) {
                case "/start":
                    if (userName != null) {
                        sendMessage(message, "Привет " + userName.getFirstName() + ". Я бот помощник. Выбери задание");
                    } else {
                        sendMessage(message, "Привет Приятель. Я бот помощник. Выбери задание");
                    }
                    break;
                case "/help":
                    sendMessageHomeWork(message, Introduction.getAnswer());
                    break;
                case "ДЗ 1":
                    sendMessageHomeWork(message, HomeWork1Answers.getAnswer());
                    break;
                case "ДЗ 2":
                    sendMessageHomeWork(message, HomeWork2Answers.getAnswer());
                    break;
                case "ДЗ 3":
                    sendMessageHomeWork(message, HomeWork3Answers.getAnswer());
                    break;
                case "ДЗ 4":
                    sendMessageHomeWork(message, HomeWork4Answers.getAnswer());
                    break;
                case "ДЗ 5":
                    sendMessageHomeWork(message, HomeWork5Answers.getAnswer());
                    break;
                case "ДЗ 6":
                    sendMessageHomeWork(message, HomeWork6Answers.getAnswer());
                    break;
                case "ДЗ 7":
                    sendMessageHomeWork(message, HomeWork7Answers.getAnswer());
                    break;
                default:
                    sendMessageHomeWork(message, "Такой команды я не знаю, выбери пункт из меню");
                    break;
            }
        }
    }

    private void sendMessage(Message message, String text) {
        SendMessage sendMessage = SendMessage.builder()
                .chatId(message.getChatId().toString())
                //.replyToMessageId(message.getMessageId()) - ответ на сообщение
                .text(text).build();
        try {
            Keyboard.setButtons(sendMessage);
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sendMessageHomeWork(Message message, String text) {
        SendMessage sendMessage = SendMessage.builder()
                .chatId(message.getChatId().toString())
                .text(text).build();
        sendMessage.enableMarkdown(false);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

}