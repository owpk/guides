package org.owpk.profile.mock;

import org.springframework.beans.factory.annotation.Value;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class ConfigA implements Config {
    private static char[] arr;
    static {
        int length = 1 + 'z' - 'a';
        arr = new char[length * 2];

        for (int i = 0; i < length; i++)
            arr[i] = (char) ('A' + i);

        for (int i = 0; i < length; i++)
            arr[length + i] = (char) ('a' + i);
    }


    @Value("${owpk.name}")
    private String owpkName;

    private String name;

    public String getName() {
        return name;
    }

    private String generateUniqueString(int length) {
        SecureRandom rand = null;
        try {
            rand = SecureRandom.getInstance("NativePRNG");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        var builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(arr[rand.nextInt(arr.length)]);
        }
        return builder.toString();
    }

    public ConfigA(String name) {
        this.name = name;
    }

    public ConfigA() {
        name = generateUniqueString(15);
    }

    @Override
    public String configure() {
        return "configuring properties with root name: " + owpkName;
    }
}