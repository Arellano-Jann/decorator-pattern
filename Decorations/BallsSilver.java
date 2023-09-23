package Decorations;

import Tree.Tree;

public class BallsSilver extends TreeDecorator {
    public BallsSilver(Tree tree){ super(tree); }
    public int cost(){ return 3 + tree.cost(); }
}
