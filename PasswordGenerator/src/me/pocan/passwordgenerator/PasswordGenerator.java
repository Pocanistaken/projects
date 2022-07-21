package me.pocan.passwordgenerator;
import java.awt.List;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Pocan
 */
public class PasswordGenerator {
    	private Integer CapsLockLenght,IntegerLenght,SpecialCharLenght,LowerCaseLenght;
	private boolean CapsLockStatus,IntegerStatus,SpecialCharsStatus,LowerCaseStatus;
    
    
    public String getPassword() {
        String password = "";
        int integer[] = {0,1,2,3,4,5,6,7,8,9};
        String string[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y"};
        String charString[] = {".",",","!",";","-","*","+","-","/","*","'","^","%","&","/","(",")","="};       
        String lowercase[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y"};
        if (CapsLockStatus == true){
            for (int i = 0; i < CapsLockLenght; i++) {
                int rnd = new Random().nextInt(string.length);
                password = password + string[rnd];   
            }

        }
        if (IntegerStatus == true){
            
            for (int i = 0; i < IntegerLenght; i++) {
                int rdnn = new Random().nextInt(integer.length);
                password = password + rdnn;
            }
         
        }
        if (SpecialCharsStatus == true){
            
            for (int i = 0; i < SpecialCharLenght; i++) {
                int rdnnn = new Random().nextInt(charString.length);
                password = password + charString[rdnnn];   
            }
         
        }   
        if (LowerCaseStatus == true){
            
            for (int i = 0; i < LowerCaseLenght; i++) {
                int rdnnnn = new Random().nextInt(lowercase.length);
                password = password + lowercase[rdnnnn];   
            }
         
        } 
        ArrayList<Character> characters = new ArrayList<Character>();
        for(char c:password.toCharArray()){
            characters.add(c);
        }
        StringBuilder output = new StringBuilder(password.length());
        while(characters.size()!=0){
            int randPicker = (int)(Math.random()*characters.size());
            output.append(characters.remove(randPicker));
        }



        
        return output.toString();

    }    
    

    
    
    public PasswordGenerator(Integer CapsLockLenght, boolean CapsLockStatus,Integer LowerCaseLenght, boolean LowerCaseStatus, Integer IntegerLenght, boolean IntegerStatus, Integer SpecialCharLenght, boolean SpecialCharsStatus) {
        
        this.CapsLockStatus = CapsLockStatus;
        this.IntegerStatus = IntegerStatus;
        this.SpecialCharsStatus = SpecialCharsStatus;
        this.CapsLockLenght = CapsLockLenght;
        this.IntegerLenght = IntegerLenght;
        this.SpecialCharLenght = SpecialCharLenght;
        this.LowerCaseLenght = LowerCaseLenght;
        this.LowerCaseStatus = LowerCaseStatus;

    }


}
                

           

    
        

            

                
        
            
        
            
        
                       
        
        
        
        
        
        
    
    
    
