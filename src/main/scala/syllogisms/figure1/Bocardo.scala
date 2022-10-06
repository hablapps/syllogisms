package syllogisms
package figure1

import propositions.*

object Bocardo extends Syllogism {

  // Some M are not P
  trait Major {
    val x: Entity;
    val value: (x.M, Not[x.P])
  }

  // All M are S
  type Minor = (x: Entity) => x.M => x.S

  // Some S are not P
  trait Conclusion {
    val x: Entity;
    val value: (x.S, Not[x.P])
  }

  def proof(major: Major, minor: Minor): Conclusion = new Conclusion {
    val x: major.x.type = major.x
    val value = (minor(x) apply major.value._1, major.value._2)
  }

}