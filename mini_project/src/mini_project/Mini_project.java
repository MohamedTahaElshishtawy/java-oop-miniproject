/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini_project;

/**
 *
 * @author mohamed
 */
import java.util.Scanner;
class shaps {
    void area_circle (float rad)
    {
     System.out.println("area of circle = "+(Math.PI*rad*rad));
    }
    
    void area_rectangle (float length , float width)
    {
     System.out.println("area of rectangle = "+(length*width));
    }
  
    void area_cube (float length)
    {
     System.out.println("area = "+(length*length*length));
    }
}

class matrix_calculations{
public int[][] matrix_input(){
       System.out.print("Enter the matrix size : ");
       Scanner sc = new Scanner(System.in);
       int rows  = sc.nextInt();
       int columns = sc.nextInt();
       
       System.out.println("Enter matrix elements : ");    
        
       int twoD[][]=new int[rows][columns];
        
          
        for(int i=0; i<rows;i++)
         {            
            for(int j=0; j<columns;j++)
            {
                twoD[i][j]=sc.nextInt();
            }
         }
return twoD;
}
void add_matrix()
{
 
 int [][] a = matrix_input();
 int [][] b = matrix_input();
 int c[][] = new int[a.length][b.length];  //3 rows and 3 columns  
    
//adding and printing addition of 2 matrices 
System.out.println("The addition of matrices ");
for(int i=0;i < a.length ;i++)    
{
    for(int j=0;j<b.length;j++)    
    {     
        c[i][j]=a[i][j]+b[i][j];
        System.out.println(c[i][j]+ " ");;   
    }     
}
}
void sub_matrix()
{
 
 int [][] a = matrix_input();
 int [][] b = matrix_input();
 int c[][] = new int[a.length][b.length];  //3 rows and 3 columns  
    
System.out.println("The subtraction of matrices ");   
for(int i=0;i < a.length ;i++)    
{
    for(int j=0;j<b.length;j++)    
    {     
        c[i][j]=a[i][j]-b[i][j];
        System.out.println(c[i][j]+ " ");   
    }     
}
}
void multi_matrix()
{
 
 int [][] a = matrix_input();
 int [][] b = matrix_input();
 int c[][] = new int[a.length][b.length];  //3 rows and 3 columns  
    
System.out.println("The multiplication of matrices ");   
for(int i=0;i < a.length ;i++)    
{
    for(int j=0;j<b.length;j++)    
    {     
        c[i][j]=a[i][j]*b[i][j];
        System.out.println(c[i][j]+ " ");   
    }     
}
}
}


public class Mini_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       // First Project
       shaps shap = new shaps();
       shap.area_circle(5.5f);
       shap.area_cube(6);
       shap.area_rectangle(30, 12);
       System.out.println("\n");
       
       //Sceond Project
       matrix_calculations matrix = new matrix_calculations();
       matrix.add_matrix();
       matrix.sub_matrix();
       matrix.multi_matrix();
    }
    
}
