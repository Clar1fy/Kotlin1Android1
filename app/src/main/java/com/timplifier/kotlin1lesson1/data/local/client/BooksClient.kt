package com.timplifier.kotlin1lesson1.data.local.client

import com.timplifier.kotlin1lesson1.R
import com.timplifier.kotlin1lesson1.domain.models.BookModel

class BooksClient {


    fun getBooks(): List<BookModel> {
        val list = ArrayList<BookModel>()
        list.add(
            BookModel(
                "The Subtle Art of Not Giving a Fuck: A Counterintuitive Approach to Living a Good Life",
                "The Subtle Art of Not Giving a Fuck: A Counterintuitive Approach to Living a Good Life (first published in 2016) is the second book by blogger and author Mark Manson. In it, Manson argues that life's struggles give it meaning, and that the mindless positivity of typical self-help books is neither practical nor helpful.",
                R.drawable.the_subtle_art_of_not_giving_a_fuck
            )
        )
        list.add(
            BookModel(
                "Models. Attract women through honesty",
                "Models is the first book ever written on seduction as an emotional process rather than a logical one, a process of connecting with women rather than impressing them. It's the most mature and honest guide on how a man can attract women without faking behavior, without lying and without emulating others. A game-changer.",
                R.drawable.attract_women_through_honesty
            )
        )
        list.add(
            BookModel(
                "Flowers for Algernon",
                "Flowers for Algernon is a character study of one man, Charlie Gordon. Charlie is a 32-year-old developmentally disabled man who has the opportunity to undergo a surgical procedure that will dramatically increase his mental capabilities.",
                R.drawable.flowers_for_algernon
            )
        )
        list.add(
            BookModel(
                "World of Warcraft : Arthas. Rise of the Lich King",
                "Description. When a plague of undeath threatened all that he loved, Arthas was driven to pursue an ill-fated quest for a runeblade powerful enough to save his homeland. Yet the object of his search would exact a heavy price from its new master, beginning a horrifying descent into damnation.",
                R.drawable.lich_king
            )
        )


        return list
    }
}