object Collections {

	// compiles down to Java array
	val arr = Array(1,2,3)                    //> arr  : Array[Int] = Array(1, 2, 3)
	
	val lst = List(1, 3.4, "aap")             //> lst  : List[Any] = List(1, 3.4, aap)
	
	lst(2)                                    //> res0: Any = aap
	
	arr(0)=99
	
	arr                                       //> res1: Array[Int] = Array(99, 2, 3)
	
	// error
	//lst(0) = 4
	
	val arr2 = arr                            //> arr2  : Array[Int] = Array(99, 2, 3)
	
	arr2(0) = 101
	
	arr2                                      //> res2: Array[Int] = Array(101, 2, 3)
	arr                                       //> res3: Array[Int] = Array(101, 2, 3)
	
	var x = 5                                 //> x  : Int = 5
	var y = x                                 //> y  : Int = 5
	y = 6
	x    // 5!                                //> res4: Int = 5
	y                                         //> res5: Int = 6
	
	val lst2 = 3::lst                         //> lst2  : List[Any] = List(3, 1, 3.4, aap)
	
	lst.tail                                  //> res6: List[Any] = List(3.4, aap)
	
	val v  = Vector("a", "b", "c")            //> v  : scala.collection.immutable.Vector[String] = Vector(a, b, c)
	v.head                                    //> res7: String = a
	
	val arr3 = new Array[String](100)         //> arr3  : Array[String] = Array(null, null, null, null, null, null, null, null
                                                  //| , null, null, null, null, null, null, null, null, null, null, null, null, nu
                                                  //| ll, null, null, null, null, null, null, null, null, null, null, null, null, 
                                                  //| null, null, null, null, null, null, null, null, null, null, null, null, null
                                                  //| , null, null, null, null, null, null, null, null, null, null, null, null, nu
                                                  //| ll, null, null, null, null, null, null, null, null, null, null, null, null, 
                                                  //| null, null, null, null, null, null, null, null, null, null, null, null, null
                                                  //| , null, null, null, null, null, null, null, null, null, null, null, null, nu
                                                  //| ll, null, null, null)
	
	val arr3b = Array.fill(10)("")            //> arr3b  : Array[String] = Array("", "", "", "", "", "", "", "", "", "")
	
	List.fill(5)(math.random)                 //> res8: List[Double] = List(0.8972483670936383, 0.5348101112883581, 0.44206949
                                                  //| 178238786, 0.4974801848403898, 0.33618912946064916)
	
	def littleArray(i:Int):List[Int] = List(i,i,i)
                                                  //> littleArray: (i: Int)List[Int]
	
	littleArray(3)                            //> res9: List[Int] = List(3, 3, 3)
	littleArray(util.Random.nextInt)          //> res10: List[Int] = List(-599209028, -599209028, -599209028)
	
	def interestingArray(i: => Int):List[Int] = {
		List(i,i,i)
	}                                         //> interestingArray: (i: => Int)List[Int]
	
	interestingArray(3)                       //> res11: List[Int] = List(3, 3, 3)
	interestingArray(util.Random.nextInt)     //> res12: List[Int] = List(485527250, 1871570953, 1024635773)
	
	val r = List.range(0,10,2)                //> r  : List[Int] = List(0, 2, 4, 6, 8)
	r(1)                                      //> res13: Int = 2
	
	val a = Array.range(0,10,2)               //> a  : Array[Int] = Array(0, 2, 4, 6, 8)
	a(1)                                      //> res14: Int = 2
	
	List.tabulate(5)(i => if(i%2 ==0) i * 3 else 0)
                                                  //> res15: List[Int] = List(0, 0, 6, 0, 12)
	
	import collection.mutable
	mutable.Buffer(1,2,3)                     //> res16: scala.collection.mutable.Buffer[Int] = ArrayBuffer(1, 2, 3)
	
	
	val myRange = 1 to 10 by 2                //> myRange  : scala.collection.immutable.Range = inexact Range 1 to 10 by 2
	1.to(10).by(2)                            //> res17: scala.collection.immutable.Range = inexact Range 1 to 10 by 2
	println(myRange)                          //> inexact Range 1 to 10 by 2
	myRange(1)                                //> res18: Int = 3
	myRange.size                              //> res19: Int = 5
	
	for (i <- 1 to myRange.size-1) {
		println(myRange(i))               //> 3
                                                  //| 5
                                                  //| 7
                                                  //| 9
	}
}