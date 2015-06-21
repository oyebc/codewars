/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

/**
 *
 * @author Oy
 */
public class SearchEngine {
    
    static int find(String needle, String haystack){
        String[] haystackArray= haystack.split("\\s+");
        int i=0; 
        for (String token: haystackArray)
        {
            if(compareString(token, needle))
                break;
            i+=token.length()+1;
        }
        
        return i;
    }
    
    static boolean compareString(String token, String needle)
    {
        boolean stringMatch = true;
        char [] tokenChars = token.toCharArray();
        for (int i=0; i<tokenChars.length;i++)
        {
            if (tokenChars[i]!=needle.charAt(i)&&'_'!=needle.charAt(i))
            {   stringMatch = false; 
                break;
            }
        }
        return stringMatch;
        
    }
    
    public static void main(String... args)
    {
        String haystack ="Once upon a midnight dreary, while I pondered, weak and weary";
        System.out.println(SearchEngine.find("Once", haystack));
    }
}
