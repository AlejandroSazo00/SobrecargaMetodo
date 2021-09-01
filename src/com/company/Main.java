package com.company;

public class Main {

    public static void main(String[] args) {
            Persona persona1 = new Persona("Alejandro",19);
            persona1.correr();

/** Ahora creamos otro metodo que muestre la cantidad recorrida de la carrera */
/** Y porque no agregamos el Dpi, y es porque tendriamos que sobrecargar mas el codigo y modificar mas valores para que se pueda ejecutar sin problema en NetBeans y que este no lo confunda o tome como error*/
            Persona persona2 = new Persona("3775897893156");
            persona2.correr(100);
    }
}
