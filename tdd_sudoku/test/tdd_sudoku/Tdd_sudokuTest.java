/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd_sudoku;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fernando
 */
public class Tdd_sudokuTest {
    Tdd_sudoku operaciones;
    public Tdd_sudokuTest() {
        operaciones = new Tdd_sudoku();
    }
    
   

    

    @Test
    public void testTamanio_tabla_3() {
        
        int res []= operaciones.tamanio_tabla();
        
        assertEquals(9, res[0]);
        assertEquals(9, res[1]);
    }
    
}
