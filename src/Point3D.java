public class Point3D extends Point2D{
    float z;
    Point3D(){
        z=1.0f;
    }
    Point3D(float x,float y, float z){
        super(x,y);
        this.z=z;
    }
    public void setZ(float z){
        this.z = z;
    }
    public float getZ(){
        return z;
    }
    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z=z;
    }
    public float[] getXYZ(){
        float[] result={super.getXY()[0],super.getXY()[1],z};
        return result;
    }
    @Override
    public String toString(){
        return super.toString()+" z = "+z;
    }
}
