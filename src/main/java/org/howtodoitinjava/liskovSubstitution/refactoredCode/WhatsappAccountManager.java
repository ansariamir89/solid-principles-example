package org.howtodoitinjava.liskovSubstitution.refactoredCode;

import org.howtodoitinjava.liskovSubstitution.problemCode.SocialMediaAccountManager;

public class WhatsappAccountManager implements SocialStatusManager, SocialGroupManager {

    public void addStatus() {
        System.out.println("Status added on Whatsapp account");
    }

    public void createGroup() {
        System.out.println("Group created on Whatsapp account");
    }
}
