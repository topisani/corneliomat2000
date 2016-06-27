class Person(val navn: String) {

  val titel = "Hr. " + navn
  var løbet = 0
  var flyvet = 0

  def flyv(fart: Int): Unit = {
    println(navn + " flyver " + fart)
    flyvet = fart + flyvet
  }
  def slå(person: Person) = {
    println(this.navn + " slog " + person.navn)
  }
  def løb(længde: Int) = {
    println(this.navn + " løb " + længde + " meter")
    løbet += længde
  }
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

val bias = new Person("Bias")

println("Jeg hedder " +  bias.titel)
bias.løb(6)
bias.løb(5)
println (bias.titel + " har i alt løbet " + bias.løbet + " meter")
bias.flyv(7)
bias.flyv(1)
println (bias.titel + " har i alt flyvet " + bias.flyvet + " meter")


var i = 0
while (i <= 100){
  if ((i % 3 ) == 0 && (i % 5 ) == 0 ){
    println("baaaaaaannngbuuuiiim")
  }
  else if ((i % 3) == 0 ){
    println ("baaaaaaannng")
  }
  else if ((i % 5) == 0 ) {
    println ("buuuuuuuiiiim")
  }

  else {
    println (i)
  }
   i += 1
}
