package com.example.application.views.list;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.login.LoginI18n;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "Components",layout = MainLayout.class)
@PageTitle("VaadinCompos | Vaadin")

public class Vaadincomponents extends VerticalLayout {

    public Vaadincomponents(){
        add(getNotified(),getTabs(),getLoginform());
    }
    private Component getNotified(){
        Button button = new Button("Check the result");
        button.addClickListener(clickEvent -> {
            button.setEnabled(false);


            // When creating a notification using the `show` static method,
            // the duration is 5-sec by default.
            Notification notification = Notification.show("All the testcases are passed");
            notification.setPosition(Notification.Position.MIDDLE);

            notification.addDetachListener(detachEvent -> button.setEnabled(true));
        });
        button.setId("result");
        return button;

    }
    private Component getTabs(){
        Tab testbench=new Tab("Testbench");
        testbench.setId("testb");

        Tab automation = new Tab("Automation");
        automation.setId("auto");

        Tab test = new Tab("Testing");
        test.setId("testing");

        Tab practise = new Tab("Practise");
        practise.setId("practise");


        Tabs tabs = new Tabs(testbench,automation,test,practise);
        tabs.setOrientation(Tabs.Orientation.VERTICAL);
        tabs.setHeight("200px");
        tabs.setWidth("200px");
        return tabs;


    }
    private Component getLoginform(){
        LoginForm form=new LoginForm();
        LoginOverlay loginOverlay = new LoginOverlay();
        loginOverlay.setTitle("Testbench");
        loginOverlay.setDescription("Automate using Vaadin tool");
        loginOverlay.setError(true);


        return form;

    }

}
