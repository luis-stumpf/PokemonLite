package de.htwg.se.pokelite
package model.states

import util.*
import model.*
import model.commands.*

import de.htwg.se.pokelite.model.Command

case class InitState() extends State{

  override def initPlayers():Option[Command] = Some(
    ChangeStateCommand( this, InitPlayerState() )
  )

}