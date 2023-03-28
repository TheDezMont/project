package ru.tinkoff.edu.java.linkParser.Controller;

import org.springframework.web.bind.annotation.*;
import ru.tinkoff.edu.java.linkParser.GithubParser;
import ru.tinkoff.edu.java.linkParser.LinkParser;
import ru.tinkoff.edu.java.linkParser.StackOverflowURL;

@RestController
public class LinkParserController {
    @GetMapping("/")
    @ResponseBody
    String hello() {
        return "<html>Go to http://localhost:8080/url:?url=URL with correct URL so it starts working</html>";
    }

    @GetMapping("/url")
    @ResponseBody
    public String getUrl(@RequestParam(required = false) String url) {
        String result;
        LinkParser githubParser = new GithubParser();
        LinkParser stackOverflowParser = new StackOverflowURL();
        githubParser.setNextParser(stackOverflowParser);
        String[] parseResult = githubParser.parse(url);
        if (parseResult==null)result="Ссылка не поддерживается";
        else result = String.join("  ",parseResult);

        return "<html><p>URL: " + url + "</p><p>Data:"+result+"</p></html>";
    }

}
