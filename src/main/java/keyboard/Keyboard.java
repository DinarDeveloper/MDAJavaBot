package keyboard;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class Keyboard {

    public static void setButtons(SendMessage sendMessage) {
        //Создаем объект будущей клавиатуры и выставляем нужные настройки
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setResizeKeyboard(true); //подгоняем размер
        replyKeyboardMarkup.setOneTimeKeyboard(false); //скрываем после использования
        replyKeyboardMarkup.setSelective(true);

        //Создаем список с рядами кнопок
        List<KeyboardRow> keyboardRowList = new ArrayList<>();

        KeyboardRow keyboardRow1 = new KeyboardRow();//первый ряд кнопок
        KeyboardRow keyboardRow2 = new KeyboardRow();//второй ряд кнопок

        keyboardRow1.add(new KeyboardButton("ДЗ 1"));
        keyboardRow1.add(new KeyboardButton("ДЗ 2"));
        keyboardRow1.add(new KeyboardButton("ДЗ 3"));
        keyboardRow1.add(new KeyboardButton("ДЗ 4"));
        keyboardRow2.add(new KeyboardButton("ДЗ 5"));
        keyboardRow2.add(new KeyboardButton("ДЗ 6"));
        keyboardRow2.add(new KeyboardButton("ДЗ 7"));

        keyboardRowList.add(keyboardRow1);
        keyboardRowList.add(keyboardRow2);
        //добавляем лист с одним рядом кнопок в главный объект
        replyKeyboardMarkup.setKeyboard(keyboardRowList);
    }
}
