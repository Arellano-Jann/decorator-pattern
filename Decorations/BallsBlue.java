package Decorations;

import Tree.Tree;

public class BallsBlue extends TreeDecorator {
    public BallsBlue(Tree tree){ super(tree); }
    public int cost(){ return 2 + tree.cost(); }
}
