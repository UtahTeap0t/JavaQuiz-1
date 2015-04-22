/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaquiz.model;

public class DefaultModel implements Model{

    private String mQuestion;
    private String mAnswer;
    
    @Override
    public String getQuestions() {
        return mQuestion;     
    }

    @Override
    public void setQuestions(String aQuestion) {
        mQuestion = aQuestion;
    }

    @Override
    public String getAnswers() {
        return mAnswer;  
    }

    @Override
    public void setAnswers(String aAnswer) {
        mAnswer = aAnswer;
    }
    
}
