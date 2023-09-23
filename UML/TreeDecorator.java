
public abstract class TreeDecorator extends Tree {
   Tree tree; 
   boolean hasStar = false;
   TreeDecorator(Tree tree){ this.tree = tree; }
   public abstract String getTree();
   public abstract int cost();
}
