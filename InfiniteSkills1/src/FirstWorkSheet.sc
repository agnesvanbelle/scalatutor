object FirstWorkSheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  4                                               //> res0: Int(4) = 4
  
  println("Hi")                                   //> Hi
  
  4.5                                             //> res1: Double(4.5) = 4.5
  
  (4.5).toString                                  //> res2: String = 4.5
  (4.5).toInt                                     //> res3: Int = 4
  "4.5".toDouble                                  //> res4: Double = 4.5
  
  null                                            //> res5: Null(null) = null
  
  true                                            //> res6: Boolean(true) = true
  
  false                                           //> res7: Boolean(false) = false
  
  ()
  
  var a = 5                                       //> a  : Int = 5
  
  5                                               //> res8: Int(5) = 5
  
  val c:Int = 2                                   //> c  : Int = 2
  var d:Int = 4                                   //> d  : Int = 4
  
  val x,y,z = 5                                   //> x  : Int = 5
                                                  //| y  : Int = 5
                                                  //| z  : Int = 5
     
  val (o,b) = (4,5)                               //> o  : Int = 4
                                                  //| b  : Int = 5
  
  (2.5, 'a')                                      //> res9: (Double, Char) = (2.5,a)
  
  val myVal = if ( o >= 4 ) 10                    //> myVal  : AnyVal = 10
  val myVal2 = if ( o >= 4 ) println("hi")        //> hi
                                                  //| myVal2  : Unit = ()
  val myVal3 = if ( o > 4 ) 10                    //> myVal3  : AnyVal = ()
  val myVal4 = if ( o > 4) "hi" else ()           //> myVal4  : Any = ()

  val test = if (o == 5) {
    "hi"
  } else if (o == 6) {
    "HELLO"
  } else println("aap")                           //> aap
                                                  //| test  : Any = ()

  val testVal = 16                                //> testVal  : Int = 16
  val result = (a*3, c) match {
    case (0, _) => "0"
    case (1, _) => "1"
    case (_ ,2) => "c is 2"
    case (`testVal`, _) => a + "*3 is equal to " + testVal
    case r => "Other value: " + r._1 + " and " + r._2
  }                                               //> result  : String = c is 2
  
  //c = 4
  a = 4
  
  println("hi")                                   //> hi
  
  
  
}