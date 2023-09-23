package Decorations;

import Tree.Tree;

public class Ribbons extends TreeDecorator {
    public Ribbons(Tree tree){ super(tree); }
    public int cost(){ return 2 + tree.cost(); }
}
