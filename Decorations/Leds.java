package Decorations;

import Tree.Tree;

public class Leds extends TreeDecorator {
    public Leds(Tree tree){ super(tree); }
    public String getTree(){
        return tree.getTree() + ", Leds";
    }
    public int cost(){ return 10 + tree.cost(); }
}
