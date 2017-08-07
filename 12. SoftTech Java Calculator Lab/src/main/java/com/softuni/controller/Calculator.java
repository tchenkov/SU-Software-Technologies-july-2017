package com.softuni.controller;

/**
 * Created by todor on 7.08.2017 г..
 */
public class Calculator {
    private double leftOperand;
    private double rightOperand;
    private String operator;
    
    public Calculator(double leftOperand, double rightOperand, String operator) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }
    
    public double getLeftOperand() {
        return leftOperand;
    }
    
    public void setLeftOperand(double leftOperand) {
        this.leftOperand = leftOperand;
    }
    
    public double getRightOperand() {
        return rightOperand;
    }
    
    public void setRightOperand(double rightOperand) {
        this.rightOperand = rightOperand;
    }
    
    public String getOperator() {
        return operator;
    }
    
    public void setOperator(String operator) {
        this.operator = operator;
    }
    
    public double calculateResult() {
        double result;
        
        switch (this.operator) {
            case "+":
                result = this.leftOperand + this.rightOperand;
                break;
            case "-":
                result = this.leftOperand - this.rightOperand;
                break;
            case "*":
                result = this.leftOperand * this.rightOperand;
                break;
            case "/":
                result = this.leftOperand / this.rightOperand;
                break;
            default:
                result = 0;
        }
        
        return result;
    }
    
    public String spellCaster (double number){
        return number == (long) number ?
                String.valueOf((long) number) :
                String.valueOf(number);
    }
}
