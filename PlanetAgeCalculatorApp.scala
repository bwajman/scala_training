object PlanetAgeCalculatorApp {

  def main(args: Array[String]): Unit = {
    val seconds: Long = 1000000000

    println(f"Mercury: ${ageOnPlanet(seconds, 0.2408467)}%.2f lat")
    println(f"Venus: ${ageOnPlanet(seconds, 0.61519726)}%.2f lat")
    println(f"Ziemia: ${ageOnPlanet(seconds, 1.0)}%.2f lat")
    println(f"Mars: ${ageOnPlanet(seconds, 1.8808158)}%.2f lat")
    println(f"Jowisz: ${ageOnPlanet(seconds, 11.862615)}%.2f lat")
    println(f"Saturn: ${ageOnPlanet(seconds, 29.447498)}%.2f lat")
    println(f"Uran: ${ageOnPlanet(seconds, 84.016846)}%.2f lat")
    println(f"Neptun: ${ageOnPlanet(seconds, 164.79132)}%.2f lat")
  }

  def ageOnPlanet(seconds: Long, orbitalPeriod: Double): Double = {
    val EarthYearInSeconds: Double = 31557600
    seconds / (EarthYearInSeconds * orbitalPeriod)
  }
}
