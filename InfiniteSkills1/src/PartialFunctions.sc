object PartialFunctions {
		  		
  def fun(j: => Any): String = {
   j match{
  	case j:Int => j + " is Integer"
  	case j:String =>  j + " is String"
  }}                                              //> fun: (j: => Any)String
  
  fun("hi")                                       //> res0: String = hi is String
  fun(6)                                          //> res1: String = 6 is Integer
  //fun(()) // error
  
  val fPart : PartialFunction[Any, String] ={
  		case i:Int => i + " is Integer"
  		case i:String => i + " is String"
  }                                               //> fPart  : PartialFunction[Any,String] = <function1>
  
  fPart("hi")                                     //> res2: String = hi is String
  fPart(6)                                        //> res3: String = 6 is Integer
  //fPart(())       // error
  
  val fPart2 = new PartialFunction[Any, String] {
    def apply(x: Any) = { x match {
    	case x:Int => x + " is Int"
    	case x:String => x + " is String"
    }}
    def isDefinedAt(x: Any) = x.isInstanceOf[String] || x.isInstanceOf[Int]
	}                                         //> fPart2  : PartialFunction[Any,String] = <function1>
	
	fPart2("hi")                              //> res4: String = hi is String
  fPart2(6)                                       //> res5: String = 6 is Int
  //fPart2(())    // error
  
  fPart.isDefinedAt(())                           //> res6: Boolean = false
  fPart2.isDefinedAt(())                          //> res7: Boolean = false
  
  val arr = Array(1,2,3)                          //> arr  : Array[Int] = Array(1, 2, 3)
  
  arr.isInstanceOf[Int] || arr.isInstanceOf[String]
                                                  //> res8: Boolean = false
  fPart2.isDefinedAt(arr)                         //> res9: Boolean = false
  //fPart2(arr).orElse(arr)
  
}