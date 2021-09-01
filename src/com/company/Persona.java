package com.company;

public class Persona {
    //Atributos
    /** En estos atributos agregamos uno extra que es String dpi*/
    String nombre;
    int edad;
    String dpi;

    //Metodo

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    /* Como vemos tenemos dos parametros de nombre,edad, pero en este caso agregaremos el metodo dpi por aparte*/
    /* Esto haciendo que los parametros sean diferentes para sobrecargarlo*/
    public Persona(String dpi) {
        this.dpi = dpi;
    }

    public void correr(){
        System.out.println("Soy "+nombre+", tengo "+edad+" años y estoy participando en una carrera olimpica");
    }
    /** En este lo que se hizo fue copiar el mismo metodo de arriba pero con algunos cambios*/
    /** Con esto tenemos una sobrecarga de metodos y como lo diferenciamos, con la cantidad de parametros que tiene cada uno*/
    public void correr(int km){
        System.out.println("He corrido "+km+" Kilometro");
    }
}
