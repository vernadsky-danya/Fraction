package com.company;

/**
 * Created by student1 on 16.01.17.
 */
public class Fraction {
    int n;
    int d;

    public Fraction(int n ,int d) {
        this.n = n;
        this.d = d;
    }

    public void add(Fraction other){
        this.n = this.n * other.d;
        int other_n = other.n * this.d;
        this.n +=other_n;
        this.d *= other.d;

    }
    public void substract(Fraction other){
        Fraction o = new Fraction(-other.n, other.d);
        this.add(o);
    }
}
