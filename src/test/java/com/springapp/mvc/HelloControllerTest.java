package com.springapp.mvc;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.ui.ModelMap;

import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

public class HelloControllerTest {

    private HelloController helloController;
    @Mock
    private ModelMap mockModelMap;
    @Before
    public void setUp() throws Exception {

     initMocks(this);
     helloController = new HelloController(mockModelMap);

    }


    @Test
    public void shouldDisplayWelcomeMessageOnPageLoad() throws Exception {
        helloController.printWelcome(mockModelMap);
        verify(mockModelMap).addAttribute("message", "Interactive!");
    }
}