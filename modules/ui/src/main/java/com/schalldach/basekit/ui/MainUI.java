package com.schalldach.basekit.ui;

import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.ui.Transport;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.JavaScript;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * Created by @author Thomas Schalldach on 18/07/2018 software@thomas-schalldach.de.
 */
@SpringUI(path = "/")
@Push(transport = Transport.WEBSOCKET)
@Theme("default")
public class MainUI extends UI {


    private Panel mainPanel = new Panel();


    @Override
    protected void init(VaadinRequest vaadinRequest) {
        doJavaScript();
        this.setContent(mainPanel);

        VerticalLayout layout = new VerticalLayout();
        Button themeSwitcher = new Button("Enable Dark Mode");
        themeSwitcher.addClickListener(event -> this.setTheme("default-dark"));
        layout.addComponent(themeSwitcher);

        for (int i = 0; i < 10; i++) {
            layout.addComponent(new Label("Hello World " + i));
        }

        mainPanel.setContent(layout);


    }

    private void doJavaScript() {
        JavaScript js = getPage().getJavaScript();
        js.addFunction("appWindowExit", arguments -> onWindowExit());
    }

    private void onWindowExit() {
        System.exit(0);
    }

}
