public class gameScreen {
    public static void showGame(int skeletonHealth, int playerLife){



        System.out.printf("%30c-----------------------------------------------------------------------",'-');
        
        System.out.printf(" %n%80S%n%80s%d%n", "McSkelly","Health:",skeletonHealth);
        System.out.printf("%76c%n",'O'); 
        System.out.printf("%75c|\\%n",'/');
        System.out.printf("%76c%n",'|');
        System.out.printf("%75c \\",'/');


        System.out.printf("%n%n%30c----------------------------------------------------------------------",'-');
        System.out.printf("%n%30c%20S%15c%20S%15c",'|',"attack",'|',"block",'|');
        System.out.printf("%n%30c%18S%17c%22S%13c",'|',"heal",'|',"retreat",'|');
        System.out.printf("%n%30c----------------------------------------------------------------------%n",'-');

        System.out.printf("%n%90CP: %d%n",'H',playerLife);


        
    }
}
