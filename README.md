#Задание 1

Добавьте в класс FirstSteps (пакет net.thumbtack.school.introduction)  следующие методы

1.	public int sum (int x, int y)
	Возвращает сумму чисел x и y.

2.	public int mul (int x, int y)
	Возвращает произведение чисел x и y.

3.	public int div (int x, int y)
Возвращает частное от деления чисел x и y. Гарантируется, что y != 0.

4.	public int mod (int x, int y)
Возвращает остаток от деления чисел x и y. Гарантируется, что y != 0.

5.	public boolean isEqual (int x, int y)
Возвращает true, если  x равен y, иначе false.

6.	public boolean isGreater (int x, int y)
Возвращает true, если  x больше y, иначе false.

7.	public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y)
Прямоугольник с горизонтальными и вертикальными сторонами, задан двумя точками - левой верхней (xLeft, yTop) и правой нижней (xRight, yBottom). На плоскости OXY ось X направлена вправо, ось Y - вниз. Дана еще одна точка с координатами (x, y). Гарантируется, что xLeft < xRight и yTop < yBottom. Метод должен возвращать true, если точка лежит внутри прямоугольника , иначе false. Если точка лежит на границе прямоугольника, то считается, что она лежит внутри него.

8.	public int sum(int[] array)
Возвращает сумму чисел, заданных одномерным массивом array. Для пустого одномерного массива возвращает 0.

9.	public int mul(int[] array)
Возвращает произведение чисел, заданных одномерным массивом array. Для пустого одномерного массива возвращает 0.

10.	public int min(int[] array)
Возвращает минимальное из чисел, заданных одномерным массивом array. Для пустого одномерного массива возвращает Integer.MAX_VALUE.

11.	public int max(int[] array)
Возвращает максимальное из чисел, заданных одномерным массивом array. Для пустого одномерного массива возвращает Integer.MIN_VALUE.

12.	public double average(int[] array)
Возвращает среднее значение для чисел, заданных одномерным массивом array. Для пустого одномерного массива возвращает 0.

13.	public boolean isSortedDescendant(int[] array)
Возвращает true, если одномерный массив array строго упорядочен по убыванию, иначе false. Пустой одномерный массив считается упорядоченным.

14.	public void cube(int[]array)
Возводит все элементы одномерного массива array в куб.

15.	public boolean find(int[]array, int value)
Возвращает true, если в одномерном массиве array имеется элемент, равный value, иначе false.

16.	public void reverse(int[]array)
Переворачивает одномерный массив array, то есть меняет местами 0-й и последний, 1-й и предпоследний и т.д. элементы.

17.	public boolean isPalindrome(int[]array)
Возвращает true, если одномерный массив является палиндромом, иначе false. Пустой массив считается палиндромом.

18.	 public int sum(int[][] matrix)
Возвращает сумму чисел, заданных двумерным массивом matrix.

19.	public int max(int[][] matrix)
Возвращает максимальное из чисел, заданных двумерным массивом matrix. Для пустого двумерного массива возвращает Integer.MIN_VALUE.

20.	public int diagonalMax(int[][] matrix)
Возвращает максимальное из чисел, находящихся на главной диагонали квадратного двумерного массива matrix. Для пустого двумерного массива возвращает Integer.MIN_VALUE.

21.	public boolean isSortedDescendant(int[][] matrix)
Возвращает true, если все строки двумерного массива matrix строго упорядочены по убыванию, иначе false. Пустая строка считается упорядоченной. Разные строки массива matrix могут иметь разное количество элементов. При написании метода рекомендуется внутри него вызвать метод из п. 13.  

#Задание 2 

Распакуйте архив “Задание 2.zip“ в Ваш рабочий каталог.  В Вашем проекте после этого должны появиться
●	класс Point в каталоге main  в пакете net.thumbtack.school.figures.v1
●	классы TestEllipse, TestCircle, TestLine и TestPolygon в каталоге test  в пакете net.thumbtack.school.figures.v1

Используя класс Point, создайте в пакете net.thumbtack.school.figures.v1 следующие классы  и методы в них. Напоминаем, что на плоскости OXY ось X направлена вправо, ось Y - вниз. 
Обращаем Ваше внимание, что все поля классов должны иметь атрибут private.


Ellipse 

Эллипс с осями, параллельными осям координат.


1.	public Ellipse(Point center, int xAxis, int yAxis)
Создает Ellipse по координатам центра и размерам осей
 
2.	public Ellipse(int xCenter, int yCenter, int xAxis, int yAxis)
Создает Ellipse по координатам центра и размерам осей

3.	public Ellipse(int xAxis, int yAxis)
Создает Ellipse с центром в точке (0,0) с указанными размерами осей

4.	public Ellipse()
Создает Ellipse с центром в точке (0,0) и единичными размерами осей

5.	public Point getCenter()
	Возвращает центр Ellipse.

6.	public int getXAxis()
Возвращает размер оси Ellipse по X

7.	public int getYAxis()
Возвращает размер оси Ellipse по Y

8.	public void setXAxis(int xAxis)
Устанавливает размер оси Ellipse по X

9.	public void setYAxis(int yAxis)
Устанавливает размер оси Ellipse по Y

10.	public void setCenter(Point center)
	Устанавливает центр Ellipse.

11.	public void moveTo(int x, int y)
	Передвигает Ellipse в точку (x, y).

12.	public void moveTo(Point point)
	Передвигает Ellipse в точку point.

13.	public void moveRel(int dx, int dy)
Передвигает Ellipse на (dx, dy). 

14.	public void resize(int ratio)
Увеличивает размер Ellipse в ratio раз.

15.	public double getArea()
Возвращает площадь Ellipse.

16.	public double getPerimeter()
Возвращает периметр Ellipse. Для вычисления используйте формулу P= 2π * sqrt((XAxis2+YAxis2)/8) 

17.	public boolean isInside(int x, int y) 
Определяет, лежит ли точка (x, y) внутри Ellipse. Если точка лежит на линии эллипса, считается, что она лежит внутри.

18.	 public boolean isInside(Point point)
Определяет, лежит ли точка point внутри Ellipse. Если точка лежит на линии эллипса, считается, что она лежит внутри.
 
19.	 методы equals и hashCode.  
Не пишите эти методы сами, используйте средства IDEA. 






Circle 

Круг (окружность). Координаты центра и радиус целые.


1.	public Circle(Point center, int radius)
	Создает Circle по координатам центра и значению радиуса.

2.	public Circle(int xCenter, int yCenter, int radius)
	Создает Circle по координатам центра и значению радиуса.
 
3.	public Circle(int radius)
	Создает Circle с центром в точке (0,0) указанного радиуса.

4.	public Circle()
Создает Circle с центром в точке (0,0) с радиусом 1.

5.	public Point getCenter()
	Возвращает центр Circle.
  
6.	public int getRadius()
Возвращает радиус Circle.

7.	public void setCenter(Point center)
	Устанавливает центр Circle.

8.	public void setRadius(int radius)
	Устанавливает радиус Circle.

9.	public void moveRel(int dx, int dy)
Передвигает Circle на (dx, dy).
 
10.	public void moveTo(int x, int y)
Передвигает Circle в точку (x, y). 
 
11.	public void moveTo(Point point)
Передвигает Circle в точку point.
 
12.	public void resize(int ratio)
Увеличивает размер круга в ratio раз.

13.	public double getArea()
Возвращает площадь круга.

14.	public double getPerimeter()
Возвращает периметр окружности (длину окружности).
 
15.	 public boolean isInside(int x, int y) 
Определяет, лежит ли точка (x, y) внутри Circle. Если точка лежит на окружности, считается, что она лежит внутри.

16.	 public boolean isInside(Point point)
Определяет, лежит ли точка point внутри Circle. Если точка лежит на окружности, считается, что она лежит внутри.

17.	 методы equals и hashCode.  
Не пишите эти методы сами, используйте средства IDEA.


	
  
Line 

Отрезок прямой.


1.	public Line(Point startPoint, Point endPoint)
Создает Line по координатам двух точек.  

2.	public Line(int xLeft, int yTop, int xRight, int yBottom)
Создает Line по координатам двух точек.  

3.	public Line(Point endPoint)
Создает Line из начала координат в точку endPoint

4.	public Line(int x, int y)
Создает Line из начала координат в точку (x, y)

5.	public Line()
Создает Line из начала координат в точку (1,1)

6.	public Point getStartPoint()
	Возвращает точку начала Line.

7.	public Point getEndPoint()
	Возвращает точку конца Line.

8.	public void setStartPoint(Point point)
	Устанавливает точку начала Line.

9.	public void setEndPoint(Point point)
	Устанавливает точку конца Line.

10.	public double getLength()
	Возвращает длину Line.

11.	public void moveTo(int x, int y)
Конгруэнтно передвигает Line так, чтобы startPoint оказалась в точке (x, y).

12.	public void moveTo(Point point)
Конгруэнтно передвигает Line так, чтобы startPoint оказалась в точке point

13.	public void moveRel(int dx, int dy)
Конгруэнтно передвигает Line на (dx, dy).
 
14.	методы equals и hashCode.  
Не пишите эти методы сами, используйте средства IDEA. Обращаем внимание на то, что Line считаются равными только если попарно совпадают точки Start и End для обеих Line. Две Line, созданные на основе тех же точек, но в ином порядке, равными не считаются.
 

Polygon 

Многоугольник.


1.	public Polygon(Point[] points)
Создает Polygon по координатам точек.  

2.	public Point[] getPoints()
Возвращает координаты точек  Polygon.
  
3.	public void setPoints(Point[] points)
	Устанавливает точки Polygon.

4.	public double getPerimeter()
Возвращает периметр Polygon.
 
5.	public void moveTo(int x, int y)
Конгруэнтно передвигает Polygon так, чтобы начальная точка оказалась в точке (x, y).

6.	public void moveTo(Point point)
Конгруэнтно передвигает Polygon так, чтобы начальная точка оказалась в точке point

7.	public void moveRel(int dx, int dy)
Конгруэнтно передвигает Polygon на (dx, dy).  
 
8.	методы equals и hashCode.  
Не пишите эти методы сами, используйте средства IDEA. Обращаем внимание на то, что Polygon считаются равными только если попарно совпадают точки для обеих Polygon. Два Polygon, созданные на основе тех же точек, но в обратном порядке, равными не считаются.

 


CircleFactory 

Класс, создающий окружности (фабрика окружностей)

1.	public static Circle createCircle(Point center, int radius)
Создает Circle по координатам центра и значению радиуса. 

2.	public static int getCircleCount()
	Возвращает количество Circle, созданных с помощью метода createCircle.

3.	public static void reset()
Устанавливает количество Circle, созданных с помощью метода createCircle, равным 0 (иными словами, реинициализирует фабрику).



Проверьте работу тестов в консольном окне, запишите все классы на сервер (не забудьте изменить текст сообщения в git commit!) и убедитесь, что на сервере все тесты также проходят успешно (см. Занятие 1, п.10-14)


#Задание 3

Не удаляйте классы из Задания 2, они нам еще понадобятся!
Распакуйте архив “Задание 3.zip“ в Ваш рабочий каталог.  В Вашем проекте после этого должны появиться классы TestStringOperations и TestNumberOperations в каталоге test в пакете net.thumbtack.school.base. 

Создайте пакет net.thumbtack.school.base в каталоге main  и в нем следующие классы и методы в них. Все методы будут иметь атрибут static.

При написании методов постарайтесь ”не изобретать велосипед”. Прежде чем писать свою реализацию метода, проверьте, нет ли в классах String, StringJoiner, StringBuilder метода, который решает эту задачу полностью или частично.


StringOperations



1.	public static int getSummaryLength(String[] strings)
Возвращает суммарную длину строк, заданных массивом strings. 

2.	 public static String getFirstAndLastLetterString(String string)
	Возвращает двухсимвольную строку, состоящую из начального и конечного символов заданной строки. 

3.	 public static boolean isSameCharAtPosition(String string1, String string2, int index)
	Возвращает true, если обе строки в позиции index содержат один и тот же символ, иначе false.
 
4.	public static boolean isSameFirstCharPosition(String string1, String string2, char character)
Возвращает true, если в обеих строках первый встреченный символ character находится в одной и той же позиции. Просмотр строк ведется от начала.
 
5.	public static boolean isSameLastCharPosition(String string1, String string2, char character)
Возвращает true, если в обеих строках первый встреченный символ character находится в одной и той же позиции. Просмотр строк ведется от конца.

6.	public static boolean isSameFirstStringPosition(String string1, String string2, String str)
Возвращает true, если в обеих строках первая встреченная подстрока str начинается в одной и той же позиции. Просмотр строк ведется от начала.
 
7.	public static boolean isSameLastStringPosition(String string1, String string2, String str)
Возвращает true, если в обеих строках первая встреченная подстрока str начинается в одной и той же позиции. Просмотр строк ведется от конца.
 
8.	public static boolean isEqual(String string1, String string2)
Возвращает true, если строки равны.
 
9.	public static boolean isEqualIgnoreCase(String string1, String string2)
Возвращает true, если строки равны без учета регистра (например, строки “abc” и “aBC” в этом смысле равны).
 
10.	 public static boolean isLess(String string1, String string2)
Возвращает true, если строка string1 меньше строки string2.
 
11.	 public static boolean isLessIgnoreCase(String string1, String string2)
Возвращает true, если строка string1 меньше строки string2 без учета регистра (например, строка “abc” меньше строки “ABCd” в этом смысле). 

12.	 public static String concat(String string1, String string2)
Возвращает строку, полученную путем сцепления двух строк.

13.	 public static boolean isSamePrefix(String string1, String string2, String prefix)
Возвращает true, если обе строки string1 и string2 начинаются с одной и той же подстроки prefix.

14.	 public static boolean isSameSuffix(String string1, String string2, String suffix)
Возвращает true, если обе строки string1 и string2 заканчиваются одной и той же подстрокой suffix.

15.	 public static String getCommonPrefix(String string1, String string2)
Возвращает самое длинное общее “начало” двух строк. Если у строк нет общего начала, возвращает пустую строку.

16.	public static String reverse(String string)
Возвращает перевернутую строку.

17.	 public static boolean isPalindrome(String string)
Возвращает true, если строка является палиндромом, то есть читается слева направо так же, как и справа налево. 

18.	 public static boolean isPalindromeIgnoreCase(String string)
Возвращает true, если строка является палиндромом, то есть читается слева направо так же, как и справа налево, без учета регистра.

19.	 public static String getLongestPalindromeIgnoreCase(String[] strings)
Возвращает самый длинный палиндром (без учета регистра) из массива заданных строк. Если в массиве нет палиндромов, возвращает пустую строку.

20.	 public static boolean hasSameSubstring(String string1, String string2, int index, int length)
Возвращает true, если обе строки содержат один и тот же фрагмент длиной length, начиная с позиции index.

21.	public static boolean isEqualAfterReplaceCharacters(String string1, char replaceInStr1, char replaceByInStr1, String string2, char replaceInStr2, char replaceByInStr2)
Возвращает true, если после замены в string1 всех вхождений replaceInStr1 на replaceByInStr1 и замены в string2 всех вхождений replaceInStr2 на replaceByInStr2 полученные строки равны.

22.	public static boolean isEqualAfterReplaceStrings(String string1, String replaceInStr1, String replaceByInStr1, String string2, String replaceInStr2, String replaceByInStr2)
Возвращает true, если после замены в string1 всех вхождений строки replceInStr1 на replaceByInStr1 и замены в string2 всех вхождений replceInStr2 на replaceByInStr2 полученные строки равны.

23.	 public static boolean isPalindromeAfterRemovingSpacesIgnoreCase(String string)
Возвращает true, если строка после выбрасывания из нее всех пробелов является палиндромом, без учета регистра.

24.	 public static boolean isEqualAfterTrimming(String string1, String string2)
Возвращает true, если две строки равны, если не принимать во внимание все пробелы в начале и конце каждой строки.

25.	 public static String makeCsvStringFromInts(int[] array)
Для заданного массива целых чисел создает текстовую строку, в которой числа разделены знаком “запятая” (т.н. формат CSV - comma separated values). Для пустого массива возвращается пустая строка.

26.	 public static String makeCsvStringFromDoubles(double[] array)
Для заданного массива вещественных чисел создает текстовую строку, в которой числа разделены знаком “запятая”, причем каждое число записывается с двумя знаками после точки. Для пустого массива возвращается пустая строка.

27.	 public static StringBuilder makeCsvStringBuilderFromInts(int[] array)
	То же, что и в упражнении 25, но возвращает StringBuilder.

28.	 public static StringBuilder makeCsvStringBuilderFromDoubles(double[] array)
То же, что и в упражнении 26, но возвращает StringBuilder.

29.	 public static StringBuilder removeCharacters(String string, int[] positions)
Удаляет из строки символы, номера которых заданы в массиве positions. Предполагается, что будут передаваться только допустимые номера, упорядоченные по возрастанию. Номера позиций для удаления указаны для исходной строки. Возвращает полученный в результате StringBuilder.

30.	 public static StringBuilder insertCharacters(String string, int[] positions, char[] characters)
Вставляет в строку символы. Массивы positions и characters имеют одинаковую длину. В позицию positions[i] в исходной строке string вставляется символ characters[i]. Если в массиве positions один и тот же номер позиции повторяется несколько раз, это значит, что в указанную позицию вставляется несколько символов, в том порядке, в котором они перечислены в массиве characters. Предполагается, что будут передаваться только допустимые номера, упорядоченные по неубыванию.  Возвращает полученный в результате StringBuilder. 


NumberOperations

1.	public static Integer find(int[] array, int value)
Ищет в массиве array первый элемент, значение которого равно value. Если такое значение найдено, возвращает его позицию в массиве array, в противном случае возвращает null.

2.	public static Integer find(double[] array, double value, double eps)
Ищет в массиве array первый элемент, значение которого по модулю не отличается от value более чем на eps. Если такое значение найдено, возвращает его позицию в массиве array, в противном случае возвращает null.

3.	public static Double calculateDensity(double weight, double volume, double min, double max)
Вычисляет плотность вещества по формуле weight / volume. Если получившееся значение не превышает max и не меньше min, возвращает полученное значение, в противном случае возвращает null.

4.	public static Integer find(BigInteger[] array, BigInteger value)
Ищет в массиве array первый элемент, значение которого равно value. Если такое значение найдено, возвращает его позицию в массиве array, в противном случае возвращает null.


5.	public static BigDecimal calculateDensity(BigDecimal weight, BigDecimal volume, BigDecimal min, BigDecimal max)
Вычисляет плотность вещества по формуле weight / volume. Если получившееся значение не превышает max и не меньше min, возвращает полученное значение, в противном случае возвращает null.


Проверьте работу тестов в консольном окне, запишите все классы на сервер (не забудьте изменить текст сообщения в git commit!) и убедитесь, что на сервере все тесты также проходят успешно (см. Занятие 1, п.10-14)




#Задание 4

Распакуйте архив “Задание4.zip” в Ваш рабочий каталог.  В Вашем проекте после этого должны появиться
●	классы TestFilledCircle, TestFilledEllipse и TestFilledPolygon в каталоге test в пакете net.thumbtack.school.figures.v1

Используя разработанные в задании 2 классы Rectangle и Circle, создайте в пакете net.thumbtack.school.figures.v1 нижеследующие классы закрашенных фигур. При разработке этих классов настоятельно рекомендуется подумать, какие нижеприведенные методы должны быть в них действительно написаны, а какие можно наследовать от базового класса.
Напоминаем, что все поля классов должны иметь атрибут private.
В этом Задании закраска будет задаваться цветом. Цвет закраски - целое число, номером в некоторой палитре цветов. 


FilledEllipse

Закрашенный эллипс с осями, параллельными осям координат.


1.	public FilledEllipse(Point center, int xAxis, int yAxis, int color)
Создает FilledEllipse по координатам центра, размерам осей и цвету
 
2.	public FilledEllipse(int xCenter, int yCenter, int xAxis, int yAxis, int color)
Создает FilledEllipse по координатам центра, размерам осей и цвету

3.	public FilledEllipse(int xAxis, int yAxis, int color)
Создает FilledEllipse с центром в точке (0,0) с указанными размерами осей и цветом

4.	public FilledEllipse(int color)
Создает FilledEllipse с центром в точке (0,0) с единичными размерами осей и указанным цветом

5.	public Point getCenter()
	Возвращает центр FilledEllipse.

6.	public int getXAxis()
Возвращает размер оси FilledEllipse по X

7.	public int getYAxis()
Возвращает размер оси FilledEllipse по Y

8.	public void setXAxis(int xAxis)
Устанавливает размер оси FilledEllipse по X

9.	public void setYAxis(int yAxis)
Устанавливает размер оси FilledEllipse по Y

10.	public void setCenter(Point center)
Устанавливает центр FilledEllipse.
 
11.	public int getColor()
	Возвращает цвет FilledEllipse.

12.	public void setColor(int color)
	Устанавливает цвет FilledEllipse.

13.	public void moveTo(int x, int y)
	Передвигает FilledEllipse в точку (x, y).

14.	public void moveTo(Point point)
	Передвигает FilledEllipse в точку point.

15.	public void moveRel(int dx, int dy)
	Передвигает FilledEllipse на (dx, dy).

16.	public void resize(int ratio)
Увеличивает размер Ellipse в ratio раз.

17.	public double getArea()
Возвращает площадь FilledEllipse.

18.	public double getPerimeter()
Возвращает периметр FilledEllipse. Для вычисления используйте формулу P= 2π * sqrt((XAxis2+YAxis2)/8) 

19.	public boolean isInside(int x, int y) 
Определяет, лежит ли точка (x, y) внутри FilledEllipse. Если точка лежит на линии эллипса, считается, что она лежит внутри.

20.	 public boolean isInside(Point point)
Определяет, лежит ли точка point внутри FilledEllipse. Если точка лежит на линии эллипса, считается, что она лежит внутри.
 
21.	 методы equals и hashCode.  
Не пишите эти методы сами, используйте средства IDEA. 






FilledCircle 

Закрашенный круг

1.	public FilledCircle(Point center, int radius, int color)
	Создает FilledCircle по координатам центра, значению радиуса и цвету.

2.	public FilledCircle(int xCenter, int yCenter, int radius, int color)
	Создает FilledCircle по координатам центра, значению радиуса и цвету.
 
3.	public FilledCircle(int radius, int color)
	Создает FilledCircle  с центром в точке (0, 0) с указанными радиусом и цветом.

4.	public FilledCircle(int color)
Создает FilledCircle  с центром в точке (0, 0) с радиусом 1 и указанным цветом.
 
5.	public FilledCircle()
Создает FilledCircle  с центром в точке (0, 0) с радиусом 1 и цветом 1.

6.	public Point getCenter()
	Возвращает координаты центра FilledCircle.
  
7.	public int getRadius()
Возвращает радиус FilledCircle.

8.	public void setCenter(Point center)
	Устанавливает координаты центра FilledCircle.

9.	public void setRadius(int radius)
	Устанавливает радиус FilledCircle.

10.	public int getColor()
	Возвращает цвет FilledCircle.

11.	public void setColor(int color)
	Устанавливает цвет FilledCircle.

12.	public void moveTo(int x, int y)
Передвигает FilledCircle в точку (x, y). 

13.	public void moveTo(Point point)
Передвигает FilledCircle в точку point. 

14.	public void moveRel(int dx, int dy)
	Передвигает FilledCircle на (dx, dy).

15.	 public double getArea()
Возвращает площадь круга для FilledCircle

16.	public double getPerimeter()
 Возвращает периметр окружности для FilledCircle

17.	public boolean isInside(int x, int y) 
Определяет, лежит ли точка (x, y) внутри FilledCircle. Если точка лежит на линии, считается, что она лежит внутри.

18.	public boolean isInside(Point point)
Определяет, лежит ли точка point внутри FilledCircle. Если точка лежит на линии, считается, что она лежит внутри.

19.	методы equals и hashCode.  
Не пишите эти методы сами, используйте средства IDEA. 
FilledPolygon 

Закрашенный многоугольник.


1.	public FilledPolygon(Point[] points, int color)
Создает FilledPolygon по координатам точек.  

2.	public Point[] getPoints()
Возвращает координаты точек  FilledPolygon.
  
3.	public void setPoints(Point[] points)
Устанавливает точки FilledPolygon. 

4.	public int getColor()
Возвращает цвет  FilledPolygon.
 
5.	public void setColor(int color)
Устанавливает  FilledPolygon.

6.	public double getPerimeter()
Возвращает периметр FilledPolygon.
 
7.	public void moveTo(int x, int y)
Конгруэнтно передвигает FilledPolygon так, чтобы начальная точка оказалась в точке (x, y).

8.	public void moveTo(Point point)
Конгруэнтно передвигает FilledPolygon так, чтобы начальная точка оказалась в точке point

9.	public void moveRel(int dx, int dy)
Конгруэнтно передвигает FilledPolygon на (dx, dy).  
 

10.	методы equals и hashCode.  
Не пишите эти методы сами, используйте средства IDEA. Обращаем внимание на то, что FilledPolygon считаются равными только если попарно совпадают точки для обеих FilledPolygon. Две FilledPolygon, созданные на основе тех же точек, но в обратном порядке, равными не считаются.

 



	
Проверьте работу тестов в консольном окне, запишите все классы на сервер (не забудьте изменить текст сообщения в git commit!) и убедитесь, что на сервере все тесты также проходят успешно (см. Занятие 1, п.10-14)


#Задание 5

Распакуйте архив “Задание 5.zip” в Ваш рабочий каталог.  В Вашем проекте после этого должны появиться классы TestFigure, TestClosedFigure, TestFilled, TestHasPerimeter, TestCircle, TestEllipse, TestLine, TestPolygon, TestFilledEllipse, TestFilledCircle, TestFilledPolygon и TestTypes в каталоге  test в пакете net.thumbtack.school.figures.v2

На этом занятии мы создадим вторую версию наших классов геометрии. 
Создайте пакет net.thumbtack.school.figures.v2 и скопируйте в него  все классы  из пакета net.thumbtack.school.figures.v1. Не забудьте изменить в каждом классе package!

Создайте в main пакет net.thumbtack.school.figures.v2 абстрактный базовый класс Figure. Он будет суперклассом для всех классов фигур.
Отметим, что у нас есть замкнутые фигуры (Ellipse, Circle, Polygon и их наследники) и незамкнутые (Line). Замкнутые фигуры имеют площадь и могут быть закрашены. Незамкнутые фигуры площади не имеют и закрасить их нельзя. Создадим поэтому еще один абстрактный класс ClosedFigure, сделав его наследником от Figure. 

Теперь займемся созданием интерфейсов, используемых нашими классами.

Во-первых, все фигуры можно перемещать на плоскости.

Добавьте в пакет net.thumbtack.school.figures.v2 интерфейс Movable, описав в нем следующие методы

1.	void moveTo(int x, int y);
Передвигает фигуру так,  так, чтобы его базовая точка (левый верхний угол или центр соответственно)  оказалась в точке (x,y)

2.	void moveTo(Point point);
Передвигает фигуру так,  так, чтобы его базовая точка (левый верхний угол или центр соответственно)  оказалась в точке point

3.	void moveRel(int dx, int dy);
Передвигает фигуру на (dx, dy)

Во-вторых, все замкнутые фигуры имеют периметр. 
Добавьте в пакет net.thumbtack.school.figures.v2 интерфейс HasPerimeter, описав в нем следующий метод

1.	double getPerimeter();
Возвращает периметр фигуры. 

В-третьих, отметим, что у нас есть закрашенные фигуры. Для них можно создать интерфейс Filled. Добавьте его в пакет net.thumbtack.school.figures.v2 и опишите в нем следующие методы

1.	void setColor(int color);
Устанавливает цвет закраски фигуры

2.	int getColor();
Возвращает цвет закраски фигуры


Сделайте , чтобы Ваши классы фигур имплементировали эти интерфейсы. Подумайте, в каком классе нужно имплементировать тот или иной интерфейс. Может ли класс Point имплементировать какие-то из этих интерфейсов ? Если да - сделайте, чтобы он их имплементировал.
Пакет net.thumbtack.school.figures.v2 теперь содержит конкретные, абстрактные классы и интерфейсы. Имеет смысл создать в нем подпакеты.
Создайте подпакет net.thumbtack.school.figures.v2.iface и переместите туда интерфейсы Movable, Filled и HasPerimeter.

Оказывается, метод public void moveTo(Point point) во всех классах имеет один и тот же вид (если у Вас это не так, подумайте, как сделать, чтобы это было именно так!). Перенесем поэтому его имплементацию непосредственно в интерфейс Movable, добавив перед его описанием служебное слово default и удалим его из всех классов, в которых он был. Такая возможность существует, начиная с Java 1.8. Теперь во всех классах будет использоваться его версия из интерфейса. В случае необходимости мы всегда можем переопределить этот метод в любом классе. 

Разработанные интерфейсы могут быть имплементированы не только фигурами, но и другим типами объектов. Например, интерфейс Filled может быть имплементирован любыми объектами, которые можно закрасить, интерфейс Movable - объектами, которые могут передвигаться и т.д. Поэтому становится ясным, что наш пакет с интерфейсами должен находиться не внутри пакета net.thumbtack.school.figures, а выше, лежать непосредственно в пакете net.thumbtack.school . Измените его имя на net.thumbtack.school.iface.v2 (Refactor-Rename)

Создайте 3-4 новых класса, имплементирующих один или несколько вышеуказанных интерфейсов. Напишите для них конструкторы, сеттеры и геттеры, методы equals и hashCode. Разместите эти классы в пакете net.thumbtack.school.misc.v2. Напишите тесты (в том же пакете в каталоге test) для этих классов и проверьте их работу.

Проверьте работу тестов в консольном окне, запишите все классы на сервер (не забудьте изменить текст сообщения в git commit!) и убедитесь, что на сервере все тесты также проходят успешно (см. Занятие 1, п.10-14)







