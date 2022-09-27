import java.beans.PropertyVetoException;

public class Test {

    public static void main(String args[]){

        Vertex v1 = new Vertex(4, 3);
        Vertex v2 = new Vertex(5, 10);
        Vertex v3 = new Vertex(0, 0);
        Vertex v4 = new Vertex(4, 3);

        System.out.println(v1.distance(v2));
    }
}
