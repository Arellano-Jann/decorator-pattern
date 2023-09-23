package Decorations;

import Tree.Tree;

public class Ruffles extends TreeDecorator {
    public Ruffles(Tree tree){ super(tree); }
    public String getTree(){
        return tree.getTree() + ", Ruffles";
    }
    public int cost(){ return 1 + tree.cost(); }
}
