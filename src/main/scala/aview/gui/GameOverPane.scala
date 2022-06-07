package de.htwg.se.pokelite
package aview.gui

import de.htwg.se.pokelite.controller.ControllerInterface
import scalafx.geometry.Pos
import scalafx.scene.image.ImageView
import scalafx.scene.image.Image
import scalafx.scene.layout.VBox
import scalafx.scene.control.Button

case class GameOverPane(controller: ControllerInterface) extends VBox {
  spacing = 30
  alignment = Pos.Center

  val logo = new Image("/Logo.png", 300, 300, true, true)
  val logoView = new ImageView(logo)

  children = List(

    logoView,
    new Button("Play again!"){
      minWidth = 200
      minHeight = 60
      onAction = _ => controller.restartTheGame()
    }
  )
}
    
