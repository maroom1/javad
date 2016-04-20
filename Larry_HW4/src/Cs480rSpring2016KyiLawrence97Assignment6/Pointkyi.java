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
public class Pointkyi{
	
	private FractionKyi fx;//fractionX1 ::num=4 ; denom=1
	private FractionKyi fy;//fractionY1 ::num=3 ; denom=1
	
	//Default Constructor
	public Pointkyi() {}
	
	public Pointkyi(FractionKyi fx,FractionKyi fy){
		this.fx=fx;
		this.fy=fy;
	}
	
	//Copy Constructor
	public Pointkyi(Pointkyi aPointkyi){
		this(aPointkyi.fx,aPointkyi.fy);
	}
	
	//Destructor : It not used in Java.sicne Java has garbage collection in place to destroy unused objects.
	//Assignment Operator Function
	
	//Operations
	public void moveBy(FractionKyi delX, FractionKyi delY) {
		
		// move orig fraction by given fraction
		// orig point X coordinates
		int nx = this.fx.getNum();
		// int dx = this.fx.getDenom();

		// new point X coordinates
		int ndelX = delX.getNum();
		// int ddelX = delX.getDenom();

		// moving X coordinates
		this.fx.setNum(ndelX-nx);
		// ignoring the denominator to keep logic simple
		//this.fx.setDenom(dx + ddelX);

		// orig point Y coordinates
		int ny = this.fy.getNum();
		// int dy = this.fy.getDenom();

		// new point Y coordinates
		int ndelY = delY.getNum();
		// int ddelY = delY.getDenom();

		// moving Y coordinates
		this.fy.setNum(ndelY- ny);
		// ignoring the denominator to keep logic simple
		//this.fy.setDenom(dy + ddelY);
	}
	
	public void moveBy(int iOld) { // update as needed
		moveBy(new FractionKyi(iOld,1), new FractionKyi(iOld,1));
	}

	public void flipByX() { // update as needed
		fx.setNum(-fx.getNum());
	}

	public void flipByY() { // update as needed
		fy.setNum(-fy.getNum());
	}

	public void flipThroughOrigin() { // update as needed
		fx.setNum(-fx.getNum());
		fy.setNum(-fy.getNum());
	}

	public void print() { // update as needed
		System.out.println(this.toString());
	}

	public FractionKyi getFx() {
		return fx;
	}

	public void setFx(FractionKyi fx) {
		this.fx = fx;
	}

	public FractionKyi getFy() {
		return fy;
	}

	public void setFy(FractionKyi fy) {
		this.fy = fy;
	}

	// Other method members
	@Override
	public String toString() {
		return "Point(" + fx + ", " + fy + ")";
	}
	
}

