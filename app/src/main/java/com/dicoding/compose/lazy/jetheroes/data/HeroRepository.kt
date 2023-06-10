package com.dicoding.compose.lazy.jetheroes.data

import com.dicoding.compose.lazy.jetheroes.model.Hero
import com.dicoding.compose.lazy.jetheroes.model.HeroesData

class HeroRepository {

    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }

    fun searchHeroes(query: String): List<Hero> {
        return HeroesData.heroes.filter {
            it.name.contains(query, ignoreCase = true)
        }
    }

}