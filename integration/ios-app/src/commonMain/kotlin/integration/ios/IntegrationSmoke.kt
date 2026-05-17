package integration.ios

import io.multifunctions.let
import io.multifunctions.mapCheckNull
import io.multifunctions.models.Quad

class IntegrationSmoke {
    fun message(): String {
        val title = Quad("Multi", "Functions", "iOS", "Integration")
            .let { first, second, third, fourth ->
                listOf(first, second, third, fourth).joinToString(" ")
            }

        val sum = listOf(
            Quad(1, 2, 3, 4),
            Quad(5, 6, 7, 8),
        ).mapCheckNull { first, second, third, fourth ->
            first + second + third + fourth
        }.sum()

        return "$title resolved from GitHub Packages with smoke sum $sum"
    }
}
