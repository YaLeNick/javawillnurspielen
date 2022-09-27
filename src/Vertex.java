public class Vertex {

    public double x;
    public double y;

    public Vertex(double x, double y){
        this.x=x;
        this.y=y;
    }

    public String toString(){return "("+x+","+y+")";}

    public double distance(Vertex that){
        return(Math.sqrt((that.x - this.x * that.x - this.x)  + (that.y - this.y * that.y - this.y)));
    }
    public double lenght(){return Math.sqrt(x*x + y*y);}

    public Vertex skalarMult(double s){return new Vertex(x*s,y*s);}

    public void skalarMultMod(double s) {
        x = s * x;
        y = s * y;
    }

    public Vertex add(Vertex v2){return new Vertex(x+v2.x, y+v2.y);}
    public Vertex sub(Vertex v2){return new Vertex(this.x-v2.x, this.y-v2.y);}

    public void addMod(Vertex v2){this.x=x+v2.x;}

    public double getX(){return x;}
    public double getY(){return x;}

    public void setX(double x){this.x=x;}
    public void setY(double y){this.y=y;}

    public boolean equals(Object thatObject){
        if(thatObject instanceof Vertex){
            Vertex that = (Vertex)thatObject;
            return this.x==that.x && this.y==that.y;
        }
        return false;
    }

    public Vertex normalized(){
        double factor = this.lenght();

        return new Vertex(this.x=x/factor, this.y=y/factor);
    }
}