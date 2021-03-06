package STypes;

import AST.Operations.Operation;
import operands.Slogic;

/**
 * abstract class for ScrabTypes
 */
public abstract class AbstracType implements ScrabType {


    /**
     * to evaluate Operations and Constants
     *
     * @return a ScrabType with the value of the Operation or ScrabType
     */
    @Override
    public ScrabType Eval() {
        return this;
    }

    @Override
    public ScrabString toScrabString() {
        return null;
    }

    /**
     * logic operation and for AST
     *
     * @param cons Logic ScrabType
     * @return ScrabType with the result
     */
    @Override
    public Slogic And(Operation cons) {
        return null;
    }

    /**
     * logic operation or for AST
     *
     * @param cons Logic ScrabType
     * @return ScrabType with the result
     */
    @Override
    public Slogic Or(Operation cons) {
        return null;
    }

    /**
     * addition operation for AST
     *
     * @param cons number constant
     * @return ScrabType with the result
     */
    @Override
    public ScrabType Add(Operation cons) {
        return null;
    }

    /**
     * subtraction operation for AST
     *
     * @param cons number ScrabType
     * @return ScrabType with the result
     */
    @Override
    public ScrabType Minus(Operation cons) {
        return null;
    }

    /**
     * division operation for AST
     *
     * @param cons Number ScrabType
     * @return ScrabType with the result
     */
    @Override
    public ScrabType Div(Operation cons) {
        return null;
    }

    /**
     * multiplication operation for AST
     *
     * @param cons Number ScrabType
     * @return ScrabType with the result
     */
    @Override
    public ScrabType Mult(Operation cons) {
        return null;
    }

    /**
     * negation operation for AST
     *
     * @return ScrabType with the result
     */
    @Override
    public ScrabType Neg() {
        return null;
    }

    /**
     * change Operation 1 from Operations
     * in ScrabbleTypes does nothing
     * @param op the new Operation
     */
    public void setop1(Operation op){}

    /**
     * change Operation 2 from Operations
     * in Scrabble types does nothing
     * @param op the new Operation
     */
    public void setop2(Operation op){}
}