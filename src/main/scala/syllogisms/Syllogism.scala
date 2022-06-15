package syllogisms

trait Syllogism{

  trait Entity {
    type P
    type M
    type S
  }

  type Major
  type Minor
  type Conclusion

  def proof(major: Major, minor: Minor): Conclusion
}
