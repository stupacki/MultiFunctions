package io.multifunctions.integration

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import io.multifunctions.let
import io.multifunctions.mapCheckNull
import io.multifunctions.models.Quad

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val title = Quad("Multi", "Functions", "Android", "Integration")
            .let { first, second, third, fourth ->
                listOf(first, second, third, fourth).joinToString(" ")
            }

        val sum = listOf(
            Quad(1, 2, 3, 4),
            Quad(5, 6, 7, 8),
        ).mapCheckNull { first, second, third, fourth ->
            first + second + third + fourth
        }.sum()

        setContentView(
            TextView(this).apply {
                text = "$title\nGitHub Packages smoke sum: $sum"
                textSize = 20f
                setPadding(48, 48, 48, 48)
            }
        )
    }
}
