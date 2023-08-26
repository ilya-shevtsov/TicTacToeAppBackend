package tictacktoe.plugins

import io.ktor.server.application.*
import io.ktor.server.routing.*
import tictacktoe.models.TicTacToeGame
import tictacktoe.socket

fun Application.configureRouting(game: TicTacToeGame) {
    routing {
        socket(game)
    }
}
