
package object propositions extends Tautologies with Sugar{

  type Absurd = Nothing
  type Not[P] = P => Nothing
  type Or[P, Q] = Either[P, Q]
  type And[P, Q] = (P, Q)
  type Implies[P, Q] = P => Q

}
