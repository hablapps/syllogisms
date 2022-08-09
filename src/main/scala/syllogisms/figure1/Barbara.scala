package syllogisms
package figure1

object Barbara extends Syllogism {

  //All M are P
  type Major = (x: Entity) => x.M => x.P

  //All S are M
  type Minor = (x: Entity) => x.S => x.M

  //All S are P
  type Conclusion = (x: Entity) => x.S => x.P

  def proof(major: Major, minor: Minor): Conclusion =
    (x: Entity) => (s: x.S) => major(x) apply minor(x)(s)

}
