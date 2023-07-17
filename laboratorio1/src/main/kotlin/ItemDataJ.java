public class ItemDataJ{

    private String tipo = " ";

    private String respuesta = " ";

    public String getType(Object originalValue){

        System.out.println(originalValue.getClass());
        switch (originalValue.getClass().getSimpleName()) {
            case "String":
                tipo = "cadena";
                break;
            case "Integer":
                tipo = "entero";
                break;
            case "Boolean":
                tipo = "booleano";
                break;
            default:
                tipo = "null";
        }
        return tipo;
    }
    public String getInfo(Object originalValue){
        int largo;
        switch(getType(originalValue)){
            case "cadena":
                largo = (originalValue.toString()).length();
                respuesta = "L"+Integer.toString(largo);
                break;
            case "entero":
                Integer numero = (int) originalValue;
                if(numero%10 == 0){
                    respuesta = "M10";
                } else if (numero%5 == 0) {
                    respuesta = "M5";
                } else if (numero%2 == 0) {
                    respuesta = "M2";
                }else {
                    respuesta = "null";
                }
                break;
            case "booleano":
                Boolean ValorBool = (boolean) originalValue;
                respuesta = ValorBool.toString();
                break;
            default:
                respuesta = "null";
                break;
        }
        return respuesta;
    }

}
