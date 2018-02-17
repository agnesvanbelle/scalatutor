object FunctionWorksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  def square(x:Double) : Double = x * x           //> square: (x: Double)Double
  
  val a = 4                                       //> a  : Int = 4
  square(a)                                       //> res0: Double = 16.0
  
  def greet0(name:Double):Double = {
  	4.4
  }                                               //> greet0: (name: Double)Double
  // functions cannot be overloaded
  //def greet0(name:String):String = {
 // 	"x"
  //}
  
  // note; does not return 4!
  def greet(name:String = "Paultje"):Unit = {
 		println(s"Hello, $name!")
 		4
 	}                                         //> greet: (name: String)Unit
 	
 	// methods can be overloaded
 	class MyClass {
 		def apply() = {}
 		def greet(n:String) = {"hi"}
 		def greet(n:Double) = {707}
 	}
 	new MyClass().greet(5.5)                  //> res1: Int = 707
 	
 	Seq(1,2)                                  //> res2: Seq[Int] = List(1, 2)
 	val myArr = Seq(1,2)                      //> myArr  : Seq[Int] = List(1, 2)
 	val res = greet("Agnes")                  //> Hello, Agnes!
                                                  //| res  : Unit = ()
  greet()                                         //> Hello, Paultje!
      
  def greet2(name:String) = {
 		println(s"Hello, $name!")
 		4
 	}                                         //> greet2: (name: String)Int
  
       
  def greet3(name:String):Int = {
 		println(s"Hello, $name!")
 		4
 	}                                         //> greet3: (name: String)Int
 	
 	
 	def factorial(n:Int):Int = if ( n < 2) n else n * factorial (n - 1)
                                                  //> factorial: (n: Int)Int
 	
 	factorial(5)                              //> res3: Int = 120
 	
 	import scala.annotation._
 	def estimatePi(n:Int):Double = {
 	
 		def helper(n:Int):Int = {
 			if (n < 1) 0
 			else {
 				val x = math.random
 				val y = math.random
 				(if (x*x + y*y < 1) 1 else 0) + helper(n-1)
 		  }
 		}
 		helper(n)/n.toDouble * 4
 	}                                         //> estimatePi: (n: Int)Double
 	
 	// 10000 leads to stack overflow error
 	estimatePi(1000)                          //> res4: Double = 3.112
 	
 	def estimatePiTail(n:Int):Double = {
 		@tailrec
 		def helper(n:Int, sum:Int):Int = {
 			if (n<1) sum
 			else {
 				val x = math.random
 				val y = math.random
 				helper(n-1, sum + (if (x*x + y*y < 1) 1 else 0 ))
 			}
 		}
 		helper(n, 0)/n.toDouble * 4
 	}                                         //> estimatePiTail: (n: Int)Double
 	estimatePiTail(100000)                    //> res5: Double = 3.14244
 	
 		
}