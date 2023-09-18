public class Pattern {
    public static void main(String[] args) {
        
        // print123();
        // printNumbers();
        // triangularPattern();
        // numbersPattern();
        // countingPattern();
        // reverseCountingPattern();
        // alphaPattern();
        // alphaIncreasingPattern();
        // alphabatePattern();
        // alphabateRowPattern();
        // alphabateIncrementPattern();
        // alphaCounterPattern();
        // reverseTriangularPattern();
        // oppositeTriangularPattern();
        // oppositeReverseTriangularPattern();
        // oppositeNumberTriangularPattern();
        // reverseNumberTriangularPattern();
        // oppositeIncreasingNumberTriangularPattern();
        // reverseNumberIncreasingTriangularPattern();
        // pascalTriangularPattern();
        // pascalNumberTriangularPattern();
        dabangPattern();

    }


    // 1 2 3 4 5 5 4 3 2 1 
    // 1 2 3 4 * * 4 3 2 1
    // 1 2 3 * * * * 3 2 1
    // 1 2 * * * * * * 2 1
    // 1 * * * * * * * * 1
    public static void dabangPattern(){
         
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            for(int k=1; k<=i-1; k++){
                System.out.print("* ");
            }
            for(int k=1; k<=i-1; k++){
                System.out.print("* ");
            }
            for(int l=n; l>=i; l--){
                System.out.print(l-i+1 +" ");
            }
            System.out.println();
        }       
    }

    //         1 
    //       1 2 1
    //     1 2 3 1 2
    //   1 2 3 4 1 2 3
    // 1 2 3 4 5 1 2 3 4
    public static void pascalNumberTriangularPattern(){
         
        int n = 5;

        for(int i=1; i<=n; i++){
            for(int s=1; s<=n-i; s++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            for(int k=1; k<=i-1; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }        
    }



    //         * 
    //       * * *
    //     * * * * *
    //   * * * * * * *
    // * * * * * * * * *
    public static void pascalTriangularPattern(){
         
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int s=1; s<=n-i; s++){
                System.out.print("  ");
            }
            for(int j=1; j<=i*2-1; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }     
    }


        //         1 
        //       2 3
        //     4 5 6
    //       7 8 9 10
    //  1 12 13 14 15
    public static void reverseNumberIncreasingTriangularPattern(){
         
        int n = 5;
        int counter = 1;
        for(int i=1; i<=n; i++){
            for(int s=1; s<=n-i; s++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(counter++ +" ");
            }
            System.out.println();
        }        
    }


    //1 2 3 4 5 
    //  2 3 4 5
    //    3 4 5
    //      4 5
    //        5
    public static void oppositeIncreasingNumberTriangularPattern(){
         
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int s=1; s<=i-1; s++){
                System.out.print("  ");
            }
            for(int j=i; j<=n; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }        
    }
    


    //          1 
    //        2 2
    //      3 3 3
    //    4 4 4 4
    //  5 5 5 5 5
    public static void reverseNumberTriangularPattern(){
         
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int s=1; s<=n-i; s++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }        
    }


    //     1 1 1 1 1 
    //       2 2 2 2
    //         3 3 3
    //           4 4
    //             5
    public static void oppositeNumberTriangularPattern(){
         
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int s=1; s<=i-1; s++){
                System.out.print("  ");
            }
            for(int j=1; j<=n-i+1; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }        
    }


    // * * * * * 
    //   * * * *
    //     * * *
    //       * *
    //         *
    public static void oppositeReverseTriangularPattern(){
         
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int s=1; s<=i-1; s++){
                System.out.print("  ");
            }
            for(int j=1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }        
    }

    // * * * * * 
    // * * * *
    // * * *
    // * *
    // *
    public static void oppositeTriangularPattern(){
         
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }        
    }


    //         * 
    //       * *
    //     * * *
    //   * * * *
    // * * * * *
    public static void reverseTriangularPattern(){
         
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int s=1; s<=n-i; s++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }        
    }


    // A 
    // B C
    // D E F
    // G H I J
    // K L M N O
    public static void alphaCounterPattern(){
         
        int n = 5;
        char ch = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch++ +" ");
            }
            System.out.println();
        }        
    }


    // A 
    // B B
    // C C C
    // D D D D
    // E E E E E
    public static void alphabateIncrementPattern(){
         
        int n = 5;
        for(int i=1; i<=n; i++){
            char ch = (char) ('A' + i-1);
            for(int j=1; j<=i; j++){
                System.out.print(ch +" ");
            }
            System.out.println();
        }        
    }

    // A B C D E 
    // B C D E F
    // C D E F G
    // D E F G H
    // E F G H I
    public static void alphabateRowPattern(){
         
        int n = 5;
        for(int i=1; i<=n; i++){
            char ch = (char) ('A' + i-1);
            for(int j=1; j<=n; j++){
                System.out.print(ch++ +" ");
            }
            System.out.println();
        }        
    }

    //A B C D E 
    // F G H I J
    // K L M N O
    // P Q R S T
    // U V W X Y
    public static void alphabatePattern(){
         
        int n = 5;
        char ch = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(ch++ +" ");
            }
            System.out.println();
        }        
    }


    // A B C D E 
    // A B C D E
    // A B C D E
    // A B C D E
    // A B C D E
    public static void alphaIncreasingPattern(){
         
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                char ch = (char) ('A' + j - 1);
                System.out.print(ch+" ");
            }
            System.out.println();
        }        
    }


    // A A A A A 
    // B B B B B
    // C C C C C
    // D D D D D
    // E E E E E
    public static void alphaPattern(){
         
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                char ch = (char) ('A' + i - 1);
                System.out.print(ch+" ");
            }
            System.out.println();
        }        
    }


    // 1 
    // 2 1
    // 3 2 1
    // 4 3 2 1
    // 5 4 3 2 1
    public static void reverseCountingPattern(){
         
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i-j+1 +" ");
            }
            System.out.println();
        }        
    }


    // 1 
    // 2 3
    // 3 4 5
    // 4 5 6 7
    // 5 6 7 8 9
    public static void countingPattern(){
         
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+j-1 +" ");
            }
            System.out.println();
        }        
    }

    // 1 
    // 2 2
    // 3 3 3
    // 4 4 4 4
    // 5 5 5 5 5
    public static void numbersPattern(){
         
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }        
    }

    // * 
    // * *       
    // * * *     
    // * * * *   
    // * * * * * 
    public static void triangularPattern(){
         
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }        
    }


    // 1 2 3 
    // 4 5 6 
    // 7 8 9 
    public static void printNumbers(){
         
        int n = 3;
        int counter=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(++counter + " ");
            }
            System.out.println();
        }        
    }
    
 
    // 1 2 3 4 5 
    // 1 2 3 4 5 
    // 1 2 3 4 5
    public static void print123(){
         
        int n = 3;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }        
    }
}
