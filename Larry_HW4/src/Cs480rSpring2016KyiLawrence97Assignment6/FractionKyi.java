package Cs480rSpring2016KyiLawrence97Assignment6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kyi
 */
public class FractionKyi {
	
	private int num;
	private int denom;
	//private double fraction;

	
	//fractionX1 ::num=4 ; denom=1
	//fractionY1 ::num=3 ; denom=1
	
	//fractionX2::num=-4,denom=1
	//fractionY2::num=5,denom=1
	
	public FractionKyi(){}
	public FractionKyi(int num, int denom){
		this.num=num;
		this.denom=denom;
	}
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int numerator) {
		this.num = numerator;
	}
	public int getDenom() {
		return denom;
	}
	public void setDenom(int denominator) {
		this.denom = denominator;
	}

	@Override
	public String toString() {
		return num + "/"+denom;
	}

    }