import java.beans.PropertyVetoException;

public class Test {

    public static void main(String args[]){

        Vertex v1 = new Vertex(4, 3);
        Vertex v2 = new Vertex(5, 10);
        Vertex v3 = new Vertex(0, 0);
        Vertex v4 = new Vertex(4, 3);

        GeometricObject g1 = new GeometricObject(v2, 30, 40);
        GeometricObject g2 = new GeometricObject(v2, 30, 40);
        GeometricObject g3 = new GeometricObject(12, 56, 40, 60);

        System.out.println(g2);
        System.out.println(g3);
    }
}
