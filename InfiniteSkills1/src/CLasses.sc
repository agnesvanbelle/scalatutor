package specmethods

object CLasses {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  case class MyCaseClass(a:String, b:Int) {
  	def apply(l:List[Double]):Double = l.sum * b
  }
  
  class MyClass(a:String, private var b:Int) {
  	
  	def apply(l:List[Double]):Double = l.sum * b
  	
  	def myb = b
  	
  	def myb_=(amount:Int):Unit = {
  	  b = amount
  	}
  }
  
  val mcc = MyCaseClass("abc", 5)                 //> mcc  : specmethods.CLasses.MyCaseClass = MyCaseClass(abc,5)
  mcc(List(1,2,3))                                //> res0: Double = 30.0
  
  //val mcc2 = MyCaseClass(List(3,4)) // calls implicit apply
  val mcc3 = MyCaseClass("def", 7)                //> mcc3  : specmethods.CLasses.MyCaseClass = MyCaseClass(def,7)
  
  val mc = new MyClass("a", 5)                    //> mc  : specmethods.CLasses.MyClass = specmethods.CLasses$MyClass$1@6aaa5eb0
  mc(List(1,2,3))                                 //> res1: Double = 30.0
  mc.myb = 4
  mc(List(1,2,3))                                 //> res2: Double = 24.0
}