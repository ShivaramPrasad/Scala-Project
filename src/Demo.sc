object Demo {
                                                
   var i =10                                      //> i  : Int = 10
   
   var o = 10                                     //> o  : Int = 10
   
   var result = i + o                             //> result  : Int = 20
   
   //here '+' is a method we need create an obj to make use of this method
   var add = 7 .+ (8)                             //> add  : Int = 15
   
   
   //creating class
   case class Student(){
   
   def hello() = println("hello from the function hello")
   
   }
   
   //creating objects
   var S = Student();                             //> S  : Demo.Student = Student()
   S.hello();                                     //> hello from the function hello
   
   //creating loop
   var list = List(0,1,2,3,4);                    //> list  : List[Int] = List(0, 1, 2, 3, 4)
   //for loop
   for(i <- list) println(i)                      //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
   //lambda expr for loop
   list.foreach{i:Int => println(i)}              //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
   
   //list drop ->remove, reverse
   list.reverse                                   //> res0: List[Int] = List(4, 3, 2, 1, 0)
   //it will drop the first 2 elements
   list.drop(2)                                   //> res1: List[Int] = List(2, 3, 4)
   //it will drop 2 as well print the next 2
   list drop 2 take 2                             //> res2: List[Int] = List(2, 3)
   
 
	 //list can contain any data type
 	 var lists = List(2,4,true,"Shiva")       //> lists  : List[Any] = List(2, 4, true, Shiva)
   var ls = List(2,3,true)                        //> ls  : List[AnyVal] = List(2, 3, true)
   
   //create a class
   case class Stud(rollno : Int, name : String, marks : Int)
   
   val s = List(Stud(1,"Shiva",50), Stud(2,"ram",90), Stud(3,"prasad",60))
                                                  //> s  : List[Demo.Stud] = List(Stud(1,Shiva,50), Stud(2,ram,90), Stud(3,prasad
                                                  //| ,60))
    //prints the head of the list
    val first = s.head                            //> first  : Demo.Stud = Stud(1,Shiva,50)
    //gets rest of everything
    val rest  = s.tail                            //> rest  : List[Demo.Stud] = List(Stud(2,ram,90), Stud(3,prasad,60))
    //gets tail head
    val rest1= s.tail.head                        //> rest1  : Demo.Stud = Stud(2,ram,90)
    //gets  the last element
    val rest2 = s.tail.tail                       //> rest2  : List[Demo.Stud] = List(Stud(3,prasad,60))
    
    val toppers = s.filter(s => s.marks>=60)      //> toppers  : List[Demo.Stud] = List(Stud(2,ram,90), Stud(3,prasad,60))
    
    //tuple's partition
    val parts = s.partition(s => s.marks>=60)     //> parts  : (List[Demo.Stud], List[Demo.Stud]) = (List(Stud(2,ram,90), Stud(3,
                                                  //| prasad,60)),List(Stud(1,Shiva,50)))
    
    val part1 = parts._1.head                     //> part1  : Demo.Stud = Stud(2,ram,90)
    val part2 = parts._2                          //> part2  : List[Demo.Stud] = List(Stud(1,Shiva,50))
    
    val (part3, part4) = s.partition(s => s.marks>=60)
                                                  //> part3  : List[Demo.Stud] = List(Stud(2,ram,90), Stud(3,prasad,60))
                                                  //| part4  : List[Demo.Stud] = List(Stud(1,Shiva,50))
 			   
 	  
     
   
}