package Decorations;

import Tree.Tree;

public class BallsBlue extends TreeDecorator {
    public BallsBlue(Tree tree){ super(tree); }
    public String getTree(){
        return tree.getTree() + ", Blue Balls";
    }
    public int cost(){ return 2 + tree.cost(); }
}
