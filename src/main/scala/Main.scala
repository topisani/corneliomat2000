object Main extends App {
  //John.svar("fisk")
  //John.svar("bi")
  //John.svar("gud")
  //John.svar("hugo")
  //John.flyv("lavt")
  //Bias.flyv("højt")
  //Bias.slå(John)
  fister.løb("hurtigt")
}
class Person(val navn: String) {
  def flyv(højde: String): Unit = {
    println(navn + " flyver " + højde)
  }
  def slå(person: Person) = {
    println(this.navn + " slog " + person.navn)
  }
}
def løb(længde: person9) = {
  println(navn.person + " løb " længde)
}
object Bias extends Person("Bias") {
}
object fister extends Person("fister") {

}
object John extends Person ("John") {

  val ynglingsord = "fisk"

  def svar(ord: String): Unit = {
    println("når John hører ordet " + ord + " så tænker han")
    if (ord == "kat") {
      println("den siger miav")
    } else if (ord == "hugo") {
      println("Den er sød og blød")
    } else if (ord == "bi") {
      println("den giver honning")
    } else if (ord == ynglingsord) {
      println("JAAAAAA HURA")
    } else {
      println("Jeg har ikke gået i skole nok til at kende det ord")
    }
  }
}
