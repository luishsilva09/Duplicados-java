public class App {
    public static void main(String[] args){
        ArrayCreate arr1 = new ArrayCreate();
        ArrayCreate arr2 = new ArrayCreate();

        System.out.println("Para sair escreva: exit");

        for(int i = 1; i < 3; i++){
            System.out.println("Dados para array " + i);
            int cont = 0;
            while(true){
                String input  = System.console().readLine();
                if(input.equals("exit")){
                    break;
                }
                if(i == 1){arr1.addItem(input);}
                if(i == 2){arr2.addItem(input);}
                
            cont++;
            }
        }

        System.out.println("A primeira array foi: " + arr1.getArr());
        System.out.println("A segundo array foi: " + arr2.getArr());

        System.out.println("Os dados repetidos são: " + arr1.hasDuplicate(arr2.arr));

    }
}
