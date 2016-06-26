object Main extends App {
  John.svar("fisk")
  John.svar("bi")
  John.svar("gud")
  John.svar("hugo")
}

object John {

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
