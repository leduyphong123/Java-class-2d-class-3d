public class Point2D {
    float x,y;
    Point2D(){
        x=1.0f;
        y=1.0f;
    }
    Point2D(float x,float y){
        this.x=x;
        this.y=y;
    }
    public void setX(float x){
        this.x=x;
    }
    public float getX(){
        return x;
    }
    public void setY(float y){
        this.y=y;
    }
    public float getY(){
        return y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float[] result={x,y};
        return result;
    }
    public String toString(){
        return "Piont yes x =" +x + " y= " +y;
    }
}
