package guru.springframework.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {

        this.chuckNorrisQuotes =  new ChuckNorrisQuotes();
        //this is hard coding, it's not a good practice.
        // Not friendly for Dependency Injection. you better declare this as a bean
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
