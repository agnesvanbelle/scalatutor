object Collections2 {

	val myArr = Array.fill(5)(math.random)    //> myArr  : Array[Double] = Array(0.15457084279212385, 0.9567266563442012, 0.650
                                                  //| 1434428276379, 0.2614058620501095, 0.34188117943348717)
	
	val myList = List.tabulate(5)(i => i*2)   //> myList  : List[Int] = List(0, 2, 4, 6, 8)
	
	// equivalent, also for List
	myArr.length                              //> res0: Int = 5
	myArr.size                                //> res1: Int = 5
	
	3 +: myArr                                //> res2: Array[AnyVal] = Array(3, 0.15457084279212385, 0.9567266563442012, 0.65
                                                  //| 01434428276379, 0.2614058620501095, 0.34188117943348717)
	
	var a = Array(1,3,4) ++ myArr             //> a  : scala.collection.mutable.ArraySeq[AnyVal{def getClass(): Class[_ >: Int
                                                  //|  with Double <: AnyVal]}] = Array(1, 3, 4, 0.15457084279212385, 0.9567266563
                                                  //| 442012, 0.6501434428276379, 0.2614058620501095, 0.34188117943348717)
	val b = Array(1,3,4) ++: myArr            //> b  : scala.collection.mutable.ArraySeq[AnyVal{def getClass(): Class[_ >: Dou
                                                  //| ble with Int <: AnyVal]}] = Array(1, 3, 4, 0.15457084279212385, 0.9567266563
                                                  //| 442012, 0.6501434428276379, 0.2614058620501095, 0.34188117943348717)
  val c= List(3,4).toArray                        //> c  : Array[Int] = Array(3, 4)
	a == b                                    //> res3: Boolean = false
	a.equals(b)                               //> res4: Boolean = false
	// creates new array on both sides
	a.deep == b.deep                          //> res5: <error> = true
	a.sameElements(b)                         //> res6: Boolean = true
	a.deep == c.deep                          //> res7: <error> = false
	a.sameElements(c)                         //> res8: Boolean = false
	a = b
	b == a                                    //> res9: Boolean = true
	
	// result is List
	myArr ++: List(1,2,3)                     //> res10: List[AnyVal{def getClass(): Class[_ >: Int with Double <: AnyVal]}] =
                                                  //|  List(0.15457084279212385, 0.9567266563442012, 0.6501434428276379, 0.2614058
                                                  //| 620501095, 0.34188117943348717, 1, 2, 3)
	// result is Array
	myArr ++ List(1,2,3)                      //> res11: scala.collection.mutable.ArraySeq[AnyVal{def getClass(): Class[_ >: D
                                                  //| ouble with Int <: AnyVal]}] = Array(0.15457084279212385, 0.9567266563442012,
                                                  //|  0.6501434428276379, 0.2614058620501095, 0.34188117943348717, 1, 2, 3)
	
	3 +: myArr                                //> res12: Array[AnyVal] = Array(3, 0.15457084279212385, 0.9567266563442012, 0.6
                                                  //| 501434428276379, 0.2614058620501095, 0.34188117943348717)
	myArr :+ 3                                //> res13: Array[AnyVal] = Array(0.15457084279212385, 0.9567266563442012, 0.6501
                                                  //| 434428276379, 0.2614058620501095, 0.34188117943348717, 3)
	
	3 +: myArr                                //> res14: Array[AnyVal] = Array(3, 0.15457084279212385, 0.9567266563442012, 0.6
                                                  //| 501434428276379, 0.2614058620501095, 0.34188117943348717)
	//3::myArr
	3 :: myList                               //> res15: List[Int] = List(3, 0, 2, 4, 6, 8)
	myList                                    //> res16: List[Int] = List(0, 2, 4, 6, 8)
	3 +: myList                               //> res17: List[Int] = List(3, 0, 2, 4, 6, 8)
	myList                                    //> res18: List[Int] = List(0, 2, 4, 6, 8)
	myList :+ 3                               //> res19: List[Int] = List(0, 2, 4, 6, 8, 3)
	myList                                    //> res20: List[Int] = List(0, 2, 4, 6, 8)
	
	myList.::(3)                              //> res21: List[Int] = List(3, 0, 2, 4, 6, 8)
	myList                                    //> res22: List[Int] = List(0, 2, 4, 6, 8)
	
	myList.head                               //> res23: Int = 0
	myList.last                               //> res24: Int = 8
	myList.tail                               //> res25: List[Int] = List(2, 4, 6, 8)
	
	myArr.head                                //> res26: Double = 0.15457084279212385
	myArr.drop(3)                             //> res27: Array[Double] = Array(0.2614058620501095, 0.34188117943348717)
	myArr.dropRight(3)                        //> res28: Array[Double] = Array(0.15457084279212385, 0.9567266563442012)
	myArr.take(3)                             //> res29: Array[Double] = Array(0.15457084279212385, 0.9567266563442012, 0.6501
                                                  //| 434428276379)
	
	4 +: myArr                                //> res30: Array[AnyVal] = Array(4, 0.15457084279212385, 0.9567266563442012, 0.6
                                                  //| 501434428276379, 0.2614058620501095, 0.34188117943348717)
	
	var (x,y) = myArr.splitAt(3)              //> x  : Array[Double] = Array(0.15457084279212385, 0.9567266563442012, 0.650143
                                                  //| 4428276379)
                                                  //| y  : Array[Double] = Array(0.2614058620501095, 0.34188117943348717)
  x                                               //> res31: Array[Double] = Array(0.15457084279212385, 0.9567266563442012, 0.6501
                                                  //| 434428276379)
  x = Array(5)
  x                                               //> res32: Array[Double] = Array(5.0)
  myArr                                           //> res33: Array[Double] = Array(0.15457084279212385, 0.9567266563442012, 0.6501
                                                  //| 434428276379, 0.2614058620501095, 0.34188117943348717)
	myList.splitAt(3)                         //> res34: (List[Int], List[Int]) = (List(0, 2, 4),List(6, 8))
	myList.slice(1, 4)                        //> res35: List[Int] = List(2, 4, 6)
	
	myList(0)                                 //> res36: Int = 0
	
}