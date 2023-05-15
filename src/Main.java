public class Main{
    public static void main(String[] args){
        Point3D point3D=new Point3D(3.0f,4.0f,5.2f);
        System.out.println(point3D.toString());
        Point2D point2D = new Point2D(2.0f,5.0f);
        System.out.println(point2D.toString());
        Point2D point2D1=new Point3D(3.0f,4.0f,5.2f);
        System.out.println(point2D1.toString());
    }
}