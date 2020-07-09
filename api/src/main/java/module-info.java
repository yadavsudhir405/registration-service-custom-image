module api {
    requires spring.web;
    requires spring.beans;
    requires spring.boot;
    requires spring.boot.autoconfigure;

    requires service;

    exports com.sudhir.registration.api;

    opens com.sudhir.registration.api to spring.core;
}