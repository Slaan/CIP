package output;

import choco.Choco;
import choco.Options;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Chocobo {

	static int counter;
	static Model model;

  public static void main(String[] args) {
    //Init Vars
    counter = 0;
    
    // Build model
    model = new CPModel();
    // Declare every letter as a variable

	IntegerVariable D = Choco.makeIntVar("D", 0, 9, Options.V_ENUM); 
	IntegerVariable E = Choco.makeIntVar("E", 0, 9, Options.V_ENUM); 
	IntegerVariable F = Choco.makeIntVar("F", 0, 9, Options.V_ENUM); 
	IntegerVariable G = Choco.makeIntVar("G", 0, 9, Options.V_ENUM); 
	IntegerVariable A = Choco.makeIntVar("A", 0, 9, Options.V_ENUM); 
	IntegerVariable B = Choco.makeIntVar("B", 0, 9, Options.V_ENUM); 
	IntegerVariable C = Choco.makeIntVar("C", 0, 9, Options.V_ENUM); 
	IntegerVariable H = Choco.makeIntVar("H", 0, 9, Options.V_ENUM); 
	IntegerVariable I = Choco.makeIntVar("I", 0, 9, Options.V_ENUM); 
	IntegerVariable J = Choco.makeIntVar("J", 0, 9, Options.V_ENUM); 

	
	
	
	stuff(
	Arrays.asList(A, B, C), 
		Arrays.asList(D, C, E), 
		Arrays.asList(F, B, E));

	stuff(
	Arrays.asList(A, E), 
		Arrays.asList(D, A, G), 
		Arrays.asList(G, G, D));

	stuff(
	Arrays.asList(G, H, F), 
		Arrays.asList(G, G, D), 
		Arrays.asList(A, B, C));

	stuff(
	Arrays.asList(G, H, F), 
		Arrays.asList(I, J, D), 
		Arrays.asList(J, E, C));

	stuff(
	Arrays.asList(J, E, C), 
		Arrays.asList(A, E), 
		Arrays.asList(F, B, E));

	stuff(
	Arrays.asList(D, C, E), 
		Arrays.asList(D, A, G), 
		Arrays.asList(I, J, D));
	
	model.addConstraint(Choco.allDifferent(D, E, F, G, A, B, C, H, I, J));
	
	// Build a solver, read the model and solve it
    Solver s = new CPSolver();
    s.read(model);
    s.solve();
    // Print name value
    System.out.println(s.getVar(D)); 
    System.out.println(s.getVar(E)); 
    System.out.println(s.getVar(F)); 
    System.out.println(s.getVar(G)); 
    System.out.println(s.getVar(A)); 
    System.out.println(s.getVar(B)); 
    System.out.println(s.getVar(C)); 
    System.out.println(s.getVar(H)); 
    System.out.println(s.getVar(I)); 
    System.out.println(s.getVar(J)); 

  }
  
  public static void stuff(List<IntegerVariable> no1, List<IntegerVariable> no2, List<IntegerVariable> erg) {
  	Collections.reverse(no1);
    Collections.reverse(no2);
    Collections.reverse(erg);
  	
  	int length = erg.size();
	if(length<no1.size()&&length>no2.size()) {
		System.out.println("Not a valid Puzzle");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	}
	IntegerVariable uber1 = Choco.makeIntVar("uber"+counter,0,1,Options.V_ENUM);
	model.addConstraint(Choco.eq(                  Choco.plus(no1.get(0), no2.get(0)),  Choco.plus(erg.get(0), Choco.mult(10, uber1))));
	counter++;
	
	for(int i=1;i<length-1;i++) {
		IntegerVariable uber2 = Choco.makeIntVar("uber"+counter,0,1,Options.V_ENUM);
		model.addConstraint(Choco.eq(Choco.plus(uber1, Choco.plus(no1.get(i), no2.get(i))), Choco.plus(erg.get(i), Choco.mult(10, uber2))));
		uber1=uber2;
		counter++;
	}
	
	boolean no1_smaller=false;
	boolean no2_smaller=false;
	if (no1.size()<length) {
		no1_smaller=true;
	}
	if (no2.size()<length) {
		no2_smaller=true;
	}
	if(no1_smaller&&no2_smaller) {
		model.addConstraint(Choco.eq(1, erg.get(length-1)));
	} else if (no1_smaller&&!no2_smaller) {
		model.addConstraint(Choco.eq(Choco.plus(uber1, no2.get(length-1)), erg.get(length-1)));
	} else if (no2_smaller&&!no1_smaller) {
		model.addConstraint(Choco.eq(Choco.plus(uber1, no1.get(length-1)), erg.get(length-1)));
	} else {
		model.addConstraint(Choco.eq(Choco.plus(uber1, Choco.plus(no1.get(length-1), no2.get(length-1))), erg.get(length-1)));
	}
  }

}