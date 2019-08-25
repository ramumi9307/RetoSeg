/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retoseguridad;

/**
 *
 * @author ramumi93
 */
public class RetoSeguridad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
    System.out.println("\n\t Paths from DF \n");
    System.out.println(String.format("From DF to DF %s", new GraphExampleApplication().hasPathDfs("DF", "DF")));
    System.out.println(
            String.format("From DF to Toluca %s", new GraphExampleApplication().hasPathDfs("DF", "Toluca")));
    System.out.println(String.format("From DF to Cuernavaca %s",
            new GraphExampleApplication().hasPathDfs("DF", "Cuernavaca")));
    System.out.println(
            String.format("From DF to Puebla %s", new GraphExampleApplication().hasPathDfs("DF", "Puebla")));
    System.out.println(
            String.format("From DF to Tlaxcala %s", new GraphExampleApplication().hasPathDfs("DF", "Tlaxcala")));
    System.out.println(
            String.format("From DF to Cancún %s", new GraphExampleApplication().hasPathDfs("DF", "Cancún")));
    // Paths from Toluca
 
    System.out.println("\n\t Paths from Toluca \n");
    System.out.println(String.format("From Toluca to Toluca %s",
            new GraphExampleApplication().hasPathDfs("Toluca", "Toluca")));
    System.out.println(
            String.format("From Toluca to DF %s", new GraphExampleApplication().hasPathDfs("Toluca", "DF")));
    System.out.println(String.format("From Toluca to Cuernavaca %s",
            new GraphExampleApplication().hasPathDfs("Toluca", "Cuernavaca")));
    System.out.println(String.format("From Toluca to Puebla %s",
            new GraphExampleApplication().hasPathDfs("Toluca", "Puebla")));
    System.out.println(String.format("From Toluca to Tlaxcala %s",
            new GraphExampleApplication().hasPathDfs("Toluca", "Tlaxcala")));
    System.out.println(String.format("From Toluca to Cancún %s",
            new GraphExampleApplication().hasPathDfs("Toluca", "Cancún")));
 
    System.out.println("\n\t Paths from Cuernavaca \n");
    System.out.println(String.format("From Cuernavaca to Cuernavaca %s",
            new GraphExampleApplication().hasPathDfs("Cuernavaca", "Cuernavaca")));
    System.out.println(String.format("From Cuernavaca to DF %s",
            new GraphExampleApplication().hasPathDfs("Cuernavaca", "DF")));
    System.out.println(String.format("From Cuernavaca to Toluca %s",
            new GraphExampleApplication().hasPathDfs("Cuernavaca", "Toluca")));
    System.out.println(String.format("From Cuernavaca to Puebla %s",
            new GraphExampleApplication().hasPathDfs("Cuernavaca", "Puebla")));
    System.out.println(String.format("From Cuernavaca to Tlaxcala %s",
            new GraphExampleApplication().hasPathDfs("Cuernavaca", "Tlaxcala")));
    System.out.println(String.format("From Cuernavaca to Cancún %s",
            new GraphExampleApplication().hasPathDfs("Cuernavaca", "Cancún")));
 
    System.out.println("\n\t Paths from Puebla \n");
    System.out.println(String.format("From Puebla to Puebla %s",
            new GraphExampleApplication().hasPathDfs("Puebla", "Puebla")));
    System.out.println(String.format("From Puebla to Cuernavaca %s",
            new GraphExampleApplication().hasPathDfs("Puebla", "Cuernavaca")));
    System.out.println(
            String.format("From Puebla to DF %s", new GraphExampleApplication().hasPathDfs("Puebla", "DF")));
    System.out.println(String.format("From Puebla to Toluca %s",
            new GraphExampleApplication().hasPathDfs("Puebla", "Toluca")));
    System.out.println(String.format("From Puebla to Tlaxcala %s",
            new GraphExampleApplication().hasPathDfs("Puebla", "Tlaxcala")));
    System.out.println(String.format("From Puebla to Cancún %s",
            new GraphExampleApplication().hasPathDfs("Puebla", "Cancún")));
 
    System.out.println("\n\t Paths from Tlaxcala \n");
    System.out.println(String.format("From Tlaxcala to Tlaxcala %s",
            new GraphExampleApplication().hasPathDfs("Tlaxcala", "Tlaxcala")));
    System.out.println(String.format("From Tlaxcala to Puebla %s",
            new GraphExampleApplication().hasPathDfs("Tlaxcala", "Puebla")));
    System.out.println(String.format("From Tlaxcala to Cuernavaca %s",
            new GraphExampleApplication().hasPathDfs("Tlaxcala", "Cuernavaca")));
    System.out.println(
            String.format("From Tlaxcala to DF %s", new GraphExampleApplication().hasPathDfs("Tlaxcala", "DF")));
    System.out.println(String.format("From Tlaxcala to Toluca %s",
            new GraphExampleApplication().hasPathDfs("Tlaxcala", "Toluca")));
    System.out.println(String.format("From Tlaxcala to Cancún %s",
            new GraphExampleApplication().hasPathDfs("Tlaxcala", "Cancún")));
 
    System.out.println("\n\t Paths from Cancún \n");
    System.out.println(String.format("From Cancún to Cancún %s",
            new GraphExampleApplication().hasPathDfs("Cancún", "Cancún")));
    System.out.println(String.format("From Cancún to Tlaxcala %s",
            new GraphExampleApplication().hasPathDfs("Cancún", "Tlaxcala")));
    System.out.println(String.format("From Cancún to Puebla %s",
            new GraphExampleApplication().hasPathDfs("Cancún", "Puebla")));
    System.out.println(String.format("From Cancún to Cuernavaca %s",
            new GraphExampleApplication().hasPathDfs("Cancún", "Cuernavaca")));
    System.out.println(
            String.format("From Cancún to DF %s", new GraphExampleApplication().hasPathDfs("Cancún", "DF")));
    System.out.println(String.format("From Cancún to Toluca %s",
            new GraphExampleApplication().hasPathDfs("Cancún", "Toluca")));
 
}
}
