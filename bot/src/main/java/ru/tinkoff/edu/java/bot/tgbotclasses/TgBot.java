package ru.tinkoff.edu.java.bot.tgbotclasses;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.request.SetMyCommands;
//"6253073608:AAHbGe3aO0qR-UNTar9FETOhf0pZECfnZgI"
//"#{bot.token}"


public class TgBot {
    TelegramBot bot = new TelegramBot("6253073608:AAHbGe3aO0qR-UNTar9FETOhf0pZECfnZgI");
    public void startBot(){
        TgBotMethods tgBotMethods = new TgBotMethods();
        tgBotMethods.setBot(bot);
        tgBotMethods.setUpdateListener();


        BotCommand[] botCommands = {new BotCommand("help","вывести окно с командами"),
                new BotCommand("track","начать отслеживание ссылки"),
                new BotCommand("untrack", "прекратить отслеживание ссылки"),
                new BotCommand("list", "показать список отслеживаемых ссылок")};
        bot.execute(new SetMyCommands(botCommands));

    }
}