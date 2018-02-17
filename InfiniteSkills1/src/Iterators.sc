object Iterators {
  new java.io.File(".").getAbsolutePath()         //> res0: String = /root/.
  val dataDir = "/run/media/root/ss-ntfs/3.Documents/code/scala/InfititeSkills/data/Chapter 2/"
                                                  //> dataDir  : String = /run/media/root/ss-ntfs/3.Documents/code/scala/InfititeS
                                                  //| kills/data/Chapter 2/
  case class TempInfo(
  	day:Int, year:Int, precip:Double, aveTemp:Int, maxTemp:Int, minTep:Int
  )
  def readLine (line:String):TempInfo = {
  	val s = line.split(",").map(_.trim)
  	TempInfo(s(0).toInt, s(4).toInt, s(5).toDouble, s(6).toInt, s(7).toInt, s(8).toInt)
  }                                               //> readLine: (line: String)Iterators.TempInfo
  val source = io.Source.fromFile(dataDir + "TX417945_1263.csv")
                                                  //> source  : scala.io.BufferedSource = non-empty iterator
  val lines = source.getLines()                   //> lines  : Iterator[String] = non-empty iterator
  lines.next                                      //> res1: String = Source: MJ Menne CN Williams Jr. RS Vose NOAA National Climat
                                                  //| ic Data Center Asheville NC
  lines.next                                      //> res2: String = "Day  ,JD  ,Month  ,State_id  ,Year  ,PRCP (in),TAVE (F),TMAX
                                                  //|  (F),TMIN (F) "
  val data = lines.map(readLine).toArray          //> data  : Array[Iterators.TempInfo] = Array(TempInfo(1,1946,0.02,81,92,70), Te
                                                  //| mpInfo(2,1946,0.01,82,90,74), TempInfo(3,1946,0.0,83,91,74), TempInfo(4,1946
                                                  //| ,0.0,80,90,69), TempInfo(5,1946,0.0,80,90,70), TempInfo(6,1946,0.0,81,91,70)
                                                  //| , TempInfo(7,1946,0.03,81,90,71), TempInfo(8,1946,0.23,79,86,72), TempInfo(9
                                                  //| ,1946,0.0,83,92,74), TempInfo(10,1946,0.0,83,92,74), TempInfo(11,1946,0.0,81
                                                  //| ,93,69), TempInfo(12,1946,0.0,83,94,71), TempInfo(13,1946,0.0,82,91,72), Tem
                                                  //| pInfo(14,1946,0.37,74,80,67), TempInfo(15,1946,4.71,69,73,64), TempInfo(16,1
                                                  //| 946,0.0,77,84,69), TempInfo(17,1946,0.15,77,81,72), TempInfo(18,1946,0.0,77,
                                                  //| 82,71), TempInfo(19,1946,0.0,77,83,70), TempInfo(20,1946,0.0,75,83,67), Temp
                                                  //| Info(21,1946,0.0,79,89,69), TempInfo(22,1946,0.0,84,94,74), TempInfo(23,1946
                                                  //| ,0.0,72,77,66), TempInfo(24,1946,0.0,75,80,69), TempInfo(25,1946,3.27,77,85,
                                                  //| 69), TempInfo(26,1946,3.8,77,85,69), TempInfo(27,1946,3.13,78,86,70), TempIn
                                                  //| fo(28,1946,0.0,79,86,72)
                                                  //| Output exceeds cutoff limit.
  source.close
  
  
  data.map(_.maxTemp).max                         //> res3: Int = 111
  List(2,3,4)(2)                                  //> res4: Int = 4
  Array(2,3,4)(2)                                 //> res5: Int = 4
}