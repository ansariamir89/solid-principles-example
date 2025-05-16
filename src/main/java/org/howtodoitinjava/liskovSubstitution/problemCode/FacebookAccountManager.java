package org.howtodoitinjava.liskovSubstitution.problemCode;

public class FacebookAccountManager implements SocialMediaAccountManager {

    public void addStatus() {
        System.out.println("Status added on Facebook account");
    }

    public void createGroup() {
        System.out.println("Group created on Facebook account");
    }

    public void createReel() {
        System.out.println("Reel added on Facebook account");
    }
}
