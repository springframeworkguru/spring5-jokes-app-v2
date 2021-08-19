package org.tutorials.spring5jokesapp.services;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class JokesServiceImplTest {

    private JokesServiceImpl jokesServiceImpl;

    @BeforeAll
    private void setUp() {
        jokesServiceImpl = new JokesServiceImpl();
    }

    @Test
    public void getRandomQuote_withSuccess() {
        String quote = jokesServiceImpl.getRandomQuote();
        assert quote != null;
    }
}
