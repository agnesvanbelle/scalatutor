import scala.collection.AbstractSeq

object Patterns {
  val Array(hour, minute, second) = "5.36.24".split("\\.")
                                                  //> hour  : String = 5
                                                  //| minute  : String = 36
                                                  //| second  : String = 24
  hour                                            //> res0: String = 5
	
	1::2::3::Nil                              //> res1: List[Int] = List(1, 2, 3)
	Nil                                       //> res2: scala.collection.immutable.Nil.type = List()
	
  def listLength[A](l:Seq[A]):Int = {
   l match {
  	case Nil => 0
  	case i +: j => 1 + listLength(j)
  	}
  }                                               //> listLength: [A](l: Seq[A])Int
	listLength(List(3,4,5,6))                 //> res3: Int = 4
	listLength(Vector(1,2,3,4))               //> res4: Int = 4
	listLength(Array("a", "b", "c"))          //> res5: Int = 3
	
	Array(1,2,3,4,5).find(_ >= 3) match {
		case None => "Not found"
		case Some(i) => "Found " + i
	}                                         //> res6: String = Found 3
	case class Person(name:String, age:Int)
	
	val Anne = Person("Anne", 20)             //> Anne  : Patterns.Person = Person(Anne,20)
	val Jan = Person("Jan", 38)               //> Jan  : Patterns.Person = Person(Jan,38)
	
	val myPeople = Array(Anne, Jan)           //> myPeople  : Array[Patterns.Person] = Array(Person(Anne,20), Person(Jan,38))
	val Person(n,a) = myPeople.last           //> n  : String = Jan
                                                  //| a  : Int = 38
	
	val bla = myPeople.head match {
		case Person("Anne", 20) => "Hi"
		case _ => "Not Anne"
	}                                         //> bla  : String = Hi
	bla                                       //> res7: String = Hi
	
}