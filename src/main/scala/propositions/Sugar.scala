package propositions

trait Sugar {

  implicit class Contradicts[P](np: P => Nothing){
    def contradicts: P => Nothing =
      np
  }

}
