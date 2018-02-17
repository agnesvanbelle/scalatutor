object SyntacticSugar {

	def foo(i:Int):Int = 8+i                  //> foo: (i: Int)Int
	
	foo(9)                                    //> res0: Int = 17
	foo{9}                                    //> res1: Int = 17
	
	foo {
		println("hi!")
		9
	}                                         //> hi!
                                                  //| res2: Int = 17
	var i = 0                                 //> i  : Int = 0
	Array.fill(5){
		(System.currentTimeMillis() / 345376764.0).toInt
	}.map((j:Int) => {i+=1; j+i})             //> res3: Array[Int] = Array(4377, 4378, 4379, 4380, 4381)
	
	def myWhile(cond: => Boolean)(body: => Unit):Unit = {
		if (cond) {body; myWhile(cond)(body)}
	}                                         //> myWhile: (cond: => Boolean)(body: => Unit)Unit
	
	i = 0
	myWhile(i < 5) {
		i +=1
		println(i)
	}                                         //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
 
}