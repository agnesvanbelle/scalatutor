object SetsMaps {

	import collection.mutable
	
	val mutList = mutable.MutableList(1,2,3)  //> mutList  : scala.collection.mutable.MutableList[Int] = MutableList(1, 2, 3)
	
	mutList :+ 3                              //> res0: scala.collection.mutable.MutableList[Int] = MutableList(1, 2, 3, 3)
	
	mutList                                   //> res1: scala.collection.mutable.MutableList[Int] = MutableList(1, 2, 3)
	
	mutList.+=:(3)                            //> res2: SetsMaps.mutList.type = MutableList(3, 1, 2, 3)

	mutList                                   //> res3: scala.collection.mutable.MutableList[Int] = MutableList(3, 1, 2, 3)
	
	mutList.+:(3)                             //> res4: scala.collection.mutable.MutableList[Int] = MutableList(3, 3, 1, 2, 3)
                                                  //| 
	mutList                                   //> res5: scala.collection.mutable.MutableList[Int] = MutableList(3, 1, 2, 3)
	
	mutList(0)=0
	mutList                                   //> res6: scala.collection.mutable.MutableList[Int] = MutableList(0, 1, 2, 3)
	
	val myList = List(3,1,2,3)                //> myList  : List[Int] = List(3, 1, 2, 3)
	// myList(0)=0 // not possible
	
	val myMap = Map("a"-> 3, "b"-> 2)         //> myMap  : scala.collection.immutable.Map[String,Int] = Map(a -> 3, b -> 2)
	
	myMap.get("a")                            //> res7: Option[Int] = Some(3)
	val mutMap = mutable.Map("a"->3,"b"->4)   //> mutMap  : scala.collection.mutable.Map[String,Int] = Map(b -> 4, a -> 3)
	mutMap.+=("d" -> 3)                       //> res8: SetsMaps.mutMap.type = Map(b -> 4, d -> 3, a -> 3)
	mutMap("d") = 5
	mutMap                                    //> res9: scala.collection.mutable.Map[String,Int] = Map(b -> 4, d -> 5, a -> 3)
                                                  //| 
  mutMap.+=("d" -> 7)                             //> res10: SetsMaps.mutMap.type = Map(b -> 4, d -> 7, a -> 3)
 
  mutMap                                          //> res11: scala.collection.mutable.Map[String,Int] = Map(b -> 4, d -> 7, a -> 3
                                                  //| )
  val mySet = Set(3,4,5,3)                        //> mySet  : scala.collection.immutable.Set[Int] = Set(3, 4, 5)
  mySet.intersect(Set(4,3,6))                     //> res12: scala.collection.immutable.Set[Int] = Set(3, 4)
  
  mySet + 7                                       //> res13: scala.collection.immutable.Set[Int] = Set(3, 4, 5, 7)
  mySet                                           //> res14: scala.collection.immutable.Set[Int] = Set(3, 4, 5)
  
  7 +: Array(1,2,3) :+ 8                          //> res15: Array[Int] = Array(7, 1, 2, 3, 8)
  
  1 -> 2 -> 3                                     //> res16: ((Int, Int), Int) = ((1,2),3)
 
  val mutSet =  Set.apply(("a", 7), "b", "c")     //> mutSet  : scala.collection.immutable.Set[java.io.Serializable] = Set((a,7), 
                                                  //| b, c)
  
	mutSet.+("6")                             //> res17: scala.collection.immutable.Set[java.io.Serializable] = Set((a,7), b, 
                                                  //| c, 6)
	mutSet                                    //> res18: scala.collection.immutable.Set[java.io.Serializable] = Set((a,7), b, 
                                                  //| c)
	
	mutSet + ("a" -> 9)                       //> res19: scala.collection.immutable.Set[java.io.Serializable] = Set((a,7), b, 
                                                  //| c, (a,9))
	
}