package specmethods

case class Vect3D(x: Double, y: Double, z: Double) {
  
  def apply(i: Int): Double = i match {
    case 0 => x
    case 1 => y
    case 2 => z
  }
  
  def this(b:String) = this(b.toDouble, b.toDouble, b.toDouble)
  
  // special method
  def update(i:Int, d:Double):Vect3D = i match {
    case 0 => this.copy(x = d)
    case 1 => this.copy(y = d)
    case 2 => this.copy(z = d)
  }
  
  def ++() = Vect3D(x+1, y+1, z+1)
  def +(v: Vect3D) = Vect3D(x + v.x, y + v.y, z + v.z)
  def -(v: Vect3D) = Vect3D(x - v.x, y - v.y, z - v.z)
  def *(c: Double) = Vect3D(c * x, c * y, c * z)
  def /(c: Double) = Vect3D(x / c, y / c, z / c)
  def dot(v: Vect3D) = x * v.x + y * v.y + z * v.z
  def cross(v: Vect3D) = Vect3D(
    y * v.z - z * v.y,
    z * v.x - x * v.z,
    x * v.y - y * v.x)
  def magnitude() = math.sqrt(x * x + y * y + z * z)
}

object Vect3D extends App {
  val v1 = Vect3D(1, 2, 3)
  val v2 = Vect3D(4, 5, 6)
  v1(0)
  v2(0) = 99
  v1 + v2
  v1 - v2
  v1 * 6
  v1 / 6
  v1 dot v2
  v1 cross v2

  import VectScalar._
  println(v1)
  println(6 * v1)
  println("This is a test".filter(_ != ' '))
  println("This is a test".filter( x => x.isUpper || x == ' ').size)
  
  def apply(i: Double): Vect3D = {
    new Vect3D(i,i,i)
  }
  
  println(v2)
  println(v2(0))
  println(Vect3D(0))
  println(Vect3D(0) ++)
  println(new Vect3D("3") ++)
  println(v2(0) = 5)
}