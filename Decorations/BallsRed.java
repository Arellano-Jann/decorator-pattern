package Decorations;

import Tree.Tree;

public class BallsRed extends TreeDecorator {
    public BallsRed(Tree tree){ super(tree); }
    public int cost(){ return 1 + tree.cost(); }
}
