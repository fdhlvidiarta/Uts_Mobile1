package com.fadhil.uts_mobile1

// data class Club
data class Club (val name: String, val LigaPremierInggris: Int, val FA_Cup: Int, val EFL_Cup: Int, val Liga_Champions: Int, val LigaEropa_UEFA: Int){
    val totalTrofi: Int
        get() = LigaPremierInggris + FA_Cup + EFL_Cup + Liga_Champions + LigaEropa_UEFA
}
// extension function recap
fun Club.recap(): String {
    return "$name berhasil meraih $LigaPremierInggris trofi Liga Primer Inggris, $FA_Cup trofi FA, $EFL_Cup trofi EFL, $Liga_Champions trofi Liga Champions, dan $LigaEropa_UEFA trofi Liga Europa UEFA.\n"
}

