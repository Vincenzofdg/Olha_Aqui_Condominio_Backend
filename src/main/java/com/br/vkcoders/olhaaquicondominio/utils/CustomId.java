package com.br.vkcoders.olhaaquicondominio.utils;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CustomId {
    public static String generateId() {
        // 🔹 1. Gerar a parte da data e hora
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy-HH/mm/ss");
        String dateTimePart = formatter.format(new Date());

        // 🔹 2. Gerar um hash aleatório de 8 caracteres (números e letras)
        String hashPart = generateRandomHash(8);

        // 🔹 3. Montar o ID final
        return dateTimePart + "-" + hashPart;
    }

    private static String generateRandomHash(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; // Possíveis caracteres do hash
        SecureRandom random = new SecureRandom();
        StringBuilder hash = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            hash.append(characters.charAt(index));
        }

        return hash.toString();
    }

    public static void main(String[] args) {
        System.out.println("ID Gerado: " + generateId());
    }
}
