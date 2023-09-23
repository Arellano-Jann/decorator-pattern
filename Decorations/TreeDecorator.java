package Decorations;
import Tree.Tree;

public abstract class TreeDecorator extends Tree {
   Tree tree; 
   boolean hasStar = false;
   TreeDecorator(Tree tree){ this.tree = tree; }
   public abstract int cost();
}
