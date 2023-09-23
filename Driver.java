import Decorations.Ruffles;
import Decorations.Star;
import Tree.FraserFir;
import Tree.Tree;

public class Driver {
    public static void main(String[] args){
        Tree tree = new FraserFir();
        tree = new Star(tree);
        tree = new Ruffles(tree);
        System.out.println(tree.cost());
        tree = new Star(tree);
        tree = new Ruffles(tree);
        System.out.println(tree.cost());
    }
}
