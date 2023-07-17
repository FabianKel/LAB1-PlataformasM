class ItemData {

    private var respuesta: String = " "

    fun getType(originalValue: Any):String{

        val tipo: String = when(originalValue::class.simpleName){
            "String" -> "cadena"
            "Int" -> "entero"
            "Boolean" -> "booleano"
            else -> "null"
        }
        return tipo
    }

    fun getInfo(originalValue: Any): String {
        val largo: Int
        when (getType(originalValue)) {
            "cadena" -> {
                val numStr: String = originalValue.toString()
                largo = numStr.length
                respuesta = "L$largo"
            }

            "entero" -> {
                val numero = originalValue as Int
                respuesta = if (numero % 10 == 0) {
                    "M10"
                } else if (numero % 5 == 0) {
                    "M5"
                } else if (numero % 2 == 0) {
                    "M2"
                } else {
                    "null"
                }
            }

            "booleano" -> {
                val valorBool = originalValue as Boolean
                respuesta = valorBool.toString()
            }

            else -> respuesta = "null"
        }
        return respuesta
    }
}