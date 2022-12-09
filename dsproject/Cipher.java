/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproject;

/**
 *
 * @author shahad mohammed
 */
public class Cipher {

    public static void main(String[] args) {

        //====================================== ENCODER =============================================  

        /*
         // the function will take string text and integr number  
         ALGORITHM encoder(plaintext , number) 
        
         create String ciphertext
         FOR i=0 to plaintext.length-1     loop for each letter in the String 
         Create char ch                    create char variable "ch" take the letter in the string at postion i 
         ch <-- plaintext.charAt(i)
        
        
         // Because we don't want to encrypt the space ( we put the space in the cipher text as it is) 
         IF ch is space THEN
         ciphertext += ' '
         END IF 
        
         // we check if "ch" is small letter 
         IF ch is lower case letter THEN 
         ch = (char) (ch + number)
         IF ch > 'z'      // Inner if , if  ch is greater then 'z' we subtract 26 from ch to return it to alphabet
         ch = (char) (ch - 26)
         END IF 
         ciphertext += ch;
         // we check if "ch" is upper letter 
        IF ch is upper case letter THEN
         ch = (char) (ch + number)
         IF ch > 'Z'    // Inner if , if  ch is greater then 'Z' we subtract 26 from ch to return it to alphabet
         ch = (char) (ch - 26)
         END IF 
         ciphertext += ch;
       
         RETURN ciphertext
        
        
    
         */
    }

    public String encoder(String plaintext, int number) {
        String ciphertext = "";

        for (int i = 0; i < plaintext.length(); i++) {
            char ch = plaintext.charAt(i);

            if (ch == ' ') {
                ciphertext += ' ';
            }

            if (Character.isLowerCase(ch)) {
                ch = (char) (ch + number);

                if (ch > 'z') {
                    ch = (char) (ch - 26);
                }
                ciphertext += ch;
            }
            if (Character.isUpperCase(ch)) {
                ch = (char) ((ch + number));
                
                if (ch > 'Z') {
                    ch = (char) (ch - 26);
                }
                ciphertext += ch;
            }
        }
        return ciphertext;
    }

//====================================== DECODER =============================================  
    /* 
     ALGORITHM decoder( cipherText , number) 
     create String plainText

     FOR i=0 to cipherText.length-1
     create char ch
     ch <-- cipherText.charAt(i)
		
     IF ch is a space 
     plainText = plainText + ' '

     // we check if "ch" is small letter and in the range of the alphabet between a and z 
     IF ch >= 'a' AND ch <= 'z'
     ch = ch - number // "ch - number" is casted to char 
     IF ch < 'a' 
     ch = (char) (ch + 26 ); 
     // after reposition if ch is less than a .. we move ch it to the end of alphabet and the whole bracket is casted to char
     plainText = plainText + ch

     ELSE IF ch >= "A" AND ch <= "Z"
     ch = ch - number // "ch - number" is casted to char 
     IF ch < 'A' 
     ch = (char) (ch + 26 );  
     // after reposition if ch is less than A .. we move ch it to the end of alphabet and the whole bracket is casted to char
     plainText = plainText + ch
	
     RETURN plainText

     */
    public String decoder(String cipherText, int number) {
        String plainText = "";

        for (int i = 0; i < cipherText.length(); i++) {
            char ch = cipherText.charAt(i);

            if (ch == ' ') {
                plainText += ' ';
            }

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - number);

                if (ch < 'a') {
                    ch = (char) (ch + 26);
                }

                plainText += ch;
            }

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch - number);

                if (ch < 'A') {
                    ch = (char) (ch + 26);
                }

                plainText += ch;
            }

        }

        return plainText;
    }
}
