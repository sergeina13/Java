import static java.lang.Integer.parseInt;

public class Trowable {
    public static void main(String[] args) throws MyArraySizeException {
        String[][] massive = {{"5", "14", "3", "17"}, {"7", "5", "1", "12"}, {"7", "0", "1", "12"}, {"5", "14", "3", "17"}};
        String[][] massive2 = {{"5", "14", "3", "17"}, {"7", "0", "1", "12"}, {"5", "14", "3", "17"}};
        String[][] massive1 = {{"5", "14", "3", "17"}, {"7", "5", "1", "12"}, {"7", "0", "1", "12"}, {"k", "14", "3", "17"}};

     printMatrix( massive ); // Двумерный строковый массив размером 4х4 (нормальный)
     stringToInt( massive ); // преобразование и сумма чисел массива (нормальный)
   //stringToInt( massive1 ); // буква вместо числа (ошибка с указанием ячейки)
     printMatrix( massive2 ); // неправильный размер массива

    }


    static void printMatrix(String[][] massive) throws MyArraySizeException {  // метод проверки и вывода двумерного строкового массива размером 4х4 (или ошибки)
        int z = 4;
        if (massive.length != z || massive[1].length != z) {
            throw new MyArraySizeException( "Неправильный размер массива" );
        }

        System.out.println("Двумерный строковый массив размером 4х4");
        for (int i = 0; i < massive.length; i++) {
            for (int c = 0; c < massive[i].length; c++)
                System.out.print( massive[i][c] + " " );
            System.out.println();
        }

    }

    public static void stringToInt(String[][] massive) {   // метод преобразование и суммирования чисел массива
        System.out.println("");
        System.out.println("Преобразование двумерного строкового массива в целочисленный");
        Integer[][] intMassive = new Integer[massive.length][4]; // здесь выдает ошибку если убрать 4 столбца (нужно разобраться почему)?
          for (int i = 0; i < massive.length; i++) {
            String[] row = massive[i];
            Integer[] intRow = new Integer[row.length];
            for (int j = 0; j < row.length; j++) {
                String item = massive[i][j];

               try {
                    Integer intItem = Integer.parseInt( item );
                    intMassive[i][j] = intItem;

                } catch (NumberFormatException e) {
                   System.out.println("Ошибка преобразования massive в ячейке = " + "["+ ++i +"]"+"["+ ++j +"]" );

               }
            }
        }
          int summ = 0;

        for (int i = 0; i < intMassive.length; i++) {
            for (int c = 0; c < intMassive[i].length; c++)
                summ = summ + intMassive[i][c];
        }
        System.out.println("Сумма всех элементов = "+ summ);

    }
}

