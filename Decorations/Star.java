package Decorations;

import Tree.Tree;

public class Star extends TreeDecorator {
    public Star(Tree tree){ 
        super(tree);
    }
    public String getTree(){
        return tree.getTree() + ", Star";
    }
    public int cost(){ 
        if (hasStar) {
            System.out.println("This tree already has a star!");
            return 0 + tree.cost();
        }
        else{
            this.hasStar = true;
            return 1 + tree.cost(); 
        }
    }
}
