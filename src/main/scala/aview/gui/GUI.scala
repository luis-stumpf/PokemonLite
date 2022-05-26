package de.htwg.se.pokelite
package aview.gui

import controller.Controller
import aview.gui.GUIApp.*
import model.State
import model.states._

import de.htwg.se.pokelite.model.State
import scalafx.scene.layout.VBox
import scalafx.scene.Node
import scalafx.scene.layout.BorderPane
import scalafx.application.JFXApp3
import scalafx.application.Platform
import scalafx.scene.Scene
import scalafx.scene.control.{ Button, Label }
import scalafx.scene.image.{ Image, ImageView }
import scalafx.scene.layout.GridPane
import scalafx.scene.shape.Rectangle

class GUI(GUIApp : GUIApp, val controller : Controller) extends JFXApp3 {
  val fieldPane:FieldPane = new FieldPane(controller.game)
  val initPane:InitPane = new InitPane(controller)
  val menuPane:MenuPane = new MenuPane
  val nameInputPane:NameInputPane = new NameInputPane(controller)
  override def start() : Unit = {
    stage = new JFXApp3.PrimaryStage {
      title = "PokemonLite"
      scene = new Scene(1600, 480) {
        root = new BorderPane {
          background = battleBackground
          left = fieldPane
          val menu = false
          right = controller.game.state match
            case InitState() => initPane
            case InitPlayerState() => nameInputPane


        }
      }
    }
  }

  def update(game: State): Unit = ???


}
