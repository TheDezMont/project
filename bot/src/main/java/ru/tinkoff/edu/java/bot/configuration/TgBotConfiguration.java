package ru.tinkoff.edu.java.bot.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.tinkoff.edu.java.bot.tgbotclasses.TgBot;

@Configuration
public class TgBotConfiguration {
    @Bean("tg_bot_starter")
    public TgBot startBot(TgBot tgBot){
        return tgBot;
    }
}
