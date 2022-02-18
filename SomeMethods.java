import java.util.Random;
import java.util.Scanner;
public class SomeMethods {
    static Scanner k = new Scanner(System.in);
    public static void main(String[] args){
        //Tea party
        Random r = new Random();
        int tea = 0;
        int candy = 0;
        System.out.print("Give me the amount of candy.\n>");
        candy = k.nextInt();
        System.out.print("Give me the amount of tea.\n>");
        tea = k.nextInt();
        
        teaParty(tea, candy);
        if(teaParty(tea, candy) == 0){
            System.out.println(teaParty(tea, candy) + "=bad");
        }else if(teaParty(tea, candy) == 1){
            System.out.println(teaParty(tea, candy) + "=good");
        }else{
            System.out.println(teaParty(tea, candy) + "=great");
        }


        //Threes:
        spacer();
        int[] myArray = new int[10];
        for (int i=0; i<=myArray.length-1; i++){
            myArray[i] = r.nextInt(10)+1;
        }
        myArray.toString();
        System.out.print("My array is = ");
        for(int row : myArray){
            System.out.print(row+ ",");
        }
        
        System.out.println("\n" + haveThree(myArray));

    //String
    spacer();
    System.out.print("Hello user, give me a string.\n>");
        String userString = k.next();
        withoutEnd(userString);
    
    }

    // Works fine but (technically) wrong, because, I unfortunately couldn't figure out how to do it with a return type
    public static void withoutEnd(String userString){
        String newString = userString;
        for(int i=1;  i<userString.length()-1; i++){
            System.out.print(newString.charAt(i));
        }
    }

    public static int teaParty(int tea, int candy){
        
        int conclusion = 0;
        if(tea >= candy*2 || candy >= tea*2){
            conclusion = 2;
        }else if(tea>=5 && candy>=5){
            conclusion = 1;
        }
        else if(tea<5 || candy<5){
            conclusion = 0;
        }
        return conclusion;
    }

    public static boolean haveThree(int[] myArray) {
        boolean found = false;
        int counter = 0;
          
        for (int i = 0; i<myArray.length-1; i++) {
            if (myArray[i] != 3){
                found = false;
            }
            if (myArray[i] == 3 && found == true){
                return false;
            }
            if (myArray[i] == 3 && found == false) {
              found = true;
              counter++;
            }
        }
        
        if (counter == 3){
            return true;
        }else{
            return false;
        }


    } 
    public static void spacer(){
        System.out.println();
    } 

    

}


