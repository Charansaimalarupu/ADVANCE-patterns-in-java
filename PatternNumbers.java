import java.util.*;
public class PatternNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("HALF PARAMID WITH NO'S");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);

        }
        System.out.println();
    }
    System.out.println("INVERTED HALF PARAMID WITH NUMBERS");
    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print(j);
    }
    System.out.println();
}
System.out.println("FLOYD'S TRIANGLE");
int count=1;
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print(count++);
}
System.out.println();
}
System.out.println("0-1 TRIANGLE");
int one=0;
int zero=0;
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        if(one==0){
            System.out.print(1);
            one=1;
            zero=0;
        }
        else{
            System.out.print(0);
            zero=1;
            one=0;
        }
    }
    System.out.println();
}
System.out.println("BUTTERFIY PATTERN");
for(int i=1;i<=n;i++){
    for(int j=1;j<=2*n;j++){
        if(j<=i || j>=2*n-i+1){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
        }
        System.out.println();
    }
    for(int i=n;i>=1;i--){
        for(int j=1;j<=2*n;j++){
            if(j<=i || j>=2*n-i+1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }
            System.out.println();
        }
        System.out.println("solid Rhombus");
        for (int i=1;i<=n;i++){
            for(int j=1;j<=2*n-i;j++){
                if(j>=(2*n-i-5)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("number pyramid");
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("number pyramid");
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.err.println();
        }
        System.out.println("PALINDROMIC PATTERN");
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.err.println();
        }
        System.out.println("DIAMOND PATTERN");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
    
}

}
    


