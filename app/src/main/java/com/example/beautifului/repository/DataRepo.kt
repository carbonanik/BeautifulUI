package com.example.beautifului.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.beautifului.R
import com.example.beautifului.model.Movie


class DataRepo {

    private val _movieList = MutableLiveData<List<Movie>>()
    val movieList: LiveData<List<Movie>>
        get() = _movieList


    fun getMovieList() {
        _movieList.value = dataList
    }

    private val dataList: List<Movie> = arrayListOf(
        Movie(
            id = 5,
            name = "Dhaka Attack",
            year = "2017",
            director = "Dipankar Dipon",
            imgRes = R.drawable.dhaka_attack,
            favourite = false,
            detail = "Dhaka Attack (Bengali: ঢাকা অ্যাটাক) is a Bangladeshi action thriller film produced by Dhaka Police Paribar Kallayan Samity Ltd., Three Wheelers Ltd. and Splash Multimedia. It features Taskeen Rahman, Arifin Shuvo, Mahiya Mahi and ABM Sumon in lead roles."
        ),
        Movie(
            id = 6,
            name = "Guerrilla",
            year = "2011",
            director = "Nasiruddin Yousuff",
            imgRes = R.drawable.gerila,
            favourite = true,
            detail = "Guerrilla is a 2011 Bangladeshi film based on the events of the Bangladesh Liberation War. An adaptation of the novel Nishiddho Loban by Syed Shamsul Huq, it was released on 14 April 2011. Nishiddho Loban, the novel, is written by the prolific Bengali writer Syed Shamsul Huq"
        ),
        Movie(
            id = 7,
            name = "Debi",
            year = "2018",
            director = "Anam Biswas",
            imgRes = R.drawable.debi,
            favourite = false,
            detail = "Debi: Misir Ali Prothombar or simply Debi is a 2018 Bangladeshi supernatural thriller film based on Humayun Ahmed's novel of the same name. It is directed by Anam Biswas, starring Chanchal Chowdhury as Misir Ali, Jaya Ahsan, Iresh Zaker, Animesh Aich and Sabnam Faria."
        ),
        Movie(
            id = 8,
            name = "The Clay Bird",
            year = "10",
            director = "Tareque Masud",
            imgRes = R.drawable.matir_moina,
            favourite = true,
            detail = "When Bangladeshi father Kazi (Jayanto Chattopadhyay) becomes a conservative Muslim, he opts to send his son, Anu (Nurul Islam Bablu), to an Islamic school in order to shelter him from the worldly influences of the 1960s. Meanwhile, Anu's thoughtful mother, Ayesha (Rokeya Prachy), who isn't inclined toward zealotry, handles the changes in stride. As the country heads into turmoil, the rigid beliefs that Kazi adheres to and his son tries to understand may have a lasting impact on the family."
        ),
        Movie(
            id = 1,
            name = "Aguner Poroshmoni",
            year = "1994",
            director = "Humayun Ahmed",
            imgRes = R.drawable.aguner_porosmoni,
            favourite = true,
            detail = "Aguner Poroshmoni is a 1994 film based on the novel of the same name written and directed by Humayun Ahmed. The film won National Film Award in eight categories including Best Picture, Best Director and Best Plot. It was the first movie directed by Humayun Ahmed."
        ),
        Movie(
            id = 2,
            name = "Alor Michil",
            year = "1974",
            director = "Narayan Ghosh Mita",
            imgRes = R.drawable.alor_michil,
            favourite = true,
            detail = "Language. Bengali. Alor Michil (Bengali: আলোর মিছিল; English translation: Procession of Light) is a 1974 Bangladeshi patriotic film which focuses on the independence movement of 1971. Written and directed by Narayan Ghosh Mita, it stars Abdur Razzak, Babita, Farooque and Anwar Hussain in lead roles."
        ),
        Movie(
            id = 3,
            name = "Aynabaji",
            year = "2016",
            director = "Amitabh Reza Chowdhury",
            imgRes = R.drawable.aynabaji,
            favourite = false,
            detail = "Language. Bengali. Aynabaji (Bengali: আয়নাবাজি pronounced [äɪ̯naːbäd͡ʒi]) is a 2016 Bangladeshi crime thriller film directed by Amitabh Reza Chowdhury and produced by Gousul Alam under the banner of Content Matters Production. The film stars Chanchal Chowdhury, Masuma Rahman Nabila and Partha Barua in lead roles."
        ),
        Movie(
            id = 4,
            name = "Chutir Ghonta",
            year = "1980",
            director = "Azizur Rahman",
            imgRes = R.drawable.chutir_ghonta,
            favourite = false,
            detail = "Chhutir Ghonta is a 1980 Bangladeshi drama film written and directed by Azizur Rahman. It stars Abdur Razzak, Shabana, Sujata and Sumon in the lead."
        ),
        Movie(
            id = 9,
            name = "Monpura",
            year = "2009",
            director = "Giasuddin Selim",
            imgRes = R.drawable.monpura,
            favourite = false,
            detail = "Monpura, is a Bangladeshi Bengali film, directed by Giasuddin Selim. The film was remade into Bengali India in 2010 as Achin Pakhi, which was directed by Anjan Das. Monpura is a romantic tragedy film set in rural Bangladesh."
        ),
        Movie(
            id = 10,
            name = "Mukh O Mukhosh",
            year = "1956",
            director = "Abdul Jabbar Khan",
            imgRes = R.drawable.mukh_o_mukhos,
            favourite = true,
            detail = "Mukh O Mukhosh was the first Bengali language feature film to be made in East Pakistan. It was produced by Iqbal Films and directed by Abdul Jabbar Khan. The film was released in East Pakistan on 3 August 1956. It was released in Dhaka, Chittagong, Narayanganj, and Khulna."
        ),
        Movie(
            id = 11,
            name = "Bhat De",
            year = "1984",
            director = "Amjad Hossain",
            imgRes = R.drawable.vat_de,
            favourite = true,
            detail = "Bhat De is a Bangladeshi film, released in 1984. The film was edited, written and directed by Amjad Hossain. The film starred Alamgir, Shabana in the lead roles and co-starred Wasimul Bari Rajib, Anwar Hossain and more."
        ),
        Movie(
            id = 12,
            name = "Dipu Number Two",
            year = "1996",
            director = "Morshedul Islam",
            imgRes = R.drawable.dipu_no_two,
            favourite = true,
            detail = "Dipu Number Two is a 1996 Bangladeshi film directed by Morshedul Islam. The screenplay was based on the 1984 novel of the same name by Muhammed Zafar Iqbal. "
        ),
        Movie(
            id = 13,
            name = "Ammajan",
            year = "1999",
            director = "Kazi Hayat",
            imgRes = R.drawable.ammajan,
            favourite = false,
            detail = "After the death of his father, Badshah and his mother go through several problems and he ends up becoming a gangster and a messiah for women who face atrocities at the hands of men."
        ),
        Movie(
            id = 14,
            name = "A",
            year = "10",
            director = "",
            imgRes = R.drawable.aguner_porosmoni,
            favourite = false
        ),
        Movie(
            id = 15,
            name = "A",
            year = "10",
            director = "",
            imgRes = R.drawable.aguner_porosmoni,
            favourite = false
        ),
        Movie(
            id = 16,
            name = "A",
            year = "10",
            director = "",
            imgRes = R.drawable.aguner_porosmoni,
            favourite = false
        ),
        Movie(
            id = 17,
            name = "A",
            year = "10",
            director = "",
            imgRes = R.drawable.aguner_porosmoni,
            favourite = false
        )
    )

}