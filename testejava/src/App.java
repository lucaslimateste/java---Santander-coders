import javax.lang.model.util.ElementScanner14;

public class App {
    public static void main(String[] args){
    
      int radar = 30;
      String velocidade;
    if (radar >= 70){
      velocidade = "velocidade alta";
    } else if (radar >= 50 && radar <= 60 ){
      velocidade = "velocidade media";
    } else if (radar >= 30 && radar <=40){
      velocidade = "velocidade baixa";
    } else { 
      velocidade ="";}

     switch(velocidade){
        case "velocidade alta": 
        case "velocidade media":
        System.out.println("multado");
        break;
        case "velocidade baixa":
        System.out.println("velocidade permitida");
        break;
        default:
        System.out.println("velocidade invalida");
    }
    }  
    }

  





// String name;
// name = "lucas lima";

// System.out.println("ola, "+name);

// tipos primitivos
// int a = 5;
        // int b;
        // b = 2;
        // int soma = a + b;
        // int subtração = a - b;
        // int multiplicação = a * b;
        // float divisão = (float) a / b;

        // System.out.println(soma);
        // System.out.println(subtração);
        // System.out.println(multiplicação);
        // System.out.println(divisão);

// operadores booleanos and(&&),or(||).

      // boolean queijo = true;
      // boolean macarão = false;
      // boolean lasanha1 = macarão && queijo;
      // boolean lasanha = macarão || queijo;
      // System.out.println(lasanha); (os dois tem que ser true)
      // System.out.println(lasanha1);(somente algum dos dois tem que ser true pra ser true)

// operador ternario
      // string mensagem = fimDeSemana ? "É fimDeSemana":"não é fimDeSemana";

// estrutura condicional if - else
      // int radar = 60;
    // if(radar>=60){
    //   System.out.println("multado");
    // } else {
    //   System.out.println("velocidade permitida");}
    // } 