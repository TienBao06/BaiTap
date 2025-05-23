public class lap1_3 {
    private float width = 1.0f;
    private float height = 1.0f;

    public lap1_3() {
    }

    public lap1_3(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
     public double getArea(){
        return this.width*this.height;
     }
     public double getPerimeter(){
        return 2*(this.width+this.height);
     }

    @Override
    public String toString() {
        return "Rectangle[" +
                "width=" + width +
                ", height=" + height +
                ']';
    }
}