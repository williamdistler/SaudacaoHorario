import java.util.Date;

class Main {

  public static void main(String[] args) {

    Date momento = new Date();
            
    int hora = momento.getHours();

    if (hora == 0 || hora == 1 || hora == 2)
      hora += 21;
    else
      hora -= 3;

    if (hora >= 0 && hora < 12)
      System.out.println("BOM DIA World!");
    else if (hora > 18 && hora <= 23)
      System.out.println("BOA NOITE World!");
    else 
      System.out.println("BOA TARDE World!");
    
    System.out.println("Agora sao: " + hora + " hrs");

    System.out.println("fim!");
  }
}