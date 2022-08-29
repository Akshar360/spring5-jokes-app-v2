package guru.springframework.sfgchucknorris.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokesQuoteService implements QuoteService
{
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesQuoteService()
    {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getQuote()
    {

        return chuckNorrisQuotes.getRandomQuote();
    }
}
