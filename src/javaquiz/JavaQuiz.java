/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaquiz;

import java.util.Scanner;
import javaquiz.model.Questions;

public class JavaQuiz {

    public static void main(String[] args) {

        char lPrompt;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like a question?<y or n>");
        lPrompt = scan.nextLine().charAt(0);
        
        while(lPrompt == 'Y' || lPrompt == 'y')
        {
            Questions lQuestions = new Questions();
            //String lQuestion = lQuestions.getQuestion();
            //String lAnswer = lQuestions.getAnswer();
            //System.out.println(lQuestion);
            //System.out.println(lAnswer);
            System.out.println(lQuestions.toString());
            
            System.out.println("Would you like a question?<y or n>");
            lPrompt = scan.nextLine().charAt(0);
        }
    }
    
}
