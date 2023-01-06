package lesson027;

import java.util.Random;
import java.util.Stack;

public class ManagerCozum {
	Stack<Tabak> kirliler;
    Stack<Tabak> temizler;

   



  // public void rastgeleTabakOlustur() {
    //    Random random = new Random();



 /*
         for (int i = 0; i < 10; i++) {
  
          Tabak tabak = new Tabak(i + 1, random.nextBoolean());
         if (tabak.isKirliMi()) {
                kirliler.push(tabak);
            } else {
                temizler.push(tabak);
            }
        }
   }
*/
   public void yazdir(Stack<Tabak> stack) {



       while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
