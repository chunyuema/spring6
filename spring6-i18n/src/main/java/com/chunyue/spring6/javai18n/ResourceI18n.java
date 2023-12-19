package com.chunyue.spring6.javai18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceI18n {
    public static void main(String[] args) {
        ResourceBundle bundleCN = ResourceBundle.getBundle("messages", new Locale("zh", "CN"));
        String stringCN = bundleCN.getString("test");
        System.out.println(stringCN);

        ResourceBundle bundleGB = ResourceBundle.getBundle("messages", new Locale("en", "GB"));
        String stringGB = bundleGB.getString("test");
        System.out.println(stringGB);


    }
}
