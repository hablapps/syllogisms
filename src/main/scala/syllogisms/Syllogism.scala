package syllogisms

trait Syllogism:
  type Major
  type Minor
  type Conclusion

  def proof(major: Major, minor: Minor): Conclusion
