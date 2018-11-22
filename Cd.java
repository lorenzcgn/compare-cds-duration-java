/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musica;

/**
 *
 * @author 72873486
 */
public class Cd {
    private String titolo;
    private String autore;
    private int numeroBrani;
    private double durata;
    
    public Cd (String titolo, String autore, int numeroBrani, double durata)
    {
        this.titolo = titolo;
        this.autore = autore;
        this.numeroBrani = numeroBrani;
        this.durata = durata;
    }
    
    public String getTitolo()
    {
        return titolo;
    }
    
     public String getAutore()
    {
        return autore;
    }
     
     public int getNumeroBrani()
    {
        return numeroBrani;
    }
    
    public double getDurata()
    {
        return durata;
    } 
    
    public void setTitolo (String titolo)
    {
        this.titolo = titolo;
    }
    
    public void setAutore (String autore)
    {
        this.autore = autore;
    }
    
    public void setNumeroBrani (int numeroBrani)
    {
        this.numeroBrani = numeroBrani;
    }
    
    public void setDurata (double durata)
    {
        this.durata = durata;
    }
    
    public void comparaDurata(double durata2)
    {
        if (durata > durata2)
                System.out.println("Il cd 1 dura di più del cd 1");
        else if (durata < durata2)
                System.out.println("Il cd 2 dura di più del cd 1");
        else    System.out.println("Il cd 2 dura come il cd 1");   
                
    }
    
    public void ToString()
    {
        System.out.println (titolo +" "+ autore +" "+ numeroBrani+" "+ durata);
    }
            
    
}
