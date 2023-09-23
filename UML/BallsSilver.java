

public class BallsSilver extends TreeDecorator {
    public BallsSilver(Tree tree){ super(tree); }
    public String getTree(){
        return tree.getTree() + ", Silver Balls";
    }
    public int cost(){ return 3 + tree.cost(); }
}
