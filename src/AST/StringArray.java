package AST;

import java.util.ArrayList;

public class StringArray extends Array{
    ArrayList<String> strings;

    public StringArray() {
        this.strings = new ArrayList<>();
    }

   public void addChild(String text){
        this.strings.add(text);
    }

    @Override
    public String toString() {
        return "StringArray { array = " + strings + " }";
    }
}
