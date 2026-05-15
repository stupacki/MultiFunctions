package integration

import io.multifunctions.let
import io.multifunctions.mapCheckNull
import io.multifunctions.models.Quad
import io.multifunctions.models.toList

expect fun integrationTargetName(): String

fun main() {
    runSmokeApplication(integrationTargetName())
}

fun runSmokeApplication(targetName: String) {
    println(buildSmokeMessage(targetName))
}

fun buildSmokeMessage(targetName: String): String {
    val tupleResult = Quad("Multi", "Functions", "GitHub", "Packages")
        .let { first, second, third, fourth ->
            listOf(first, second, third, fourth).joinToString(" ")
        }

    val sum = listOf(
        Quad(1, 2, 3, 4),
        Quad(5, 6, 7, 8),
    ).mapCheckNull { first, second, third, fourth ->
        first + second + third + fourth
    }.sum()

    val tupleSize = Quad("JVM", "JS", "WASM", "Native").toList().size

    return "$tupleResult resolved for $targetName in $tupleSize target groups with smoke sum $sum"
}
