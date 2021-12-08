##  The news Project

Android Project to show a list of news.a

## Class Model
´´´puml
@startuml
package externals* #ccbbdd {


    package org.threeten.bp {
        class ZoneDateTime{
            ...
        }
        class ZoneId{
        ...
        }

    }
    package net.openhft.hashing{
        class LongHashFunction{
        }
    }
}

package com.github.javafaker {
    class faker{
...
    }

}
package cl.ucn.disc.dsm.the_News {




package model #ccffcc{

    class News<<entity>> {
    - id: Long
    - title: String
    - Source : String
    - author : String
    - url: String
    - urlImage :String
    - description: String
    - content: String
    + News(...)
    +getId(): Long
    +getTitle():String
    +getSource():String
    +getAuthor(): String
    +getUrl():String
    +getUrlImage():string
    +getDescription():String
    +getPublishedAt():ZoneDateTime

    }
  News *--> "1" ZoneDateTime : - publishedAt
  News ..> LongHashFunction : <<use>>


   }

package services #ccccff{

    interface Contracts <<interface>>{
    +retrieveNews(size: int): List <News>
    }
    Contracts..> News : <<use>>
 class ContractsImplFaker<<services>>{
    +ContractsImplFaker()
 }
 ContractsImplFaker..|>Contracts
 ContractsImplFaker..|>ZoneDateTime: <<use>>
 ContractsImplFaker..|>ZoneId : <<use>>
 ContractsImplFaker..|>faker:<<use>>

}



}
@enduml

´´´

## License

[MIT](https://choosealicense.com/licenses/mit/)

