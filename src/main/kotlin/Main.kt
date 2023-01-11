fun main(){
    val veterinarian = Veterinarian ()
    val animals = listOf(
        Dog("meat","dog house","woof"),
        Cat("mouse","kitchen","meow"),
        Horse("oats","farm","neigh"))
    animals.forEach{animal ->
        veterinarian.treatAnimal(animal)
    }
}