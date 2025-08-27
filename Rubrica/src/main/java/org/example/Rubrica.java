package org.example;

import java.util.*;

public class Rubrica extends Contatto {
    private static Map<String, String> contatti=new HashMap<>();

    public Rubrica(String nome,String cognome,String nTel){
        super(nome,cognome,nTel);
        contatti.put(nTel, super.toString());
    }

    public static void showLista(){
        Set<String> ks=contatti.keySet();

        System.out.println("--------------------");
        for(String k:ks){
            System.out.println(k+"\n"+contatti.get(k));
            System.out.println("--------------------");
        }

    }

    public static void removeContact (String nTel){
        Set<String> ks=contatti.keySet();
        if(ks.isEmpty())
            System.out.println("Non è presente nessun contatto all'interno della rubrica");
        for(String k:ks){
            if(k.equals(nTel)){
                contatti.remove(k);
                System.out.println("Contatto rimosso");
            }
            else
                System.out.println("Contatto non presente nella rubrica");

        }

    }

    public static void addContact (String nome,String cognome,String nTel){
        new Rubrica(nome,cognome,nTel);

    }

    public static void find(String nome, String cognome){
        Set<String> ks=contatti.keySet();
        String numero = null;

        for(String k:ks){
            if(Contatto.getName().equals(nome) && Contatto.getCognome().equals(cognome))
                numero=k;
        }

        if(numero!=null)
            System.out.println("ilnumero è :"+ numero);
        else
            System.out.println("Contatto non esistente");


    }


}
