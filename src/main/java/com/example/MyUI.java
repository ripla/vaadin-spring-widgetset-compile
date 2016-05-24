package com.example;

import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@SpringUI
@Widgetset("com.example.Widgetset")
public class MyUI extends UI{
    @Override
    protected void init(VaadinRequest request) {
        setContent(new Label("Hello!"));
    }
}
