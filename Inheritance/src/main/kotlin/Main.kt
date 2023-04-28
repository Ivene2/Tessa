fun main(args: Array<String>) {
    var student1=Students()
    student1.gender = "Male and Female"
    student1.course ="Tourism and Hospitality"
    println("The population is made of ${student1.gender} and the courses taken are ${student1.course}")
    student1.curriculum()
    var boys1= Students.Boys()
    boys1.gender ="Male"
    boys1.course ="Tourism"
    boys1.curriculum()
    boys1.football()
    println("Population of boys is 30 ${boys1.gender} all taking ${boys1.course} course as well as playing football")

    var ladies1=Students.Ladies ()
    ladies1.gender ="Female"
    ladies1.course ="Hospitality"
    println("The number of girls is 27 and are all ${ladies1.gender} doing ${ladies1.course} and half the number participating in Hockey.")



}
open class Students{
    var gender : String= ""
    var course : String = ""
    fun curriculum () {
        println("We are using the British system")
    }
    class Boys:Students () {
        fun football() {
            println("The number playing football is 20 out of 30 boys")
        }
    }
    class Ladies:Students () {
        fun hockey() {
            println("The ladies enjoy Hockey")
        }
    }

}