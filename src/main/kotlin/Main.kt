fun main() {
    var janeDoe = Human("Jane Doe", 23, 62.34)
    janeDoe.eat(3)
    println(janeDoe.weight)
    janeDoe.speak("I am a software engineer at AkiraChix")
//    println(janeDoe.age)
    janeDoe.birthday()
    var aboutMarion = User("Marion", "Njeri", "njerimarion@gmail.com","0734572622", 34522121)
    println(aboutMarion.email)
    println(aboutMarion.lastName)
}

class Human(var name: String, var age: Int, var weight: Double){
    fun eat(foodWeight: Int){
        //prints a string and increaments human body weight by weight of food eaten
        println("I am eating ${foodWeight} kgs of food")
        weight += foodWeight
    }
    //:Prints the string passed to it
    fun speak(speech: String) {
        println(speech)
    }
    //Increments the human’s age by 1
    fun birthday(){
        age += 1
    }

}
/*Creates a data class User with these fields: firstName, lastName, email,
phoneNumber, password. and an instance of User and print out any 2
attributes
*/

data class User(var firstName: String, var lastName: String, var email: String, var phoneNumber: String, var password: Int)