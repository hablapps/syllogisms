package syllogisms
package figure1

object Darii extends Syllogism:

  //All M are P
  type Major = (x: Entity) => x.M => x.P

  //Some S are M
  trait Minor:
    val x: Entity;
    val value: (x.S, x.M)

  //Some S are P
  trait Conclusion:
    val x: Entity;
    val value: (x.S, x.P)

  def proof(major: Major, minor: Minor): Conclusion = new Conclusion:
    val x: minor.x.type = minor.x
    val value = (minor.value._1, major(x) apply minor.value._2)


