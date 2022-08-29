package guru.springframework.sfgchucknorris.controllers;

import guru.springframework.sfgchucknorris.services.JokesQuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController
{
    private final JokesQuoteService jokesQuoteService;

    public JokesController(JokesQuoteService jokesQuoteService)
    {
        this.jokesQuoteService = jokesQuoteService;
    }

    @RequestMapping({"/",""})
    public String getQuote(Model model) //return the view name
    {
        model.addAttribute("Joke",jokesQuoteService.getQuote());
        return "index";
    }
}
