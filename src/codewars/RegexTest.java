/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

import java.util.Arrays;

/**
 *
 * @author Oy
 */
public class RegexTest {
    
    public static final String testString = "Betrayed cheerful declared end and. "
                                            + "Questions we additions is extremely incommode. "
                                                + "Next half add call them eat face. "
                                            + "Age lived smile six defer bed their few";
    
    public static void main(String... args)
    {
        System.out.println(testString.matches("\\w.*"));
        String[] testStringArray = testString.split("\\s+");
        System.out.println(testStringArray.length);
        
        for(String currentWord: testStringArray)
        {
            System.out.println(currentWord);
        }
        
        System.out.println(testString.replaceAll("\\s+", "\t"));
    }
}
