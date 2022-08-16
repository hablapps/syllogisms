package syllogisms
package figure1

import propositions._


object Ferio extends Syllogism {

  //No M is P
  type Major = (x: Entity) => x.M => Not[x.P]

  //Some S are M
  trait Minor {
    val x: Entity;
    val value: (x.S, x.M)
  }

  //Some S are not P
  trait Conclusion {
    val x: Entity;
    val value: (x.S, Not[x.P])
  }

  def proof(major: Major, minor: Minor): Conclusion = new Conclusion {
    val x: minor.x.type = minor.x
    val value = (minor.value._1, major(x) apply minor.value._2)
  }

}

