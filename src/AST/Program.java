package AST;

import java.util.ArrayList;

public class Program {
    ArrayList<Array> children;

    public Program() {
        this.children = new ArrayList<>();
    }

    public void addChild(Array array){
        this.children.add(array);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Array child : this.children){
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
