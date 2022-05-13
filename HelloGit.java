public class HelloGit {
    public static void main(String[] args) {
<<<<<<< HEAD
        System.out.println("Printing some numbers");
        for(int i=0; i<4; i++){
            System.out.println("Serial numbers : "+i);			
        }
	   System.out.println("The numbers are from 0 to 3");
	   
	   for(int j=0; j<7; j=j+1){
            System.out.println("Even numbers : "+j);			
        }
	   System.out.println("Even numbers are from 0 to 6");
    }
=======
	interface Shape{
		void draw();
	}
	class Circle implements Shape{
	       @Override
	       public void draw(){
		System.out.println("a circle drawn");
	       }
	}
	class Square implements Shape{
	      @Override
	       public void draw(){
		System.out.println("a square drawn");
	       }
	}
	class Rectangle implements Shape{
	@Override
	       public void draw(){
		System.out.println("a rectangle drawn");
	       }
	}
	class ShapeFactory{
	       public Shape getShape(String type) throws Exception{
		switch (type){
			case "Circle":
				return new Circle();
			case "Square":
				return new Square();
			case "Rectangle":
				return new Rectangle();
			default:
				throw new Exception( "Shape type : "+type+" cannot be instantiated");
			}
		}
	}

	class Painter{
		public static void main(String[] args) throws Exception{

			ShapeFactory shapeFactory = new ShapeFactory();
			Shape circle=shapeFactory.getShape("Circle");
			circle.draw();
			Shape square = shapeFactory.getShape("Square");
			square.draw();

			Shape rombus = shapeFactory.getShape("Rombus");
			rombus.draw();
		}
	}
        }
>>>>>>> branchY
}

