package Decorations;

import Tree.Tree;

public class Lights extends TreeDecorator {
    public Lights(Tree tree){ super(tree); }
    public int cost(){ return 5 + tree.cost(); }
}
