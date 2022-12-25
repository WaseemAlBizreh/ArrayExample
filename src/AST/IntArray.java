package AST;

import java.util.ArrayList;

public class IntArray extends Array{
    ArrayList<Integer> integers;

    public IntArray() {
        this.integers = new ArrayList<>();
    }

    public void addChild(int element){
        this.integers.add(element);
    }

    @Override
    public String toString() {
        return "IntArray { array = " + integers + " }";
    }
}
