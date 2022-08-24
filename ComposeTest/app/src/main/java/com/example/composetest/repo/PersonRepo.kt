package com.example.composetest.repo

import com.example.composetest.model.Person

class PersonRepo {

    fun getAllData(): List<Person> {
        return listOf(
            Person(id = 0, firstname = "muni", lastname = "te", age = 21),
            Person(id = 1, firstname = "Ram", lastname = "R", age = 22),
            Person(id = 2, firstname = "Sita", lastname = "R", age = 23),
            Person(id = 3, firstname = "Hanu", lastname = "K", age = 24),
            Person(id = 4, firstname = "Shiv", lastname = "E", age = 25),
            Person(id = 5, firstname = "Venk", lastname = "Yedu", age =26),
            Person(id = 6, firstname = "Padma", lastname = "yedu", age = 27),
            Person(id = 7, firstname = "Alivel", lastname = "yedu", age = 28),
            Person(id = 8, firstname = "Bramham", lastname = "B", age = 29),
            Person(id = 9, firstname = "Bramham", lastname = "B", age = 30),
            Person(id = 10, firstname = "Sai", lastname = "Ram", age = 31),

            )


    }
}