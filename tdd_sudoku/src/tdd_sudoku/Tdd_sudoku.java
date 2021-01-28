/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd_sudoku;

import com.sun.org.apache.xml.internal.security.transforms.TransformationException;

/**
 *
 * @author Fernando
 */
public class Tdd_sudoku {
    public static int [][] tabla={{5,1,6,9,8,4,3,7,2},
                     {3,7,8,6,5,2,9,4,1},
                     {9,2,4,3,7,1,5,8,6},
                     {2,6,7,5,9,8,4,1,3},
                     {1,3,5,4,2,7,6,9,8},
                     {4,8,9,1,6,3,7,2,5},
                     {8,9,3,7,1,6,2,5,4},
                     {7,4,1,2,3,5,8,6,9},
                     {6,5,2,8,4,9,1,3,7}};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
    public static int [] tamanio_tabla(){
        int numColumnas= tabla.length;
        int numFilas= tabla[0].length;
        int reslut[]={numColumnas,numFilas};
        return reslut;
    }
   
    
    
    
}
