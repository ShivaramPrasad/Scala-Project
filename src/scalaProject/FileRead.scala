package scalaProject

import scala.io.StdIn._
import scala.io.Source
import java.io.PrintWriter

object FileRead
{
 def main(args: Array[String]):Unit = {

    //getting txt file using source   
    val source = Source.fromFile("NASA_WebServer_logs.txt")
    
    //creating a class Order
    case class Order(){
    val lines = source.getLines
    }
    
    //creating object
    val O = Order()
    //Number of times the GET REQUEST takes place
 
    //writing all the log's to a text file
    val pw = new PrintWriter("Filtered_logs.txt")
    
    var count = 0
    for(line <- O.lines)
    {
      val list = List(line)
      count = count + 1
      //it will filter the GET Request
      val typ = list.filter(x => x.trim.matches(".*GET.*"))
      
      val typ1 = list.map(f => f.replaceAll("[-,\"]", ""))
 
      pw.println(typ1.mkString(" "))
      
    } 
    println("count",count)
    pw.close()
     
    
    val source1 = Source.fromFile("Filtered_logs.txt")
    val line1 = source1.getLines
    val found = line1.map(line => line.replace(" ", " ")).toList
    
    
    //closing the file 
    source1.close()
    
    
//    val args = """([0-9].[0.9].[0-9].[0-9]+)   ([0-9]+/[A-Z][a-z]+/[0-9]+:[0-9]+:[0-9]+:[0-9] [0-9]+) ([A-Z]+) (/[a-z]+/[a-z]+) ([A-Z]+/[0-9].[0-9]+) ([0-9]+) ([0-9]+)""".r
       
    for(f <- found){
         println(f)

         
//      val args(ip, date, req, name, http, status, num) = f       
//       println("Args",args)
    
    }
    
    //closing the first text file
    source.close()
   
  }
  
    
}