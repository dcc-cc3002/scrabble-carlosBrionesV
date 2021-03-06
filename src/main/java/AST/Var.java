package AST;

import AST.Operations.Operation;
import STypes.ScrabType;

/**
 * class to create vars
 * like "a"=2
 */
public class Var implements Operation {
    ScrabFactory factory;
    String key;

    /**
     * Constructor
     * @param key name of Var
     * @param factory Factory where is the value
     */
    public Var(String key,ScrabFactory factory){
        this.key=key;
        this.factory=factory;
    }

    /**
     * to evaluate Operations and Constants
     *
     * @return a ScrabType with the value of the Operation or ScrabType
     */
    @Override
    public ScrabType Eval() {
        return factory.getVar(this.key);
    }

    /**
     * change Operation 1 from Operations
     *
     * @param op the new Operation
     */
    @Override
    public void setop1(Operation op) {

    }

    /**
     * change Operation 2 from Operations
     *
     * @param op the new Operation
     */
    @Override
    public void setop2(Operation op) {

    }
}
