package propositions

trait Tautologies {

  def contraposition[P, Q](f: P => Q): Not[Q] => Not[P] =
    nq => p => nq contradicts f(p)
}
