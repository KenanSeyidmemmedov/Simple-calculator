import java.util.Scanner;

public class kalkulyator {
    public static void riyazii(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Emeliyyati secin \n 1.Toplama \n 2.Cixma \n 3.Vurma \n 4.Bolme");
        int emel=sc.nextInt();
        System.out.println("1-ci ededi daxil edin ");
        int a=sc.nextInt();
        System.out.println("2-ci ededi daxil edin ");
        int b=sc.nextInt();
        if(emel==1){

            hesab.topla(a,b);
        } else if (emel==2) {

            hesab.cixma(a,b);
        } else if (emel==3) {

            hesab.vurma(a,b);
        } else if (emel==4) {

            hesab.bolme(a,b);
        }
        else {
            System.out.println("secdiyiniz emel teyin olunmamisdir");
        }

    }
    public class hesab {
        public static void topla(int a, int b){
            int cem =a+b;
            System.out.println("Cem= "+cem);
        }
        public static void cixma(int a, int b){
            int ferq =a-b;
            System.out.println("ferq= "+ferq);
        }
        public static void vurma(int a, int b){
            int hasil =a*b;
            System.out.println("hasil= "+hasil);
        }
        public static void bolme(int a, int b){
            int qismet =a/b;
            System.out.println("qismet= "+qismet);
        }

    }

}
