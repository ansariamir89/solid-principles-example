package org.howtodoitinjava.liskovSubstitution.refactoredCode;

import org.howtodoitinjava.liskovSubstitution.problemCode.SocialMediaAccountManager;

public class FacebookAccountManager implements SocialStatusManager, SocialGroupManager, SocialReelManager {

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
