package UT1_Clase;

public class UT1_C5_VariablesGTVI {
    public static void main(String[] args) {

        long dinero = 100000000000000000L;

        float saldo = 12345.89f;

        System.out.println(dinero);

        // NO se puede encajar decimal en entero
        //int numero = 1000.4f;

        double numero2 = 457.24;

        double cantidad = -124;

        final int notaFinDeCurso;
        int examen1 = 8;
        double examen2 = 5.4;
        double media = ( examen1 + examen2 ) / 2;
        System.out.println("La media sería " + media);

        // CASTING
        notaFinDeCurso = (int) media;
        System.out.println("La notaFinDeCurso sería " + notaFinDeCurso);

        // Caracteres
        char inicial = 'G';
        System.out.println("Tu inicial es la " + (byte) inicial);


    }
}

