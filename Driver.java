import Decorations.BallsBlue;
import Decorations.BallsRed;
import Decorations.BallsSilver;
import Decorations.Leds;
import Decorations.Lights;
import Decorations.Ribbons;
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
        tree = new BallsBlue(tree);
        tree = new BallsRed(tree);
        tree = new BallsSilver(tree);
        System.out.println(tree.cost());
        tree = new Ribbons(tree);
        System.out.println(tree.cost());
        tree = new Lights(tree);
        System.out.println(tree.cost());
        tree = new Leds(tree);
        System.out.println(tree.cost());
    }
}
