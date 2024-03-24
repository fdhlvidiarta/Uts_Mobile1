package com.fadhil.uts_mobile1

fun main(){
        // Inisialisasi mutableList dan Tambah data List
        val separator = "=".repeat(70)
        val clubs = mutableListOf<Club>()
        clubs.add(Club("Liverpool", 19, 8, 9, 6, 3))
        clubs.add(Club("Manchester United", 20, 12, 6, 3, 1))
        clubs.add(Club("Chelsea", 6, 6, 5, 2, 2))
        clubs.add(Club("Manchester City", 8, 8, 8, 0, 0))
        clubs.add(Club("Arsenal", 13, 14, 2, 0, 0))

        // Menyortir klub berdasarkan jumlah total trofi terbanyak
        val sortedClubs = filterAndSort(clubs, ::sortByNumberTrophyTotal)
        println("============= Urutan Klub Berdasarkan Jumlah Total Trofi =============")
        for (club in sortedClubs) {
                println("${club.name}: ${club.totalTrofi} Trofi")
        }
        println(separator)

        // Memfilter klub yang belum pernah memenangkan Liga Champions Eropa dan Liga Eropa UEFA
        val filteredClubs = filterAndSort(clubs,::filterByEuropeanTrophy)
        println("Klub yang belum pernah memenangkan Liga Champions dan Liga Eropa UEFA:")
        for (club in filteredClubs) {
                println("${club.name}")
        }
        // Panggil extension function Club recap
        println(separator)
        println("\t\t\t\tDaftar Recap Perolehan Trofi Club")
        println(separator)
        clubs.forEach { println(it.recap()) }
}

// High order function filter and sort
fun filterAndSort(clubs: List<Club>, options: (List<Club>) -> List<Club>): List<Club> {
        return options(clubs)
}

// Fungsi sorting
fun sortByNumberTrophyTotal(clubs: List<Club>): List<Club> {
        val sortedClubs = clubs.sortedByDescending { it.totalTrofi }
        return sortedClubs
}

// Fungsi filter
fun filterByEuropeanTrophy(clubs: List<Club>): List<Club> {
        val filteredClubs = clubs.filter { it.Liga_Champions == 0 && it.LigaEropa_UEFA == 0 }
        return filteredClubs
}
