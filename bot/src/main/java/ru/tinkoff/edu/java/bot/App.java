package ru.tinkoff.edu.java.bot;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.request.InlineKeyboardButton;
import com.pengrad.telegrambot.model.request.InlineKeyboardMarkup;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import ru.tinkoff.edu.java.bot.tgbotclasses.TgBot;

import java.util.List;
public class App 
{

    public static void main( String[] args )
    {
        new TgBot().startBot();
    }
}
