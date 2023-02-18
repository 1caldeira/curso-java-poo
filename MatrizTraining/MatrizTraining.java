import java.util.Scanner;

public class MatrizTraining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] matriz = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("Type in the number in line: "+i+" column: "+j+": ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Select a number from the matrix: ");
        int choice = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if(matriz[i][j] == choice){
                    System.out.println("Position: "+i+","+j+":");
                    if(j>0){System.out.println("Left: "+matriz[i][j-1]);}
                    if(j<m-1){System.out.println("Right: "+matriz[i][j+1]);}
                    if(i>0){System.out.println("Up: "+matriz[i-1][j]);}
                    if(i<n-1){System.out.println("Down: "+matriz[i+1][j]);}
                    }
                }
            }


        }

    }
