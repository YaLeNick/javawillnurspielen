import java.beans.PropertyVetoException;

public class Test {

    public static void main(String args[]){

        Vertex v1 = new Vertex(4, 3);
        Vertex v2 = new Vertex(34, 2);
        Vertex vv = new Vertex(0, 0);

        /*System.out.println(v1);
        System.out.println(v1.distance());

        System.out.println(v2);
        System.out.println(v2.distance());

        System.out.println(vv);
        System.out.println(vv.distance());
        */

        v1.skalarMultMod(3);
        System.out.println(v1);
    }
}
