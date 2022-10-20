package propositions

trait Sugar:

  extension [P](np: P => Nothing)
    def contradicts: P => Nothing =
      np
