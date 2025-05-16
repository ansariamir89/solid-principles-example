package org.howtodoitinjava.liskovSubstitution.problemCode;

public class WhatsappAccountManager implements SocialMediaAccountManager {

    public void addStatus() {
        System.out.println("Status added on Whatsapp account");
    }

    public void createGroup() {
        System.out.println("Group created on Whatsapp account");
    }

    public void createReel() {
        throw new UnsupportedOperationException("Unable to create reel!");
    }
}
