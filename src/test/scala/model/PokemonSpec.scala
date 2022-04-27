package de.htwg.se.pokelite
package model

import org.scalatest.matchers.should.Matchers._
import org.scalatest.wordspec.AnyWordSpec

class PokemonSpec extends AnyWordSpec {
  "A NoPokemon" should {
    val noPokemon = NoPokemon()
    "have a String of form ''" in {
      noPokemon.toString should be("")
    }
  }
  "A Pokemon" should {
    val attackList = List(Attack("Flammenwurf", 30), Attack("Donnerblitz", 20), Attack("Bite",15), Attack("Tackle", 10))
    val pokemon = Pokemon("Glurak", 150, attackList)
    "have a String of form 'name HP: Int'" in {
      pokemon.toString should be("Glurak HP: 150")
    }
    "have a def changeHp 'name HP: newHP'" in {
      pokemon.changeHp(100).toString should be("Glurak HP: 100")
    }
  }
}