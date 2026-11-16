package ParseValue;

public class Parse {

    private static String charactersAbc = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ ";
    private static String charactersEspecials = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~¡";

    private String valueStr;
    private int valueInt;


    public Parse(String valueStr, int valueInt){
        this.valueStr = valueStr != null && !valueStr.isEmpty() ? valueStr : null;
        this.valueInt = valueInt > 0 ? valueInt : -1;
    }

    /**
     *
     * @param actualValue
     * @return si contiene un numero para ser entero
     */
    private boolean isCorrectCharParseToIntegrer(char actualValue) {
        String posiblesCombinations = charactersAbc + charactersEspecials;
        char upperActualValue = Character.toUpperCase(actualValue);

        for (int i = 0; i < posiblesCombinations.length(); i++) {
            char c = Character.toUpperCase(posiblesCombinations.charAt(i));
            if (c == upperActualValue) {
                return false;
            }
        }
        return true;
    }

    /**
     * numero para parsear la string de char
     * @param actualValue
     * @return char = int
     */
    private int mapingCaracterToIntegrer(char actualValue){
        return (int) actualValue -48;
    }

    /**
     * convierte la string en solo numeros
     * @param number
     * @return string limpia
     */
    private String stringLegal(String number){
        String stringLegal = "";
        for (int i = 0; i < number.length(); i++){
            if (isCorrectCharParseToIntegrer(number.charAt(i))) {
                stringLegal += number.charAt(i);
            }
        }
        return stringLegal;
    }


    public int mapingStringToNumber(String string){
        String args = stringLegal(string);
        int j = 0;
        int value = 0;
        for (int i = args.length(); i > 0; i/=10) {
            continue;
        }
        return value;
    }
    /**
     * testing
     * @param args
     */
    public static void main(String[] args) {

        Parse test = new Parse("", 0);
        System.out.println(test.mapingStringToNumber("123"));
    }



}
