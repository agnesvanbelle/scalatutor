object Collections3 {
	
	val myArr = Array(1,2,3)                  //> myArr  : Array[Int] = Array(1, 2, 3)
	myArr.endsWith(Array(2,3))                //> res0: Boolean = true
	
	val myLongArray = Array.range(0,10,1).reverse
                                                  //> myLongArray  : Array[Int] = Array(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
  myLongArray.slice(3,myLongArray.length)         //> res1: Array[Int] = Array(6, 5, 4, 3, 2, 1, 0)
  myLongArray.takeRight(myLongArray.length-3)     //> res2: Array[Int] = Array(6, 5, 4, 3, 2, 1, 0)
	myLongArray.drop(3)                       //> res3: Array[Int] = Array(6, 5, 4, 3, 2, 1, 0)
	
	myLongArray.indices                       //> res4: scala.collection.immutable.Range = Range 0 until 10
	myLongArray.max                           //> res5: Int = 9
	myLongArray.min                           //> res6: Int = 0
	myLongArray.sum                           //> res7: Int = 45
	myLongArray.indexOf(5)                    //> res8: Int = 4
	myLongArray                               //> res9: Array[Int] = Array(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
	myLongArray.indexOf(5,3)                  //> res10: Int = 4
	myLongArray.indexOfSlice(Array(6,5))      //> res11: Int = 3
	
	val myList = myArr.toList                 //> myList  : List[Int] = List(1, 2, 3)
	myList.updated(2, 4)                      //> res12: List[Int] = List(1, 2, 4)
	
	myArr.patch(0, Array(3,4,5), 0)           //> res13: Array[Int] = Array(3, 4, 5, 1, 2, 3)
	myArr.patch(0, Array(3,4,5), 2)           //> res14: Array[Int] = Array(3, 4, 5, 3)
	myArr.patch(-1, Array(3,4,5), 2)          //> res15: Array[Int] = Array(3, 4, 5, 3)
	
	myArr.mkString("[", ";", "]")             //> res16: String = [1;2;3]
	myArr.intersect(myLongArray)              //> res17: Array[Int] = Array(1, 2, 3)
	myArr.union(myLongArray)                  //> res18: Array[Int] = Array(1, 2, 3, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
	myArr.union(myLongArray).distinct         //> res19: Array[Int] = Array(1, 2, 3, 9, 8, 7, 6, 5, 4, 0)
	myArr.map(_ + 1)                          //> res20: Array[Int] = Array(2, 3, 4)
	myArr.zipAll(myLongArray, myArr, -1)      //> res21: Array[(Any, Int)] = Array((1,9), (2,8), (3,7), (Array(1, 2, 3),6), (A
                                                  //| rray(1, 2, 3),5), (Array(1, 2, 3),4), (Array(1, 2, 3),3), (Array(1, 2, 3),2)
                                                  //| , (Array(1, 2, 3),1), (Array(1, 2, 3),0))
  myLongArray.zipAll(myArr, 0, -1)                //> res22: Array[(Int, Int)] = Array((9,1), (8,2), (7,3), (6,-1), (5,-1), (4,-1)
                                                  //| , (3,-1), (2,-1), (1,-1), (0,-1))
  myArr.zipWithIndex                              //> res23: Array[(Int, Int)] = Array((1,0), (2,1), (3,2))
  myArr.zip(myArr.indices)                        //> res24: Array[(Int, Int)] = Array((1,0), (2,1), (3,2))
  myArr.indices.toArray.zip(myArr)                //> res25: Array[(Int, Int)] = Array((0,1), (1,2), (2,3))
  
  
	myArr.exists( _ == 6)                     //> res26: Boolean = false
	myLongArray.exists(_ == 6)                //> res27: Boolean = true
	myLongArray.forall(_ != None)             //> res28: Boolean = true
	val myLongArray2 = myLongArray :+ None    //> myLongArray2  : Array[Any] = Array(9, 8, 7, 6, 5, 4, 3, 2, 1, 0, None)
	myLongArray2.forall(_ != None)            //> res29: Boolean = false
	
	
	5 +: myLongArray                          //> res30: Array[Int] = Array(5, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
	myLongArray :+ 5                          //> res31: Array[Int] = Array(9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 5)
}