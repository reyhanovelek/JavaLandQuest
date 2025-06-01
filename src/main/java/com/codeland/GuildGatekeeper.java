package com.codeland;

public class GuildGatekeeper {
    // TODO: Use if-else to determine access based on hero type


    public static String determineAccess (String heroType) {
        if (heroType.equals("Knight")) {
            return "Access Granted : Armory";
        }else if (heroType.equals("Mage")) {
            return "Access Granted: Library";
        }else {
            return " Access Denied: Restricted Area";
        }
    }
}
