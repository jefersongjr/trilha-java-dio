public class FormatadorDeCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376064");
            System.out.println(cepFormatado);
        } catch (CepInvalidException e) {
            System.out.println("Cep invalido");
        }
    }

    static String formatarCep(String cep) throws CepInvalidException{
        if (cep.length() != 8)
            throw new CepInvalidException();
        return "23.765-064";
    }
}

