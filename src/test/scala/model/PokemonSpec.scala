package de.htwg.se.pokelite
package model

import de.htwg.se.pokelite.model.PokemonType.Glurak
import org.scalatest.matchers.should.Matchers.*
import org.scalatest.wordspec.AnyWordSpec

class PokemonSpec extends AnyWordSpec {
  "A Pokemon" should {
    val pokemon = Pokemon(Glurak)
    "have a String of form ''" in {
      pokemon.toString should be("Glurak HP: 150")
      pokemon.changeHp(NoAttack()) should be(Pokemon(Glurak, 150))
    }
  }
  "A Glurak" should {
    val pokemon = PokemonType.Glurak
    "have a String of form 'name HP: Int'" in {
      pokemon.toString should be("Glurak HP: 150")
      pokemon.attacks.apply(0) should be(Attack("Flammenwurf", 30))
    }
  }
  "A Simsala" should {
    val pokemon = PokemonType.Simsala
    "have a String of form 'name HP: Int'" in {
      pokemon.toString should be("Simsala HP: 130")
      pokemon.attacks.apply(0) should be(Attack("Simsala", 30))
    }
  }
  "A Brutalanda" should {
    val pokemon = PokemonType.Brutalanda
    "have a String of form 'name HP: Int'" in {
      pokemon.toString should be("Brutalanda HP: 180")
      pokemon.attacks.apply(0) should be(Attack("Flammenwurf", 30))
    }
  }
}