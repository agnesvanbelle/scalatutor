object FunctionWorksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  def square(x:Double) : Double = x * x           //> square: (x: Double)Double
  
  val a = 4                                       //> a  : Int = 4
  square(a)                                       //> res0: Double = 16.0
  
  // note; does not return 4!
  def greet(name:String):Unit = {
 		println(s"Hello, $name!")
 		4
 	}                                         //> greet: (name: String)Unit
 	val res = greet("Agnes")                  //> Hello, Agnes!
                                                  //| res  : Unit = ()
      
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
 	
 	factorial(5)                              //> res1: Int = 120
 	
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
 	estimatePi(1000)                          //> res2: Double = 3.124
 	
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
 	estimatePiTail(100000)                    //> res3: Double = 3.13428
 		
}