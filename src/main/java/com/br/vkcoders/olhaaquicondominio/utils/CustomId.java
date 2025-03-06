package com.br.vkcoders.olhaaquicondominio.utils;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomId {
    public static String generateId() {
        // 🔹 1. Gerar a parte da data no formato correto: "ddMMyyyy"
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
        String datePart = dateFormat.format(new Date());

        // 🔹 2. Gerar um hash aleatório de 8 caracteres (números e letras)
        String hashPart = generateRandomHash(6);  // Agora 6 caracteres, mais curto e eficiente

        // 🔹 3. Gerar a parte da hora no formato "HHmmss"
        SimpleDateFormat timeFormat = new SimpleDateFormat("HHmmss");
        String timePart = timeFormat.format(new Date());

        // 🔹 4. Montar o ID no formato correto: "DDMMYYYY-HASH-HHMMSS"
        return datePart + "-" + hashPart + "-" + timePart;
    }

    private static String generateRandomHash(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
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
