object HigherOrderFunctions {
  
  val myArr = Array(1,2,3)                        //> myArr  : Array[Int] = Array(1, 2, 3)
  val myLongArray = Array.range(0, 10, 2)         //> myLongArray  : Array[Int] = Array(0, 2, 4, 6, 8)
  
  myArr.map( i => i * 2)                          //> res0: Array[Int] = Array(2, 4, 6)
	myArr.map( _ * 2)                         //> res1: Array[Int] = Array(2, 4, 6)
	myArr.map(println)                        //> 1
                                                  //| 2
                                                  //| 3
                                                  //| res2: Array[Unit] = Array((), (), ())
	myLongArray.filter( i => i % 2 == 0)      //> res3: Array[Int] = Array(0, 2, 4, 6, 8)
	Some(7)                                   //> res4: Some[Int] = Some(7)
	myArr.flatMap( v => Array(v-1, v, v+1))   //> res5: Array[Int] = Array(0, 1, 2, 1, 2, 3, 2, 3, 4)
	
	def g(v:Int) = Vector(v-1, v, v+1)        //> g: (v: Int)scala.collection.immutable.Vector[Int]
	myArr.map(g)                              //> res6: Array[scala.collection.immutable.Vector[Int]] = Array(Vector(0, 1, 2),
                                                  //|  Vector(1, 2, 3), Vector(2, 3, 4))
  myArr.reduceLeft((i, j) => i + j)               //> res7: Int = 6
  myArr.reduceLeft(_ + _)                         //> res8: Int = 6
  
  myArr.foldLeft(1)((i, j) => i + j)              //> res9: Int = 7
  
  myArr.find(_ == 3).get / 2.0                    //> res10: Double = 1.5
  myArr.find(_ == 4).map(_ / 2.0).getOrElse(-1)   //> res11: AnyVal = -1
  
  
  
}