package thread_new;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

//this and Node class are made to solve binary tree problem
public class TreeSizeCalculator implements Callable<Integer> {

    public Node root;
    public ExecutorService es;

    public TreeSizeCalculator(Node root , ExecutorService es){
        this.root = root;
        this.es = es;
    }


    @Override
    public Integer call() throws Exception {
        if(root == null){
            return 0;
        }

        TreeSizeCalculator leftTree = new TreeSizeCalculator(root.left ,es);
        TreeSizeCalculator rightTree = new TreeSizeCalculator(root.right , es);

        Future<Integer> leftSize = es.submit(leftTree);
        Future<Integer> rightSize = es.submit(rightTree);

        return leftSize.get() + rightSize.get() + 1;
    }
}
