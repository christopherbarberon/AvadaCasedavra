package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Score {
    public void displayScore(){
        String chaine="";
        String fichier =System.getProperty("user.dir") + "/ListScore";

        try{
            InputStream ips=new FileInputStream(fichier);
            InputStreamReader ipsr=new InputStreamReader(ips);
            BufferedReader br=new BufferedReader(ipsr);
            String ligne;
            while ((ligne=br.readLine())!=null){
                if (ligne.contains("Name :"))
                {
                    String[] st = ligne.split(ligne, ':');
                    System.out.println(st[0]);
                    System.out.println("Name = "+st[1]);
                }
                chaine+=ligne+"\n";
            }
            br.close();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }


    public void write(String nomFic, String texte) {
        String adressedufichier = System.getProperty("user.dir") + "/"+ nomFic;

        try
        {
            FileWriter fw = new FileWriter(adressedufichier, true);

            BufferedWriter output = new BufferedWriter(fw);

            output.write(texte+"\n");

            output.flush();

            output.close();
            System.out.println("fichier créé :");
            System.out.println(texte);

        }
        catch(IOException ioe){
            System.out.print("Erreur : ");
            ioe.printStackTrace();
        }

    }

    public void highscore(){

    }

}