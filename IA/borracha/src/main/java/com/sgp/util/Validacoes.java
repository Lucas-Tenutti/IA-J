package com.sgp.util;


public class Validacoes {

    
    private Validacoes() {
        
    }

    
    public static boolean nomeValido(String cor) {
        
        return !(cor == null || cor.trim().isEmpty() || cor.matches(".*\\d+.*"));
    }

  
    public static String mensagemErroNome(String cor) {
       
        if (cor == null || cor.trim().isEmpty()) {
            return "Erro: O cor não pode estar vazio!";
      
        } else if (cor.matches(".*\\d+.*")) {
            return "Erro: O cor não pode conter números!";
        }
        
        return "";
    }

    
      public static boolean materialValido(String material) {
        
        return !(material == null || material.trim().isEmpty() || material.matches(".*\\d+.*"));
    }

  
    public static String mensagemErroCor(String material) {
       
        if (material == null || material.trim().isEmpty()) {
            return "Erro: O material não pode estar vazio!";
      
        } else if (material.matches(".*\\d+.*")) {
            return "Erro: O material não pode conter números!";
        }
        
        return "";
    }


      public static boolean corValido(String cor) {
        
        return !(cor == null || cor.trim().isEmpty() || cor.matches(".*\\d+.*"));
    }

  
    public static String mensagemErroCor(String cor) {
       
        if (cor == null || cor.trim().isEmpty()) {
            return "Erro: O cor não pode estar vazio!";
      
        } else if (cor.matches(".*\\d+.*")) {
            return "Erro: O cor não pode conter números!";
        }
        
        return "";
    }

   
}
