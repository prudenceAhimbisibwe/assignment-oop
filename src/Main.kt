/*1.Create a class called Human with these attributes: name, age, weight. It has
the following functions:
-eat(foodWeight: Int) :Prints “I am eating {foodWeight}kgs of food”
and increments the human’s weight by the weight of the food eaten
(3 points)
-
-speak(speech: String) :Prints the string passed toit                (2
points)
-birthday( ) :Increments the human’s age by 1(2
points)
Create an instance of this human class and invoke all its functions
2.Create a data class User with these fields: firstName, lastName, email,
phoneNumber, password. Create an instance of User  and print out any 2
attributes */
  /*                                                                                                          (3 points
 */
fun main(){
    var person  = Human("prudence",24,65)
    person.eat(3)
    println(person.weight)
    person.speak("I love God")
    person.bithday(1)
    var x =User("Ahimbisibwe","Prudence","prudeahimbisibwe@gmail.com","0784017930","pru126nce")
    println(x.firstName)
    println(x.lastName)
    println(x.email)
    println(x.phoneNumber)
    println(x.password)


}
class Human(var name:String,var age:Int,var weight:Int) {
    fun eat(foodWeight: Int) {
        println("I am eating $foodWeight kgs of food")
        weight += foodWeight
    }

    fun speak(speech: String) {
        println(speech)

    }

    fun bithday(increment:Int) {
        age++
        println(age)

    }
}
    class User(var firstName:String,var lastName: String,var email:String,var phoneNumber: String,var password:String){

    }



