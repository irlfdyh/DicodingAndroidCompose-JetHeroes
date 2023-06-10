package com.dicoding.compose.lazy.jetheroes

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dicoding.compose.lazy.jetheroes.ui.theme.JetHeroesTheme

@Composable
fun JetHeroesApp(
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {

    }
}

@Composable
@Preview(showBackground = true)
private fun JetHeroesAppPreview() {
    JetHeroesTheme {
        JetHeroesApp()
    }
}