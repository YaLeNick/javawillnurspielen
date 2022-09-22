public class Vertex {

    public double x;
    public double y;

    public Vertex(double x, double y){
        this.x=x;
        this.y=y;
    }

    public String toString(){return "("+x+","+y+")";}

    public Double distance(){return Math.sqrt(x*x + y*y);}

    public Vertex skalarMult(double s){return new Vertex(x*s, y*s);}

    public void skalarMultMod(double s){this.x=s*x; this.y=s*y;}
}