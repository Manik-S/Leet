/*
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
    @Override
    public boolean equals(Object obj)
    {
        Node n =(Node) obj;
        if(this.val == n.val) return true;
        return false;
    }
    @Override
    public int hashCode() {
    return val != null ? val.hashCode() : 0;
    }
}*/


class Solution{
    public Node cloneGraph(Node node) {
        if(node==null)return null;
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        HashMap<Integer,Node>newNodes=new HashMap<>();
        newNodes.put(node.val,new Node(node.val));
        while(!q.isEmpty())
        {  
            Node temp=q.remove();
            ArrayList<Node> newAdjacent=new ArrayList<>();     
            for(Node n:temp.neighbors)
            {
                Node nod=null;
                if(newNodes.containsKey(n.val))
                {
                    nod=newNodes.get(n.val);
                }
                else
                {
                    nod=new Node(n.val);
                    q.add(n);
                    newNodes.put(n.val,nod);
                }
                newAdjacent.add(nod);               
            }
            Node newNode=newNodes.get(temp.val);
            newNode.neighbors=newAdjacent;
        } 
        return newNodes.get(1);       
    }
}