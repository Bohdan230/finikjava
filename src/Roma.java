public class Roma {
    /*Написать класс с методом заполняющий массив случайными числами в диапазоне от 0 до 10
	Имя метода: void fillVectorByRandom(int[] vector)*/
    public static void fillVectorByRandom() {
        double randomNumber = Math.random();
        randomNumber = randomNumber * 10;
        randomNumber = randomNumber + 1;
        int randomNumberInt = (int) randomNumber;
        System.out.println(randomNumberInt);
    }


    /*Написать класс с методом рисующий закрашенный прямоугольник из 	звездочек,
       высота и ширина передаются методу в качестве параметра
       В случае, если какой то параметр имеет неправильное значение, выводить
       сообщение, например: Неверное значение ширины.
       Метод: void drawRectangle(int height, int width)
       Пример:  drawRectangle(3, 4)*/
    public static void drawRectangle(int height, int width) {
        // if ((height !=3) && (width != 4)){
        if (height <= 0 || width <= 0) {
            System.out.println("Неверное значение ширины");
        }
    }

    /*Написать класс с методом рисующий лесенку из звездочек, высота равна
    ширине, и передается в метод в качестве параметра. например:
    В случае, если значение высоты имеет неправильное значение, выводить
    сообщение, например: Неверное значение высоты
    Метод: void drawStair(int height)
    Пример: 	 drawStair(4)*/
    public static void drawStair(int height) {
        int weight = 0;
        weight = height;
        int n = height;
        if (height >= 0) {
            for (int i = 0; i < n; i++) {
                String result = "*";
                for (int j = 0; j < i; j++) {
                    result += "*";
                }
                System.out.println(result);
            }
        } else {
            System.out.println("Неверное значение высоты");
        }

    }


    /*Написать метод выводящий элементы массива на экран в обратном порядке.
           В случае, если размер вектора некорректный, выводить сообщение
           "Неверный размер вектора"
           Метод: void revertVector(int[] vector)
           Пример:
           revertVector(int[] vector); // [1, 2, 3, 4, 5, 6, 7]
           [7, 6, 5, 4, 3, 2, 1] */
    public static void revertVector(int[] vector) {
        int size = vector.length;
        for (int i = size - 1; i >= 0; i--) {
            if (vector[i] < 0) {
                System.out.println("Неверный размер вектора");
            } else {
                System.out.println(vector[i] + "");
            }
        }

    }

    /*Написать метод меняющий местами половины массива, если размер нечетный -
    центральный элемент не учитывается
    В случае, если размер вектора некорректный, выводить сообщение
	 "Неверный размер вектора", иначе выводить массив в
    красивом формате [1	 2, 3]
    Метод: void swapHalves(int[] vector)
    Пример:	 swapHalves(int[] vector); // [1234567]
	 [5, 6, 7, 4, 1, 2, 3]*/
    public static void swapHalves(int[] vector) {
        int size = vector.length;

    }


}
