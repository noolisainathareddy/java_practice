package com.irving.library.dummytestdouble;

public class DummyEmailService implements EmailService{
    @Override
    public void sendEmail(String message) {
        throw new AssertionError("Mehtod not implemented");
    }
}
