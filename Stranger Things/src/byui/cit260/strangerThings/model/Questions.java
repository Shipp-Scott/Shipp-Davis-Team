/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.strangerThings.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author sshipp57
 */
public class Questions implements Serializable{
    
    // class
    private String question;
    private double answer;
    private double correctAnswer;
    private double equation;

    public Questions() {
    }

    
    
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    public double getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(double correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public double getEquation() {
        return equation;
    }

    public void setEquation(double equation) {
        this.equation = equation;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.question);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.answer) ^ (Double.doubleToLongBits(this.answer) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.correctAnswer) ^ (Double.doubleToLongBits(this.correctAnswer) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.equation) ^ (Double.doubleToLongBits(this.equation) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Questions other = (Questions) obj;
        if (Double.doubleToLongBits(this.answer) != Double.doubleToLongBits(other.answer)) {
            return false;
        }
        if (Double.doubleToLongBits(this.correctAnswer) != Double.doubleToLongBits(other.correctAnswer)) {
            return false;
        }
        if (Double.doubleToLongBits(this.equation) != Double.doubleToLongBits(other.equation)) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Questions{" + "question=" + question + ", answer=" + answer + ", correctAnswer=" + correctAnswer + ", equation=" + equation + '}';
    }
    
    
}
