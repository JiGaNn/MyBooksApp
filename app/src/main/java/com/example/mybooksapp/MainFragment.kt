package com.example.mybooksapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.mybooksapp.databinding.FragmentMainBinding

class MainFragment : Fragment(), BookClickListener {

    private lateinit var binding: FragmentMainBinding
    private var amm = true

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (amm) {
            populateBooks()
            amm = false
        }
        val main = this

        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(view.context, 2)
            adapter = CardAdapter(bookList, main)
        }
    }
    private fun populateBooks() {

        val book1 = Book(
            R.drawable.the_gost_sequences,
            "A.C. Wise",
            "The Ghost Sequences",
            "\"A haunting is a moment of trauma, infinitely repeated. It extends forward and backward in time. It is the hole grief makes. It is a house built by memory in-between your skin and bones.\"\n" +
                    "\n" +
                    "A lush and elegant collection of tales—many having appeared in various \"Best Of...\" anthologies—teeming with frightful and tragic events, yet profoundly and intimately human. These chilling tales will engross and enthrall.\n" +
                    "\n" +
                    "For readers of Kelly Link, Carmen Maria Machado, and Angela Carter, this is a must have collection of ghostly tales set to deliver a frisson of terror and glee."
        )
        bookList.add(book1)

        val book2 = Book(
            R.drawable.the_everlasting_final_cover,
            "Katy Simpson Smith",
            "The Everlasting",
            "From a supremely talented author comes this brilliant and inventive novel, set in Rome in four different centuries, that explores love in all its various incarnations and ponders elemental questions of good and evil, obedience and free will that connect four unforgettable lives.\n" +
                    "\n" +
                    "Spanning two thousand years, The Everlasting follows four characters whose struggles resonate across the centuries: an early Christian child martyr; a medieval monk on crypt duty in a church; a Medici princess of Moorish descent; and a contemporary field biologist conducting an illicit affair.\n" +
                    "\n" +
                    "Outsiders to a city layered and dense with history, this quartet separated by time grapple with the physicality of bodies, the necessity for sacrifice, and the power of love to sustain and challenge faith. Their small rebellions are witnessed and provoked by an omniscient, time-traveling Satan who, though incorporeal, nonetheless suffers from a heart in search of repair.\n" +
                    "\n" +
                    "As their dramas unfold amid the brick, marble, and ghosts of Rome, they each must decide what it means to be good. Twelve-year old Prisca defiles the scrolls of her father’s library. Felix, a holy man, watches his friend’s body decay and is reminded of the first boy he loved passionately. Giulia de’ Medici, a beauty with dark skin and limitless wealth, wants to deliver herself from her unborn child. Tom, an American biologist studying the lives of the smallest creatures, cannot pinpoint when his own marriage began to die. As each of these conflicted people struggles with forces they cannot control, their circumstances raise profound and timeless questions at the heart of faith: What is our duty to each other, and what will God forgive?"
        )
        bookList.add(book2)

        val book3 = Book(
            R.drawable.book_of_strange_new_things,
            "Michel Faber",
            "The Book of Strange New Things",
            "It begins with Peter, a devoted man of faith, as he is called to the mission of a lifetime, one that takes him galaxies away from his wife, Bea. Peter becomes immersed in the mysteries of an astonishing new environment, overseen by an enigmatic corporation known only as USIC. His work introduces him to a seemingly friendly native population struggling with a dangerous illness and hungry for Peter’s teachings—his Bible is their “book of strange new things.” But Peter is rattled when Bea’s letters from home become increasingly desperate: typhoons and earthquakes are devastating whole countries, and governments are crumbling. Bea’s faith, once the guiding light of their lives, begins to falter.\n" +
                    "\n" +
                    "Suddenly, a separation measured by an otherworldly distance, and defined both by one newly discovered world and another in a state of collapse, is threatened by an ever-widening gulf that is much less quantifiable. While Peter is reconciling the needs of his congregation with the desires of his strange employer, Bea is struggling for survival. Their trials lay bare a profound meditation on faith, love tested beyond endurance, and our responsibility to those closest to us."
        )
        bookList.add(book3)

        val book4 = Book(
            R.drawable.witches_of_america,
            "Alex Mar",
            "Witches of America",
            "“Unique and vital… Witches of America is a seeker’s memoir told through a quilted veil: a collection of strong, journalistic profiles of several fascinating American practitioners of the occult. Through these witches, priests and necromancers, Alex Mar surveys the history and modern practice of various forms of witchcraft in America, while investigating her own longing ‘to be disturbed, shaken into believing.’ ”"
        )
        bookList.add(book4)

        val book5 = Book(
            R.drawable.cancer_ward,
            "Aleksandr I. Solzhenitsyn",
            "Cancer Ward",
            "One of the great allegorical masterpieces of world literature, Cancer Ward is both a deeply compassionate study of people facing terminal illness and a brilliant dissection of the “cancerous” Soviet police state."
        )
        bookList.add(book5)

        val book6 = Book(
            R.drawable.numbers_in_the_dark,
            "Italo Calvino",
            "Numbers in the Dark",
            "Numbers in the Dark is a collection of short stories covering the length of Italo Calvino's extraordinary writing career, from when he was a teenager to shortly before his death. They include witty allegories and wise fables; a town where everything has been forbidden apart from the game of tip-cat; a pitiable tribe watching the flight paths of guided missiles from outside their mud huts; a computer programmer considering the possible sequence of a series of brutal acts; and dialogues with Henry Ford, a Neanderthal and the gloomy, overthrown Montezuma ..."
        )
        bookList.add(book6)

        val book7 = Book(
            R.drawable.milk,
            "Anne Mendelson",
            "Milk",
            "Part cookbook—with more than 120 enticing recipes—part culinary history, part inquiry into the evolution of an industry, Milk is a one-of-a-kind book that will forever change the way we think about dairy products.\n" +
                    "\n" +
                    "Anne Mendelson, author of Stand Facing the Stove, first explores the earliest Old World homes of yogurt and kindred fermented products made primarily from sheep’s and goats’ milk and soured as a natural consequence of climate. Out of this ancient heritage from lands that include Greece, Bosnia, Turkey, Israel, Persia, Afghanistan, and India, she mines a rich source of culinary traditions.\n" +
                    "\n" +
                    "Mendelson then takes us on a journey through the lands that traditionally only consumed milk fresh from the cow—what she calls the Northwestern Cow Belt (northern Europe, Great Britain, North America). She shows us how milk reached such prominence in our diet in the nineteenth century that it led to the current practice of overbreeding cows and overprocessing dairy products. Her lucid explanation of the chemical intricacies of milk and the simple home experiments she encourages us to try are a revelation of how pure milk products should really taste.\n" +
                    "\n" +
                    "The delightfully wide-ranging recipes that follow are grouped according to the main dairy ingredient: fresh milk and cream, yogurt, cultured milk and cream, butter and true buttermilk, fresh cheeses. We learn how to make luscious Clotted Cream, magical Lemon Curd, that beautiful quasi-cheese Mascarpone, as well as homemade yogurt, sour cream, true buttermilk, and homemade butter. She gives us comfort foods such as Milk Toast and Cream of Tomato Soup alongside Panir and Chhenna from India. Here, too, are old favorites like Herring with Sour Cream Sauce, Beef Stroganoff, a New Englandish Clam Chowder, and the elegant Russian Easter dessert, Paskha. And there are drinks for every season, from Turkish Ayran and Indian Lassis to Batidos (Latin American milkshakes) and an authentic hot chocolate.\n" +
                    "\n" +
                    "This illuminating book will be an essential part of any food lover’s collection and is bound to win converts determined to restore the purity of flavor to our First Food."
        )
        bookList.add(book7)

        val book8 = Book(
            R.drawable.winchell,
            "Neal Gabler",
            "Winchell",
            "Hailed as the most important and entertaining biography in recent memory, Gabler's account of the life of fast-talking gossip columnist and radio broadcaster Walter Winchell \"fuses meticulous research with a deft grasp of the cultural nuances of an era when virtually everyone who mattered paid homage to Winchell\" (Time). of photos."
        )
        bookList.add(book8)

        val book9 = Book(
            R.drawable.three_delays,
            "Charlie Smith",
            "Three Delays",
            "From Charlie Smith (Cheap Ticket to Heaven, Chimney Rock, Shine Hawk), author of three New York Times Notable Books and a literary stylist whose “writing can make the mountains ring\" (New York Times Book Review), comes his first novel in more than a decade, Three Delays, which follows the troubled lives of two lovers as they combat their passions and each other. In the words of James Dickey, \"Writers after Charlie Smith will have to take him into account, but I doubt if any will equal or surpass him.\""
        )
        bookList.add(book9)

        val book10 = Book(
            R.drawable.lost_decades,
            "Menzie Chinn",
            "Lost Decades",
            "Welcome to Argentina: by 2008 the United States had become the biggest international borrower in world history, with almost half of its 6.4 trillion dollar federal debt in foreign hands. The proportion of foreign loans to the size of the economy put the United States in league with Mexico, Pakistan, and other third-world debtor nations. The massive inflow of foreign funds financed the booms in housing prices and consumer spending that fueled the economy until the collapse of late 2008. The authors explore the political and economic roots of this crisis as well as its long-term effects. They explain the political strategies behind the Bush administration's policy of funding massive deficits with the foreign borrowing that fed the crisis. They see the continuing impact of our huge debt in a slow recovery ahead. Their clear, insightful, and comprehensive account will long be regarded as the standard on the crisis."
        )
        bookList.add(book10)

        val book11 = Book(
            R.drawable.the_fractalist,
            "Benoit Mandelbrot",
            "The Fractalist",
            "A fascinating memoir from the man who revitalized visual geometry, and whose ideas about fractals have changed how we look at both the natural world and the financial world.\n" +
                    "\n" +
                    "Benoit Mandelbrot, the creator of fractal geometry, has significantly improved our understanding of, among other things, financial variability and erratic physical phenomena. In The Fractalist, Mandelbrot recounts the high points of his life with exuberance and an eloquent fluency, deepening our understanding of the evolution of his extraordinary mind. We begin with his early years: born in Warsaw in 1924 to a Lithuanian Jewish family, Mandelbrot moved with his family to Paris in the 1930s, where he was mentored by an eminent mathematician uncle. During World War II, as he stayed barely one step ahead of the Nazis until France was liberated, he studied geometry on his own and dreamed of using it to solve fresh, real-world problems. We observe his unusually broad education in Europe, and later at Caltech, Princeton, and MIT. We learn about his thirty-five-year affiliation with IBM’s Thomas J. Watson Research Center and his association with Harvard and Yale. An outsider to mainstream scientific research, he managed to do what others had thought impossible: develop a new geometry that combines revelatory beauty with a radical way of unfolding formerly hidden laws governing utter roughness, turbulence, and chaos.\n" +
                    "\n" +
                    "Here is a remarkable story of both the man’s life and his unparalleled contributions to science, mathematics, and the arts."
        )
        bookList.add(book11)

        val book12 = Book(
            R.drawable.closing_time,
            "Joe Queenan",
            "Closing Time",
            "Recounts the author's Irish-Catholic upbringing in a 1960s Philadelphia housing project, a youth marked by his alcoholic father's volatile temper, a series of mentors and surrogate fathers, and the author's struggles to forge a more promising future through his love for books and music."
        )
        bookList.add(book12)

    }

    override fun onClick(book: Book) {
        val bundle = Bundle()
        bundle.putInt("bookID", book.id!!)
        MAIN.navController.navigate(R.id.action_mainFragment_to_detailFragment, bundle)
    }
}