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
            for(int j=1;j<n*2;i++){



            }

        }
    }

}
