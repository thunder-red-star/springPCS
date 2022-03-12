public class LLNode {
    private String cargo;
    private LLNode nextNode;
    
    public LLNode(String cargo) {
        this.cargo = cargo;                                                                                                                                                 
    }                                                                                                                                                                       
    
    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;    
    }
    
    public LLNode getNextNode() {
        return nextNode;                                                                                                                                                    
    }
    
    public void setNextNode(LLNode nextNode) {
        this.nextNode = nextNode;    
    }
    
    public String toString() {
        return cargo;    
    }
}
