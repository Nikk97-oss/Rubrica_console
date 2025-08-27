package org.example;

import java.util.*;

public class Contatto {
    private static String name;
    private static String cognome;
    private String nTel;

    public Contatto(String name, String cognome, String nTel) {
        this.name = name;
        this.cognome = cognome;
        this.nTel = nTel;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getnTel() {
        return nTel;
    }

    public void setnTel(String nTel) {
        this.nTel = nTel;
    }

    @Override
    public String toString() {
        return "Contatto{" +
                "name='" + name + '\'' +
                ", cognome='" + cognome +
                '}';
    }
}
