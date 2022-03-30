import java.lang.Math;
// height:3
// leaves=2(height)
// internal nodes=2(height)-1
// nodes=2(height+1)-1

public class BinaryTree {
    Object root;
    BinaryTree left;
    BinaryTree right;
    public BinaryTree(Object root){
        this.root=root;
    }
    public BinaryTree (Object root,BinaryTree left,BinaryTree right){

        this.root=root;
        this.left=left;
        this.right=right;
    }

   


    public  void set_Root(Object root){
        this.root=root;
    }
    public  Object get_Root(){
        return  root;
    }
    public void set_Left_root(BinaryTree left) {
        this.left = left;
    }

    public BinaryTree get_Left_Root(){
        return left;
    }

    public void set_Right_root(BinaryTree right) {
        this.right = right;
    }

    public BinaryTree get_Right_Root(){
        return right;
    }

//In-Order
// public String toString(){
//         StringBuffer buf=new StringBuffer("");
//         if(left!=null) buf.append(left+",");
//         buf.append(root);
//         if(right!=null) buf.append(","+right);
//         return buf+"";
// }


//Pre_Order
/*public String toString(){
        StringBuffer buf=new StringBuffer("");
        buf.append(root);
        if(left!=null) buf.append(","+left);

        if(right!=null) buf.append(","+right);
        return buf+"";
}*/
//Post _Order
public String toString(){
    StringBuffer buf=new StringBuffer("");
    if(left!=null) buf.append(left+",");

    if(right!=null) buf.append(right+",");
    buf.append(root);

    return buf+"";
}

//Is leaf
public boolean isLeaf(){
    if(left==null && right==null){
        return true;
    }
    else
        return  false;
}
//Size of the tree
    public int size(){
    if(left==null && right==null ){
        return  1;
    }

    if(left==null)
        return  1+ right.size();
    if(right==null)
        return  1+ left.size();

 else
 
   return  1+ left.size()+ right.size();
    }
public int total(Object root){
    if(root==null){
        return 0;
    }
    int lh=left.size();
    int rh=right.size();
return 1+lh+rh;




}

    //height
    public  int height(){
    if(root==null) return  -1;
    int left_n=0;
    int right_n=0;

    if(left!=null)
        left_n=1+left.height();

    if(right!=null)
        right_n=1+right.height();;

        //Conditional operator
    return left_n>right_n ? left_n: right_n;


    }

    void isfulltree(Object root){
     // height:3
// leaves=2(height)
// internal nodes=2(height)-1
// nodes=2(height+1)-1
        int left_n=0;
        int right_n=0;
    
        if(left!=null)
            left_n=1+left.height();
    
        if(right!=null)
            right_n=1+right.height();;
    
            int tnode=1+left_n+right_n;
            
            //Conditional operator
        int height= left_n > right_n ? left_n: right_n;
            int h_add=height+1;//2^h+1 -1  ...h+1
        double n=Math.pow(2, h_add);
        double h=n-1;
        if(tnode==h){
            System.out.println("tree is full");
        }
        else{
            double result=tnode-height;
            System.out.println("truee is not full, reamaining place"+result);
        }


        //leaf=2^height()
         
}
static void  rightmostsubtree(BinaryTree Btree){
 
    if(Btree.right==null){
      System.out.println(Btree.root);
    return ;
    }
    rightmostsubtree( Btree.right);
 
}
//print right tree
static void right_tree(BinaryTree bt){
   
if(bt.right!=null){
 System.out.print(bt.right);   
}

}
// print left tree
static void left_tree(BinaryTree bt){
   
    if(bt.left!=null){
     System.out.print(bt.left);   
    }
    
    }

static void swap(BinaryTree b){
    BinaryTree temp=b.left;
    b.left=b.right;
    b.right=temp;
    System.out.println(b.toString());
    
    
}
//Contains Method
    public boolean contains(Object target) {

        if (root == target) return true;

        boolean present = false;

        if (left != null) {

            if (left.toString().contains(target.toString()))
                return true;
            present = left.contains(target);

        }
        if (right != null) {
            if (right.toString().contains(target.toString()))
                return true;
            present = right.contains(target);


        }

        return present;
    }

   

        public static void main(String[] args) {
    
            BinaryTree treeB=new BinaryTree("B");
            BinaryTree treeD=new BinaryTree("D");
            BinaryTree treeE=new BinaryTree("E");
            BinaryTree treeC=new BinaryTree("C",treeD,treeE);
            BinaryTree treeA=new BinaryTree("A",treeB,treeC);
    
    // if(TreeA.isFullTree(TreeA.left)){
    //     System.out.println("tree is full");
    // }
    // else{
    //     System.out.println("tree not is full");
    // }
    //         System.out.println("Post order:");
            
    // .........
    treeA.left_tree(treeA);

//    System.out.println(treeA);
//    System.out.println();
//             System.out.println("Is A tree Leaf:"+ treeA.isLeaf());
    
//             System.out.println("Is B tree Leaf:"+ treeB.isLeaf());
    
//             System.out.println("Size of A Tree:"+treeA.size());
    
//             System.out.println("Size of B Tree:"+treeB.size());
//             System.out.println("Height of A:"+treeA.height());
//             System.out.println("Height of B:"+treeB.height());
//             //Cpntains
//             System.out.println("Contains X:"+treeA.contains("X"));
//             System.out.println("Contains B:"+treeA.contains("B"));
    
    
// System.out.println(treeA.total("A"));        
    
// TreeA.isfulltree("A");

// rightmostsubtree(treeA.right);
// swap(treeA);
}
}

