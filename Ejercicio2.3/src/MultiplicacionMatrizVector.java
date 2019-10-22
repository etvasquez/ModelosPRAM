import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;

public class MultiplicacionMatrizVector {
    static int p = 1;
    static int pr = 0;
    static int m = 8;
    static int n= 4;
    static int A[][] = new int [m][n];
    static int b [] = new int[n];
    static  int tb=0;
    static  int i[] = new int[m];
    static  int j[] = new int[m];
    static  int f[] = new int[m];
    static  int x[] = new int[m];
    static  int x_1[] = new int[m];

    static void LLenarMatriz(){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                A[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese datos en la matriz, posicion: "+(i+1)+" "+(j+1)));
            }
        }
    }

    static void LLenarVector(){
        for(int i=0;i<n;i++){
            b[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese datos al arreglo, posicion: "+(i+1)));
        }
    }

    static void CalcularProductoPRACREW(){
        if(pr==0){
            tb = m/p;
        }
        for(i[pr]=0;i[pr]<=(tb-1);i[pr]++){
            f[pr] = i[pr]+pr*tb;
            x[f[pr]]=0;
            for(j[pr]=0;j[pr]<=n-1;j[pr]++){
                x[f[pr]]=x[f[pr]]+A[f[pr]][j[pr]]*b[j[pr]];
            }
        }
    }

    static void CalcularProductoPRACRCW(){
        tb = m/p;
        for(int i=0;i<=tb-1;i++){
            f[pr] = i+pr*tb;
            x_1[f[pr]]=0;
            for(int j=0;j<=n-1;j++){
                x_1[f[pr]]=x_1[f[pr]]+A[f[pr]][j]*b[j];
            }
        }
    }

    public static void main(String[] args) {
        LLenarMatriz();
        LLenarVector();
        System.out.println("MODELO PRAM CREW            MODELO PRAM CRCW");
        CalcularProductoPRACREW();
        CalcularProductoPRACRCW();
        for(int i=0;i<4;i++){
            System.out.println("\t"+x[i]+"\t\t\t\t\t\t\t"+x_1[i]);
        }
    }

}

