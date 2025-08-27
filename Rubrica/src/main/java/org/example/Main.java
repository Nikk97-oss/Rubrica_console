package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean work=false;
        Scanner sc = new Scanner(System.in);
        while(!work) {
            System.out.println("1- Aggiungi contatto");
            System.out.println("2- Rimuovi contatto");
            System.out.println("3- Cerca contatto");
            System.out.println("4- Stampa rubrica");




            int scelta;
            if (sc.hasNextInt()) {
                scelta = sc.nextInt();
                sc.nextLine(); // Consuma il newline dopo l'intero
            } else {
                System.out.println("Inserisci un numero valido!");
                sc.nextLine(); // Pulisce il buffer
                continue;
            }


            switch (scelta) {
                case 1:
                    System.out.println("Inserisci il nome:");
                    String nome = sc.nextLine();

                    System.out.println("Inserisci il cognome:");
                    String cognome = sc.nextLine();

                    System.out.println("Inserisci il numero:");
                    String numero = sc.nextLine();

                    Rubrica.addContact(nome, cognome, numero);
                    break;

                case 2:
                    System.out.println("Inserisci il numero:");
                    String numeroDaRimuovere = sc.nextLine();
                    Rubrica.removeContact(numeroDaRimuovere);
                    break;

                case 3:
                    System.out.println("Inserisci il nome:");
                    String nomeRicerca = sc.nextLine();

                    System.out.println("Inserisci il cognome:");
                    String cognomeRicerca = sc.nextLine();

                    Rubrica.find(nomeRicerca, cognomeRicerca);
                    break;

                case 4:
                    Rubrica.showLista();
                    break;

                case 5:
                    work = true;
                    System.out.println("Programma terminato.");
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }
}