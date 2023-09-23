package Decorations;

import Tree.Tree;

public class Leds extends TreeDecorator {
    public Leds(Tree tree){ super(tree); }
    public int cost(){ return 10 + tree.cost(); }
}
