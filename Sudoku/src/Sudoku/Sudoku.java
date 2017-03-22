/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sudoku;

/**
 *
 * @author Estudiantes
 */
public class Sudoku {
    
    char[][] cuadro = new char[9][9];
    

    public Sudoku() {
        limpiarTab();
    }
    
    void limpiarTab ()
    {
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                cuadro[i][j]='a';
            }
            }
        }
    }

