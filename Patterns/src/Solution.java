public class Solution {
    public void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
    public  void pattern3(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(j+1);

            }
            System.out.println();
        }
    }
    public void pattern4(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
    public void pattern5(int n){
        for(int i=0;i<n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public void pattern6(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    public void pattern7(int n){
        for(int i=1;i<=n;i++){
           // print space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // print *
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public void pattern8(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*n-2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern9(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*n-2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }

    public void pattern10(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public void pattern11(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            int i1=num;
            for(int j=1;j<=i;j++){
                System.out.print(i1);
                i1=i1==1?0:1;

            }
            num=num==1?0:1;

            System.out.println();

        }
    }
    public void pattern12(int n){
        int count =1;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(count);
                count++;
            }

            for(int j=1;j<=2*n-2*i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                count--;
                System.out.print(count);
               ;
            }
            System.out.println();
        }
    }

    public void pattern13(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }

    }

    public void pattern14(int n){
        for(int i=1;i<=n;i++){
            char c='A';
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c=(char)('A'+j);

            }
            System.out.println();
        }
    }

    public void pattern15(int n){
        for(int i=1;i<=n;i++){
            char c='A';
            for(int j=1;j<=n-i+1;j++){
                System.out.print(c);
                c=(char)('A'+j);
            }
            System.out.println();
        }
    }
    public void pattern16(int n){
        char c='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c);

            }
            c=(char) ('A'+i);
            System.out.println();

        }
    }

}
