package pt.exercicios.telemoveis_marcas

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

private const val VERSÃO_BASE_DADOS = 1


class BDBebidasOpenHelper(
    context: Context?,
) : SQLiteOpenHelper(context, NOME_BASE_DADOS, null, VERSÃO_BASE_DADOS) {
    //called when de database is created for the first time. This is where the creation of tables and
    //and the initial population of the tables should happen.

    override fun onCreate(db: SQLiteDatabase?) {
        requireNotNull(db)
        TabelaBebidas(db!!).cria()
        TabelaMarcas(db!!).cria()
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
    }

    companion object{
        const val NOME_BASE_DADOS = "Bebidas:db"
    }
}