/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaquiz.model;

import java.util.ArrayList;
import java.util.Random;

public class Questions 
{
    String[] mList = new String[5];
    ArrayList<String> mQuestionList = new ArrayList<>();
    int mIndex;
    
    private void innitializeQuestion()
    {
        mList[0] = "What is your quest?";
        mList[1] = "What is your favorite color?";
        mList[2] = "What is the wing speed of a laden swallow?";
        mList[3] = "What is your name?";
        mList[4] = "What is the capitol of Spain?";
       // mList[5] = "What is the first law of thermodynamics?";          
    }
    private void innitializeAnswers()
    {
        mQuestionList.add("The Grail");
        mQuestionList.add("Green");
        mQuestionList.add("42");
        mQuestionList.add("Tim");
        mQuestionList.add("Madrid"); 
    }
    
    public String getQuestion()
    {
        innitializeQuestion();
        String lQuestionString;
        Random rand = new Random();
        mIndex = rand.nextInt(mList.length);
        lQuestionString = mList[mIndex];
        
        return lQuestionString;
    }
    
    public String getAnswer()
    {
        innitializeAnswers();
        String lAnswerString;
        lAnswerString = mQuestionList.get(mIndex);
        
        return lAnswerString;
    }
    
    @Override
    public String toString()
    {
        return "Question: " + getQuestion() + "\n" 
              +"Answer:   " + getAnswer();
    }
}
