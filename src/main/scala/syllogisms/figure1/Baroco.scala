package syllogisms
package figure1

import propositions._

object Baroco extends Syllogism{

  // All P are M
  type Major = (x: Entity) => x.P => x.M

  // Some S are not M
  trait Minor { val x: Entity; val value: (x.S, Not[x.M]) }

  // Some S are not P
  trait Conclusion { val x: Entity; val value: (x.S, Not[x.P]) }

  def proof(major: Major, minor: Minor): Conclusion = new Conclusion {
    val x: minor.x.type = minor.x
    val value = (minor.value._1, contraposition(major(x)) apply minor.value._2)
  }

}
