package Decorations;

import Tree.Tree;

public class Ribbons extends TreeDecorator {
    public Ribbons(Tree tree){ super(tree); }
    public String getTree(){
        return tree.getTree() + ", Ribbons";
    }
    public int cost(){ return 2 + tree.cost(); }
}
