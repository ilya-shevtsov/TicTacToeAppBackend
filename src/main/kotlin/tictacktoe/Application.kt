package tictacktoe

import io.ktor.server.application.*
import tictacktoe.models.TicTacToeGame
import tictacktoe.plugins.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    val game = TicTacToeGame()
    configureSockets()
    configureSerialization()
    configureMonitoring()
    configureRouting(game)
}
