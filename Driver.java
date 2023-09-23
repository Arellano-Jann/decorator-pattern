import Tree.*;
import Decorations.*;

public class Driver {
    public static void main(String[] args){
        Tree tree = new ColoradoBlueSpruce();
        tree = new Star(tree);
        tree = new Ruffles(tree);
        tree = new Star(tree);
        tree = new Ruffles(tree);
        System.out.println(tree.getTree() + " and it costs $" + tree.cost());
        
    }
}
