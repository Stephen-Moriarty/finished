import java.util.Scanner;
public class SmallFreeRoam {
    static Scanner k = new Scanner(System.in);
    public static void main(String[] args){
        /*
        I took WAY longer on this than I should've. ;-;
        */
        char[] line = new char[5];
        char cont[] = {'a','d'}; //The controls
        int p = 1;
        int g = 3;
        boolean atGoal = false;
        System.out.println("This \"game\" has regular keyboard controls w,a,s,d.");
        System.out.println("But since this game is only 1 dimensional, there is only 'a' and 'd'.");
        System.out.println("Aka a=left, d=right.\n");
        //Field filler
        for(int i=0; i<line.length; i++){
            line[i] = '0';
        }
        do{
            for(int i=0; i<line.length; i++){
                if(i==g){
                    line[i] = 'g';
                }else if(i==p){
                    line[i] = 'p';
                }else{
                    line[i] = '0';
                }
            }
            System.out.println("Your current postition is = " + p);
            //Printer
            for(int i=0; i<line.length; i++){
                System.out.print(line[i]);
            }
            System.out.println();
            //Prompt
            System.out.print("Where do you want to move\n>");
            String playChoice="0";
            playChoice = k.next();
            char move = '0';
            move = playChoice.charAt(0);

            System.out.println();
            //Keep player in bounds!
            if(p<0){
                p=0;
            }else if(p==line.length){
                p=line.length-1;
            }
            //Changing the old player's position into "empty" field
            if(move==cont[0]){
                line[p] = '0';
                line[p--] = 'p';
            }else if(move==cont[1]){
                line[p] = '0';
                line[p++]= 'p';
            }

            if(p==g){
                atGoal= true;
                System.out.println("You got to the goal.");
            }else{
                atGoal= false;
            }
        }while(!atGoal);
    }
}
