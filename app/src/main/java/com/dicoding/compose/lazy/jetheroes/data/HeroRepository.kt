package com.dicoding.compose.lazy.jetheroes.data

import com.dicoding.compose.lazy.jetheroes.model.Hero
import com.dicoding.compose.lazy.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }
}