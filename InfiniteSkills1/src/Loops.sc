import scala.util.Random
object Loops {
  
  
  for (i <- 0 until 5) println(i)                 //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
  for (i <- 0 to 5) println(i)                    //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
  
  for ( i <- Array.fill(6)(Random.nextInt())) println(i)
                                                  //> -1486083056
                                                  //| 1449632472
                                                  //| -591938324
                                                  //| -1198104205
                                                  //| -456879168
                                                  //| 97402588
  
  (for ( i <- 0 until 5 ) yield i*i).toArray      //> res0: Array[Int] = Array(0, 1, 4, 9, 16)
	
	var i = 0                                 //> i  : Int = 0
	while (i < 5) {
		i += 1
		println(i)
	}                                         //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
  Array.range(1, 4) map( i => i*i)                //> res1: Array[Int] = Array(1, 4, 9)
  val arr = Array.range(1,4)                      //> arr  : Array[Int] = Array(1, 2, 3)
	import collection.mutable
  val list = mutable.MutableList[Int]()           //> list  : scala.collection.mutable.MutableList[Int] = MutableList()
  arr.foreach( list += _)
  list                                            //> res2: scala.collection.mutable.MutableList[Int] = MutableList(1, 2, 3)
  
  1 :: 2 :: Nil                                   //> res3: List[Int] = List(1, 2)
  
  var arr2 = Array.fill(5)(util.Random.nextInt(6))//> arr2  : Array[Int] = Array(0, 3, 5, 1, 0)
  
  (0 until 5).toArray.toVector                    //> res4: Vector[Int] = Vector(0, 1, 2, 3, 4)
  Vector.range(0, 5)                              //> res5: scala.collection.immutable.Vector[Int] = Vector(0, 1, 2, 3, 4)
  
  for {  i <- Vector.range(0, 5); j <- i until 5}
  		yield (i,j)                       //> res6: scala.collection.immutable.Vector[(Int, Int)] = Vector((0,0), (0,1), (
                                                  //| 0,2), (0,3), (0,4), (1,1), (1,2), (1,3), (1,4), (2,2), (2,3), (2,4), (3,3), 
                                                  //| (3,4), (4,4))

		
	
}