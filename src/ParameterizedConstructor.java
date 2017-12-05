
class Rectangle
{  
      int length;
      int breadth;
      int height;
      //constructor to initialize length and breadth of rectangle
      Rectangle(int l,int b)
      { 
        length = l;
        breadth= b;
      }
      Rectangle(int l,int b,int h)
      { 
        length = l;
        breadth= b;
        height=h;
      }
      //method to calculate area of rectangle
      int area()
      {
         return (length * breadth * height);
      }
}
    //class to create rectangle objects and calculate area
    class ParameterizedConstructor 
{
      public static void main(String[] args)
      {
        Rectangle firstRect = new Rectangle(5,6);
        Rectangle secondRect = new Rectangle(7,8,9);
        System.out.println("Area of First Rectangle  : " +firstRect.area());
        System.out.println("Area of Second Rectangle  : "+secondRect.area());
      }
}
