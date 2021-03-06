package task4;

import java.util.Arrays;

public class FlowerUtils {

    public static Flower[] join(Flower[] a, Flower[] b) {
        Flower[] joinedArr = new  Flower[a.length+b.length];
        System.arraycopy(a,0,joinedArr,0,a.length);
        System.arraycopy(b, 0, joinedArr, a.length, b.length);

        for (int i = 0; i<a.length+b.length; i++) System.out.println(i + " Flower: " + joinedArr[i]);
        return joinedArr;
    }

    public static Flower[] joinDistinct(Flower[] a) {
        Flower[] distArr = new Flower[a.length];
        for(int i = 0; i<a.length; i++){
            Flower currVal = a[i];
            int count = 1;
            if(!currVal.equals(null)){                  //null or what?
                for (int j=i+1; j<a.length; j++) {
                    if(a[j]==currVal){
                        //local code review (vtegza): I believe there should be if and you should use '==' operand for null comparator @ 02.12.13
                        a[j].equals(null);               //null or what?
                        count++;
                    }
                }
                System.out.println("Distinct Flower: " + currVal);
            }
        }
        return distArr;
    }
public static Flower[] commonVal(Flower[] a, Flower[] b){
    Flower[] commArr = new Flower[a.length];
    //local code review (vtegza): foreach loop could be used here @ 02.12.13
    for (int i=0;i<a.length;i++){
        for(int j=0; j<b.length; j++){
            if(a[i]==b[j]){
                System.out.println("Common Flower: " + a[i]);
            }
        }
    }
    return commArr;
}

    public static Flower[] outerVal(Flower[] a, Flower[] b){
        Flower[] outerArr = new Flower[a.length];
        boolean isfound = false;
        //local code review (vtegza): foreach loop could be used here @ 02.12.13
        for (int i=0;i<a.length;i++){
            isfound = false;
            for(int j=0; j<b.length; j++){
                if(a[i]==b[j]){
                    //local code review (vtegza): you can break after you found desire element @ 02.12.13
                    isfound= true;
                }
            }
            if (!isfound){
                System.out.println("Outer Flower: " + a[i]);
            }
        }
        //local code review (vtegza): foreach loop could be used here @ 02.12.13
        for (int i=0;i<b.length;i++){
            isfound = false;
            for(int j=0; j<a.length; j++){
                if(b[i]==a[j]){
                    isfound= true;
                }
            }
            if (!isfound){
                System.out.println("Outer Flower: " + b[i]);
            }
        }
        return outerArr;
    }

        public static Flower[] leftJoin(Flower[] a, Flower[] b){
            Flower[] leftArr = new Flower[a.length+b.length];
            int k=0;
            //local code review (vtegza): foreach loop could be used here @ 02.12.13
            for(int i = 0; i<a.length; i++){
                leftArr[k++] = a[i];
                for (int j=0; j < b.length; j++)
                {
                    if (b[j] == a[i])
                        leftArr[k++] = b[j];
                }
            }
            Flower[] resultArr = new Flower[k];
            //local code review (vtegza): use System.arraycopy(..) @ 02.12.13
            for (int i=0; i<k; i++)
                resultArr[i] = leftArr[i];

            //local code review (vtegza): use for each loop or just Arrays.toString(arr) @ 02.12.13
            for (int i = 0; i<resultArr.length; i++) System.out.println("Left Join: " + resultArr[i]);
            return resultArr;
        }



}


