import java.util.Scanner;

public  class Question13a {
    public static void main(String[] args) {

        int arrA[][]=new int[30][30];
        int arrB[][]=new int[30][30];
        int rows , columns;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of Rows : ");
        rows=sc.nextInt();

        System.out.println("Enter number of columns : ");
        columns=sc.nextInt();

        System.out.println("Enter Elements of Matrix A: ");
        for (int i=0 ;i<rows;i++){
            for (int j=0;j<columns;j++){
                arrA[i][j]=sc.nextInt();
            }
        }

        System.out.println("Elements of Matrix A are: ");
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.print(arrA[i][j]+" ");
            }
            System.out.println(" ");
        }

        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
               arrB[i][j]=arrA[j][i];
            }
        }

        System.out.println("Transpose of Matrix A is  : ");
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.print(arrB[i][j]+" ");
            }
            System.out.println("  ");
        }





    }


}