package com.generation;

import com.generation.banco.CuentaBancaria;
import com.generation.paquete2.Animal;
import com.generation.person.Person;

public class Main {

    public static int numerador=10;
    public static int denominador=0;
    public static float division;

    public static void main(String[] args) {

        System.out.println("Antes de hacer la división");

        //dentro del try debe estar la porción de código que puede fallar
        try{
            division=numerador/denominador;
        }catch(NullPointerException ex) {
            //Siempre debe irse del caso más particular a lo general
            System.out.println("NullPointer");
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println("Exception");
            System.out.println(ex.getMessage());
        }
        System.out.println("Después de hacer la división");



        // write your code here
//        Person person= new Person();
//
//        person.setName("Santiago");
//        person.setAge(33);
//        person.setId("102045455");
//
//        System.out.println( "Name: " + person.getName());
//        System.out.println( "Age: "+ person.getAge());
//        System.out.println( "Id: " +  person.getId());

        /*
        CuentaBancaria cuenta= new CuentaBancaria();

        cuenta.setNombre("Sheila Sánchez");
        cuenta.setClave("ABC-100291");
        cuenta.setSaldo(1000000000);


        System.out.println(cuenta.getNombre());
        cuenta.mostrarSaldo();
        */
       /*
        Animal animal=new Animal();
        //No puedo acceder porque estoy desde otro paquete
        animal.nombre= "Iguana";
        */

        /*
        Persona persona = new Persona();
        persona.nombre="Carlos";
        persona.edad=31;
         */
    }
}
