package com.holanda.testeperformance;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        String strFinal = "";
        long tStart = System.currentTimeMillis();

        for(int i = 0; i < 500000; i ++){
            strFinal += "a";
        }

        long tEnd = System.currentTimeMillis();
        long tResult = tEnd - tStart;

        System.out.println("Tempo de Execução com operador '+' = "+tResult+" ms");

        String stFormat = "";
        long tStartFomat = System.currentTimeMillis();

        for(int i = 0; i < 500000; i ++){
            stFormat += "a";
        }

        long tEndFormat = System.currentTimeMillis();
        long tResultFormat = tEndFormat - tStartFomat;

        System.out.println("Tempo de Execução com operador '+' = "+tResultFormat+" ms");


        // Usando o objeto StringBuilder
        StringBuilder strBuilder = new StringBuilder();

        tStart = System.currentTimeMillis();

        for(int i = 0; i < 500000; i ++){
            strBuilder.append("a");
        }

        tEnd = System.currentTimeMillis();
        tResult = tEnd - tStart;

        System.out.println("Tempo de Execução com StringBuilder = " + tResult+" ms");


        // Usando o objeto StringBuffer
        StringBuffer strBuffer = new StringBuffer();

        tStart = System.currentTimeMillis();

        for(int i = 0; i < 500000; i ++){
            strBuffer.append("a");
        }

        tEnd = System.currentTimeMillis();
        tResult = tEnd - tStart;

        System.out.println("Tempo de Execução com StringBuffer = "+tResult+" ms");
        assertEquals(4, 2 + 2);
    }
}