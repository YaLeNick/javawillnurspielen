import java.util.Objects;

public class GeometricObject {

    Vertex pos;
    double width;
    double height;

    public GeometricObject(Vertex pos, double width, double height){

        this.pos=pos;
        this.width=width;
        this.height=height;

        if(width<0){this.width=-width;}
        if(height<0){this.height=-height;}
        if(pos.x<0){this.pos.x=-pos.x;}
        if(pos.y<0){this.pos.y=-pos.y;}
    }

    public GeometricObject(double x, double y, double width, double height){this(new Vertex(x,y), width, height);}

    public GeometricObject(double width, double height){this(0,0, width, height);}

    public GeometricObject(double width){this(width, width);}

    public GeometricObject(){this(0, 0, 10, 10);}

    public String toString() {return "pos=" + pos + ", width=" + width + ", height=" + height + '}';}

    public double circumference(){return (width + height) * 2;}

    public double area(){return width * height;}

    public boolean contains(Vertex v1){return(v1.x >= this.pos.x && v1.x + width <= this.pos.x && v1.y >= this.pos.y && v1.y - height <= this.pos.y);}

    public boolean isLargerThan(GeometricObject g1) {return this.area() > g1.area();}

    public void moveTo(Vertex v1){this.pos = v1;}

    public void moveTo(double x, double y){moveTo(new Vertex(x, y));}

    public void move(Vertex v1){moveTo(this.pos.add(v1));}

    public Vertex getPos() {return pos;}

    public void setPos(Vertex pos) {this.pos = pos;}

    public double getWidth() {return width;}

    public void setWidth(double width) {this.width = width;}

    public double getHeight() {return height;}

    public void setHeight(double height) {this.height = height;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeometricObject that = (GeometricObject) o;
        return Double.compare(that.width, width) == 0 && Double.compare(that.height, height) == 0 && pos.equals(that.pos);
    }

    public boolean contains(GeometricObject that){
        Vertex newV = new Vertex(this.pos.x - that.width, this.pos.y - that.height);
        GeometricObject big = new GeometricObject(newV, this.width + that.width, this.height + that.height);
        return big.contains(that.pos);
    }
}
