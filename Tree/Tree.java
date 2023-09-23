package Tree;
public abstract class Tree {
    String description = "tree";
    public String getTree(){
        return description;
    }
    public abstract int cost();
}