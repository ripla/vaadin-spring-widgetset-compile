package com.example;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import org.vaadin.teemu.switchui.Switch;

@SpringUI
@Widgetset("com.example.Widgetset")
@Theme("demotheme")
public class MyUI extends UI{

    @Override
    protected void init(VaadinRequest request) {
        final VerticalLayout layout = new VerticalLayout();
        layout.setSizeFull();
        layout.setMargin(true);
        layout.setSpacing(true);
        layout.addComponent(new Switch());
        final Button myButton = new Button("I'm red!");
        myButton.setStyleName("my-button");
        layout.addComponent(myButton);
        setContent(layout);
    }
}
