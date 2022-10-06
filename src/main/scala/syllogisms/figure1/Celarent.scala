package syllogisms
package figure1

import propositions.*

object Celarent extends Syllogism {

  //No M is P
  type Major = (x: Entity) => x.M => Not[x.P]

  //All S are M
  type Minor = (x: Entity) => x.S => x.M

  //No S is P
  type Conclusion = (x: Entity) => x.S => Not[x.P]

  def proof(major: Major, minor: Minor): Conclusion =
    x => major(x) compose minor(x)


}
