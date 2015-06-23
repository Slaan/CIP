package choco;

import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;

public class ChocoSelbst {

  public static void main(String[] args) {
    // Build model
    Model model = new CPModel();
    // Declare every letter as a variable
    IntegerVariable d = Choco.makeIntVar("d", 0, 9, Options.V_ENUM);
    IntegerVariable o = Choco.makeIntVar("o", 0, 9, Options.V_ENUM);
    IntegerVariable n = Choco.makeIntVar("n", 0, 9, Options.V_ENUM);
    IntegerVariable a = Choco.makeIntVar("a", 0, 9, Options.V_ENUM);
    IntegerVariable l = Choco.makeIntVar("l", 0, 9, Options.V_ENUM);
    IntegerVariable g = Choco.makeIntVar("g", 0, 9, Options.V_ENUM);
    IntegerVariable e = Choco.makeIntVar("e", 0, 9, Options.V_ENUM);
    IntegerVariable r = Choco.makeIntVar("r", 0, 9, Options.V_ENUM);
    IntegerVariable b = Choco.makeIntVar("b", 0, 9, Options.V_ENUM);
    IntegerVariable t = Choco.makeIntVar("t", 0, 9, Options.V_ENUM);
    
    IntegerVariable uber1 = Choco.makeIntVar("uber1",0,1,Options.V_ENUM);
    IntegerVariable uber2 = Choco.makeIntVar("uber2",0,1,Options.V_ENUM);
    IntegerVariable uber3 = Choco.makeIntVar("uber3",0,1,Options.V_ENUM);
    IntegerVariable uber4 = Choco.makeIntVar("uber4",0,1,Options.V_ENUM);
    IntegerVariable uber5 = Choco.makeIntVar("uber5",0,1,Options.V_ENUM);
    
    // donald
    // gerald
    // robert
    
    // ABC + DCE = FBE
    
    model.addConstraint(Choco.eq(                  Choco.plus(d, d),  Choco.plus(t, Choco.mult(10, uber1))));
    model.addConstraint(Choco.eq(Choco.plus(uber1, Choco.plus(l, l)), Choco.plus(r, Choco.mult(10, uber2))));
    model.addConstraint(Choco.eq(Choco.plus(uber2, Choco.plus(a, a)), Choco.plus(e, Choco.mult(10, uber3))));
    model.addConstraint(Choco.eq(Choco.plus(uber3, Choco.plus(n, r)), Choco.plus(b, Choco.mult(10, uber4))));
    model.addConstraint(Choco.eq(Choco.plus(uber4, Choco.plus(o, e)), Choco.plus(o, Choco.mult(10, uber5))));
    model.addConstraint(Choco.eq(Choco.plus(uber5, Choco.plus(d, g)), r));
    
    model.addConstraint(Choco.allDifferent(d, o, n, a, l, g, e, r, b, t));
    // Build a solver, read the model and solve it
    Solver s = new CPSolver();
    s.read(model);
    s.solve();
    // Print name value
    System.out.println(""+s.getVar(d).getVal()+s.getVar(o).getVal()+s.getVar(n).getVal()+s.getVar(a).getVal()+s.getVar(l).getVal()+s.getVar(d).getVal()+"\r\n"+
        s.getVar(g).getVal()+s.getVar(e).getVal()+s.getVar(r).getVal()+s.getVar(a).getVal()+s.getVar(l).getVal()+s.getVar(d).getVal()+"\r\n"+
        s.getVar(r).getVal()+s.getVar(o).getVal()+s.getVar(b).getVal()+s.getVar(e).getVal()+s.getVar(r).getVal()+s.getVar(t).getVal());
  }

}
